package abp.project.v2Videojuegos.m03uf5ra1;

public class Personaje {
    private String nombre;
    private int year;

    public Personaje(String nombre, int year) {
        setNombre(nombre);
        setYear(year);
    }

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

    @Override
    public String toString() {
        return "Personaje {" + "nombre = '" + getNombre() + '\'' + ", year = '" + getYear() + '}';
    }
}
