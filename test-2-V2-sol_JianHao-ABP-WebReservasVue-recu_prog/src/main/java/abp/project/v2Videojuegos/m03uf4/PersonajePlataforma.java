package abp.project.v2Videojuegos.m03uf4;

public class PersonajePlataforma extends Persona{

    public PersonajePlataforma(String nombre, String tipo, int year) {
        super(nombre, tipo, year);
    }
    
    @Override
    public void hablar(){
        System.out.println("Soy plataforma");
    }
    
    @Override
    public void jugar(){
        System.out.println("---___--_-_-");
    }
}
