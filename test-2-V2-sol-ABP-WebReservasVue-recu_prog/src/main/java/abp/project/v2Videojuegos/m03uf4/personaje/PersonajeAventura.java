package abp.project.v2Videojuegos.m03uf4.personaje;

public class PersonajeAventura extends Personaje{

    public PersonajeAventura(String nombre, int year) {
        super(nombre, year);
    }
@Override
    //Cuando habla() dice: Soy Aventura
    public void habla(){
        System.out.println("Soy Aventura");
    }
@Override
    //Cuando juega() imprime d=||======D
    public void juega(){
        System.out.println("d=||======D");
    }

}
