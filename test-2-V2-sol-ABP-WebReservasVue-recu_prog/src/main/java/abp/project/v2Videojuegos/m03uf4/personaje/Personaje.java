package abp.project.v2Videojuegos.m03uf4.personaje;
/*
Define una clase base llamada Personaje con losa tributos de la imagen.
 Implementa sus métodos si los tiene. (1 punto)
* */
public class Personaje {
    public String nombre;
    public int year;

    public Personaje(String nombre, int year) {
        this.nombre = nombre;
        this.year = year;
    }

    // Getters and Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public void habla(){

    }

    public void juega(){

    }


    @Override
    public String toString() {
        return "Personaje{" + "nombre=" + nombre + ", year=" + year + '}';
    }
}
