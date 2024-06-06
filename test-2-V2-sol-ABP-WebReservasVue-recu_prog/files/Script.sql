CREATE SCHEMA v2;
USE v2;
CREATE TABLE Personajes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    anio_creacion INT NOT NULL
);

INSERT INTO Personajes (nombre, anio_creacion) VALUES
('Mario', 1981),
('Link', 1986),
('Samus', 1986),
('Sonic', 1991),
('Lara Croft', 1996),
('Pikachu', 1996),
('Master Chief', 2001),
('Kratos', 2005),
('Geralt', 2007),
('Aloy', 2017);

DELIMITER //
CREATE FUNCTION calcular_diferencia_anios(nombre1 VARCHAR(100), nombre2 VARCHAR(100))
RETURNS INT
DETERMINISTIC
BEGIN
    DECLARE anio1 INT;
    DECLARE anio2 INT;
    SELECT anio_creacion INTO anio1 FROM Personajes WHERE nombre = nombre1;
    SELECT anio_creacion INTO anio2 FROM Personajes WHERE nombre = nombre2;
    RETURN ABS(anio1 - anio2);
END //
DELIMITER ;

CREATE VIEW VistaPersonajes AS
SELECT * FROM Personajes;


DELIMITER //
CREATE PROCEDURE actualizar_anio_creacion(
    IN nombre_personaje VARCHAR(100),
    IN nuevo_anio INT
)
BEGIN
    UPDATE Personajes SET anio_creacion = nuevo_anio WHERE nombre = nombre_personaje;
END //
DELIMITER ;
