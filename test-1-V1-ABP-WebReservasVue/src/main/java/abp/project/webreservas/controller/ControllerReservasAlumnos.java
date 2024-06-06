package abp.project.webreservas.controller;

import abp.project.webreservas.modelo.Reserva;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ControllerReservasAlumnos {

    //Esta url (GET) http://localhost:8081/reservas debe devolver una Lista de objetos tipo Reserva
    @GetMapping("/reservas")
    public ResponseEntity getReservas() {
        List<Reserva> reservas = null;

        //TODO: recupera las reservas utilizando la vista CurrentReservations con el parámetro "en curso".

        return ResponseEntity.ok(reservas); //No tocar esta línea
    }


    //Esta url (POST) http://localhost:8081/reserva debe añadir una reserva a la base de datos
    @PutMapping("/reserva")
    public ResponseEntity postReserva(@RequestBody Reserva reserva) {

        //TODO: inserta la Reserva a la base de datos.

        return ResponseEntity.ok().build(); //No tocar esta línea
    }
}
