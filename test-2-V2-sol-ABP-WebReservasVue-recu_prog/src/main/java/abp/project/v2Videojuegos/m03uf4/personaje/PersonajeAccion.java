package abp.project.v2Videojuegos.m03uf4.personaje;

public class PersonajeAccion extends Personaje{


    public PersonajeAccion(String nombre, int year) {
        super(nombre, year);
    }

    //Cuando habla() dice: Soy Acción
    @Override
    public void habla(){
        System.out.println("Soy Acción");
    }

    //y no juega()
    @Override
    public void juega(){
        System.out.println("No juego");
    }
    @Override
    public String toString() {
        return "Personaje Accion {" + "nombre=" + nombre + ", year=" + year + '}';
    }
}
