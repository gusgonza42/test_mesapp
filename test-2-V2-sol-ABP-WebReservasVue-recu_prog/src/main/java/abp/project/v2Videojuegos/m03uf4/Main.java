package abp.project.v2Videojuegos.m03uf4;

import abp.project.v2Videojuegos.m03uf4.personaje.Personaje;
import abp.project.v2Videojuegos.m03uf4.personaje.PersonajeAccion;
import abp.project.v2Videojuegos.m03uf4.personaje.PersonajeAventura;
import abp.project.v2Videojuegos.m03uf4.personaje.PersonajePlataforma;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /*
    3. Agrega todos los objetos de la imagen en una colección en el main. (1 punto)
     */
    public static void main(String[] args) {

        //creamos una funcion donde agrega todos los objetos de la imagen en una colección
        ArrayList<Personaje> coleccionPersonajes = agregarTodosObjetosPersonajes();
        //Imprimir la colección
       /* for (Personaje personaje : coleccionPersonajes) {
            System.out.println(personaje);
        }*/
        //4. Creacion del menu y su interaccion con el usuario
        menu(coleccionPersonajes);
    }

    private static void menu(ArrayList<Personaje> coleccionPersonajes) {
        //creamos el menu principal del
        boolean run = true; //variable para controlar el bucle
        Scanner scanner = new Scanner(System.in);
        while (run) {
            menuPrincipal();
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    //Seleccionar personaje
                    seleccionarPersonaje(coleccionPersonajes);
                    break;
                case 2:
                    //Salir
                    run = false;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    private static void seleccionarPersonaje(ArrayList<Personaje> coleccionPersonajes) {
        //Seleccionar personaje
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecciona un personaje:");
        for (int i = 0; i < coleccionPersonajes.size(); i++) {
            System.out.println((i + 1) + ") " + coleccionPersonajes.get(i).getNombre() + coleccionPersonajes.get(i).getYear());
        }
        int opcion = scanner.nextInt() - 1;
        if (opcion >= 1 && opcion <= coleccionPersonajes.size()) {
            Personaje personajeSelecionado = coleccionPersonajes.get(opcion);
            boolean continuarMenuPersonaje = true;
            while (continuarMenuPersonaje) {
                // Mostrar el menú para el personaje seleccionado
                menuParaPersonajeSelecionado(personajeSelecionado);
            }
        } else {
            System.out.println("Opción no válida");
        }
    }

    private static void menuParaPersonajeSelecionado(Personaje personajeSelecionado){
        //Mostrar el menú para el personaje seleccionado para mostrar la seleccion de perosnaje
        System.out.println("Menú Personaje: " + personajeSelecionado.getNombre() + " " + personajeSelecionado.getYear());
        System.out.println("""
                Menú UF4-Personaje
                1) Hablar.
                2) Jugar.
                3) Atrás.
                """);
    }

    private static void menuPrincipal() {
        System.out.println("""
                Menú UF4
                1) Seleciona Personaje.
                2) Salir.
                """);
    }

    private static ArrayList<Personaje> agregarTodosObjetosPersonajes() {
        //Añade todos los objetos de la imagen en una colección
        ArrayList<Personaje> personajesObjects = new ArrayList<>();
        //Agregamos los personajes de Plataformas
        personajesObjects.add(new PersonajePlataforma("Mario", 1981));
        personajesObjects.add(new PersonajePlataforma("Link", 1986));
        personajesObjects.add(new PersonajePlataforma("Sonic", 1991));
        //Agregamos los personajes de Acción
        personajesObjects.add(new PersonajeAventura("Lara Croft", 1996));
        personajesObjects.add(new PersonajeAventura("Nathan Drake", 2007));
        personajesObjects.add(new PersonajeAventura("Geralt", 2007));
        //Agregar los personajes de Acción
        personajesObjects.add(new PersonajeAccion("Master Chief", 2001));
        personajesObjects.add(new PersonajeAccion("Kratos", 2005));
        personajesObjects.add(new PersonajeAccion("Aloy", 2017));
        return personajesObjects;
    }
}

/*

 */
