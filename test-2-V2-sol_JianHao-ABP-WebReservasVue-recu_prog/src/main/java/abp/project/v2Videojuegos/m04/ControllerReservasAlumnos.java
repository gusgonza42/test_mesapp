package abp.project.v2Videojuegos.m04;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ControllerReservasAlumnos {

    //Esta url (GET) http://localhost:8081/personajes debe devolver una Lista de objetos tipo Personaje
    @GetMapping("/personajes")
    public ResponseEntity getPersonajes() {
        List<Personaje> personajes = null;
       /* TODO: DESCOMENTA ESTO CUANDO TENGAS CREADA LA CLASE PERSONAJE
        personajes.add(new Personaje("Mario", 1981));
        personajes.add(new Personaje("Link", 1986));
        personajes.add(new Personaje("Samus", 1986));
        personajes.add(new Personaje("Sonic", 1991));
        personajes.add(new Personaje("Lara_Croft", 1996));
        personajes.add(new Personaje("Pikachu", 1996));
        personajes.add(new Personaje("Master_Chief", 2001));
        personajes.add(new Personaje("Kratos", 2005));
        personajes.add(new Personaje("Geralt", 2007));
        personajes.add(new Personaje("Aloy", 2017));
        */

        return ResponseEntity.ok(personajes); //No tocar esta línea
    }


    //Esta url (PUT) http://localhost:8081/personaje debe añadir un Personaje a la base de datos
    @PutMapping("/personaje")
    public ResponseEntity putPersonajes(@RequestBody Personaje personaje) {

        //TODO: inserta un personaje a la base de datos.

        return ResponseEntity.ok().build(); //No tocar esta línea
    }
}
