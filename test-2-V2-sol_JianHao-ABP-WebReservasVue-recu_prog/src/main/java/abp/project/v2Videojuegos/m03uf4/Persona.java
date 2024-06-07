package abp.project.v2Videojuegos.m03uf4;

public class Persona {
    public String nombre;
    public String tipo;
    public int year;


    public Persona(String nombre, String tipo, int year){
        this.nombre = nombre;
        this.tipo = tipo;
        this.year = year;
    }
    public void hablar(){
    }
    public void jugar(){
    }

    public String getNombre() {
        return nombre;
    }
    public String getTipo(){
        return tipo;
    }
    public int getYear(){
        return year;
    }


}
