package abp.project.v2Videojuegos.m03uf4;

public class PersonajeAventura extends Persona{

    public PersonajeAventura(String nombre, String tipo, int year) {
        super(nombre, tipo, year);
    }

    @Override
    public void hablar(){
        System.out.println("Soy Aventura");
}
    @Override
    public void jugar(){
        System.out.println("d=||======D");
    }

}
