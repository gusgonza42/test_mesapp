package abp.project.v2Videojuegos.m03uf5ra1;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        /*
        Kratos 2005
        Lara_Croft 1996
        Link 1986
        Geralt 2007
        Samus 1986
        Master_Chief 2001
        Aloy 2017
        Sonic 1991
        Pikachu 1996
        Mario 1981
        */
        //Crea un Mapa donde alma cenes como clave el año del personaje y como valor el nombre del personaje de la lista de la imagen.

        //Crear el mapa para almacenar los personajes y sus años de creación.
        Map<Integer, String> personajes = new HashMap<>();
        personajes.put(2005, "Kratos");
        personajes.put(1996, "Lara_Croft");
        personajes.put(1986, "Link");
        personajes.put(2007, "Geralt");
        personajes.put(1986, "Samus");
        personajes.put(2001, "Master_Chief");
        personajes.put(2017, "Aloy");
        personajes.put(1991, "Sonic");
        personajes.put(1996, "Pikachu");
        personajes.put(1981, "Mario");
       // Crear un TreeMap para ordenar el mapa por las claves (años)
        Map<Integer, String> personajesOrdenados = new TreeMap<>(personajes);

        //Imprimir el mapa
        for (Map.Entry<Integer, String> entry : personajesOrdenados.entrySet()) {
            System.out.println("Año: " + entry.getKey() + ", Nombre: " + entry.getValue());
        }

        // Crear una lista para almacenar los personajes
        List<Personaje> personajesList = new ArrayList<>();

        // Añadir personajes a la lista
        personajesList.add(new Personaje("Kratos", 2005));
        personajesList.add(new Personaje("Lara_Croft", 1996));
        personajesList.add(new Personaje("Link", 1986));
        personajesList.add(new Personaje("Geralt", 2007));
        personajesList.add(new Personaje("Samus", 1986));
        personajesList.add(new Personaje("Master_Chief", 2001));
        personajesList.add(new Personaje("Aloy", 2017));
        personajesList.add(new Personaje("Sonic", 1991));
        personajesList.add(new Personaje("Pikachu", 1996));
        personajesList.add(new Personaje("Mario", 1981));

        // Ordenar la lista por año de creación
        Collections.sort(personajesList, Comparator.comparingInt(Personaje::getYear));

        // Imprimir la lista ordenada
        for (Personaje personaje : personajesList) {
            System.out.println(personaje);
        }

    }
}
