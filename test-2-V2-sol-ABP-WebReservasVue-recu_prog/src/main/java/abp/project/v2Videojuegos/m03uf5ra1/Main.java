package abp.project.v2Videojuegos.m03uf5ra1;

import java.util.*;

/**
 * Clase principal que contiene el método main.
 */
public class Main {

    /**
     * Método principal que se ejecuta al iniciar el programa.
     * @param args argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        // Crear un HashMap para almacenar los personajes y sus años de creación.
        HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(2005, "Kratos");
        mapa.put(1996, "Lara_Croft");
        mapa.put(1986, "Link");
        mapa.put(2007, "Geralt");
        mapa.put(1986, "Samus");
        mapa.put(2001, "Master_Chief");
        mapa.put(2017, "Aloy");
        mapa.put(1991, "Sonic");
        mapa.put(1996, "Pikachu");
        mapa.put(1981, "Mario");

        // Imprimir el mapa.
        System.out.println("Informacion: " + mapa);

        // Crear un TreeMap a partir del HashMap para ordenar los personajes por año de creación.
        TreeMap<Integer, String> mapaOrdenado = new TreeMap<>(mapa);
        System.out.println("Mapa ordenada por año: " + mapaOrdenado);

        // Crear una lista de personajes y ordenarla por año de creación.
        List<Personaje> listaOrdenada = new ArrayList<>();
        for (Map.Entry<Integer, String> entry : mapa.entrySet()) {
            listaOrdenada.add(new Personaje(entry.getValue(), entry.getKey()));
        }
        listaOrdenada.sort(Comparator.comparing(Personaje::getYear));

        // Imprimir la lista de personajes ordenada por año de creación.
        System.out.println("Collecion ordenada por año: ");
        for (Personaje per : listaOrdenada) {
            System.out.println(per);
        }
    }
}