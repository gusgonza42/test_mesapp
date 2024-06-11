package abp.project.v2Videojuegos.m03uf4;

import abp.project.v2Videojuegos.m03uf4.personaje.Personaje;
import abp.project.v2Videojuegos.m03uf4.personaje.PersonajeAccion;
import abp.project.v2Videojuegos.m03uf4.personaje.PersonajeAventura;
import abp.project.v2Videojuegos.m03uf4.personaje.PersonajePlataforma;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Personaje> coleccionPersonajes = agregarTodosObjetosPersonajes();
        menu(coleccionPersonajes);
    }

    private static void menu(ArrayList<Personaje> coleccionPersonajes) {
        boolean run = true;
        while (run) {
            menuPrincipal();
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    seleccionarPersonaje(coleccionPersonajes);
                    break;
                case 2:
                    run = false;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    private static void seleccionarPersonaje(ArrayList<Personaje> coleccionPersonajes) {
        int opcion;
        do {
            System.out.println("Selecciona un personaje:");
            for (int i = 0; i < coleccionPersonajes.size(); i++) {
                System.out.println((i + 1) + ") " + coleccionPersonajes.get(i).getNombre() + coleccionPersonajes.get(i).getYear());
            }
            opcion = scanner.nextInt();
            if (opcion <= 0 || opcion > coleccionPersonajes.size()) {
                System.out.println("Opción no válida");
            }
        } while (opcion <= 0 || opcion > coleccionPersonajes.size());

        Personaje personajeSelecionado = coleccionPersonajes.get(opcion - 1);
        boolean continuarMenuPersonaje = true;
        while (continuarMenuPersonaje) {
            menuParaPersonajeSelecionado(personajeSelecionado);
            int opcionMenuPersonaje = scanner.nextInt();
            switch (opcionMenuPersonaje) {
                case 1:
                    personajeSelecionado.habla();
                    break;
                case 2:
                    personajeSelecionado.juega();
                    break;
                case 3:
                    continuarMenuPersonaje = false;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    private static void menuParaPersonajeSelecionado(Personaje personajeSelecionado){
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
        ArrayList<Personaje> personajesObjects = new ArrayList<>();
        personajesObjects.add(new PersonajePlataforma("Mario", 1981));
        personajesObjects.add(new PersonajePlataforma("Link", 1986));
        personajesObjects.add(new PersonajePlataforma("Sonic", 1991));
        personajesObjects.add(new PersonajeAventura("Lara Croft", 1996));
        personajesObjects.add(new PersonajeAventura("Nathan Drake", 2007));
        personajesObjects.add(new PersonajeAventura("Geralt", 2007));
        personajesObjects.add(new PersonajeAccion("Master Chief", 2001));
        personajesObjects.add(new PersonajeAccion("Kratos", 2005));
        personajesObjects.add(new PersonajeAccion("Aloy", 2017));
        return personajesObjects;
    }
}