package abp.project.v2Videojuegos.m03uf4;

import abp.project.v2Videojuegos.m03uf4.personaje.Personaje;
import abp.project.v2Videojuegos.m03uf4.personaje.PersonajeAccion;
import abp.project.v2Videojuegos.m03uf4.personaje.PersonajeAventura;
import abp.project.v2Videojuegos.m03uf4.personaje.PersonajePlataforma;

import java.util.ArrayList;
import java.util.Scanner;

public class Temp {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Personaje> coleccionPersonajes = agregarTodosObjetosPersonajes();
        ejecutarMenuPrincipal(coleccionPersonajes);
    }

    private static void ejecutarMenuPrincipal(ArrayList<Personaje> coleccionPersonajes) {
        while (true) {
            mostrarMenuPrincipal();
            int opcion = obtenerOpcionDelUsuario();
            if (opcion == 1) {
                if (!ejecutarMenuPersonaje(coleccionPersonajes)) {
                    continue;
                }
            } else if (opcion == 2) {
                break;
            } else {
                mostrarMensaje("Opción no válida");
            }
        }
    }

    private static boolean ejecutarMenuPersonaje(ArrayList<Personaje> coleccionPersonajes) {
        while (true) {
            mostrarMenuPersonaje(coleccionPersonajes);
            int opcion = obtenerOpcionDelUsuario();
            if (opcion > 0 && opcion <= coleccionPersonajes.size()) {
                Personaje personajeSeleccionado = coleccionPersonajes.get(opcion - 1);
                if (!ejecutarMenuAcciones(personajeSeleccionado)) {
                    return false;
                }
            } else {
                mostrarMensaje("Opción no válida");
            }
        }
    }

    private static boolean ejecutarMenuAcciones(Personaje personajeSeleccionado) {
        while (true) {
            mostrarMenuAcciones(personajeSeleccionado);
            int opcion = obtenerOpcionDelUsuario();
            if (opcion == 1) {
                personajeSeleccionado.habla();
            } else if (opcion == 2) {
                personajeSeleccionado.juega();
            } else if (opcion == 3) {
                return false;
            } else {
                mostrarMensaje("Opción no válida");
            }
        }
    }

    private static void mostrarMenuPrincipal() {
        System.out.println("""
                Menú UF4
                1) Seleciona Personaje.
                2) Salir.
                """);
    }

    private static void mostrarMenuPersonaje(ArrayList<Personaje> coleccionPersonajes) {
        System.out.println("Selecciona un personaje:");
        for (int i = 0; i < coleccionPersonajes.size(); i++) {
            System.out.println((i + 1) + ") " + coleccionPersonajes.get(i).getNombre() + coleccionPersonajes.get(i).getYear());
        }
    }

    private static void mostrarMenuAcciones(Personaje personajeSeleccionado) {
        System.out.println("Menú Personaje: " + personajeSeleccionado.getNombre() + " " + personajeSeleccionado.getYear());
        System.out.println("""
                Menú UF4-Personaje
                1) Hablar.
                2) Jugar.
                3) Atrás.
                """);
    }

    private static int obtenerOpcionDelUsuario() {
        return scanner.nextInt();
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
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