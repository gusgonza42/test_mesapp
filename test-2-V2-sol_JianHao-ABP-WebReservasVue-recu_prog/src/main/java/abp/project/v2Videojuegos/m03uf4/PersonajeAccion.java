package abp.project.v2Videojuegos.m03uf4;

public class PersonajeAccion extends Persona{

    public PersonajeAccion(String nombre, String tipo, int year) {
        super(nombre, tipo, year);
    }
    @Override
    public void hablar(){
        System.out.println("Soy Acción");
    }

    @Override
    public void jugar(){
        System.out.println("No juega");
    }
}
