CREATE SCHEMA reservadb;

USE reservadb;

CREATE TABLE Reserves (
    id INT,
    nom VARCHAR(100) NOT NULL,
    comensals INT NOT NULL,
    data DATE NOT NULL,
    comentaris TEXT,
    estat VARCHAR(50) default 'pendent'
);


CREATE VIEW CurrentReservations AS
SELECT *
FROM Reserves
WHERE DATE(data) = CURDATE();

DELIMITER $$
CREATE FUNCTION ActualitzarEstat(reserva_id INT, nou_estat VARCHAR(50)) 
RETURNS VARCHAR(50)
BEGIN
    DECLARE estat_actual VARCHAR(50);

    IF reserva_id = 0 OR nou_estat = '' THEN
        RETURN 'ERROR';
    END IF;

    SELECT estat INTO estat_actual FROM Reserves WHERE id = reserva_id;
    IF estat_actual IS NULL THEN
        RETURN 'ERROR';
    END IF;

    IF estat_actual = nou_estat THEN
        RETURN 'ERROR';
    END IF;

    UPDATE Reserves SET estat = nou_estat WHERE id = reserva_id;

    RETURN 'OK';
END$$
DELIMITER ;


DELIMITER $$
CREATE PROCEDURE checkReserves(IN estat_actual VARCHAR(50))
BEGIN
    DECLARE num_reservas_hoy INT;

    IF estat_actual = '' THEN
    
		SELECT COUNT(*) INTO num_reservas_hoy FROM CurrentReservations;
		IF num_reservas_hoy = 0 THEN
			SELECT 'No hay reservas para hoy';
			LEAVE checkReserves;
		END IF;

		SELECT *
		FROM Reservas
		WHERE estat = estat_actual AND DATE(data) = CURDATE();
    END IF;
END$$
DELIMITER ;



