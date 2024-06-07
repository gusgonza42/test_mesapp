package abp.project.v2Videojuegos.m03uf4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    ArrayList<Persona> personajes =new ArrayList<>();
    personajes.add(new PersonajePlataforma("Mario","Personajes de Plataformas",1981));
    personajes.add(new PersonajePlataforma("Link","Personajes de Plataformas",1986));
    personajes.add(new PersonajePlataforma("Sonic","Personajes de Plataformas",1986));
    personajes.add(new PersonajeAventura("Lara Croft","Personajes de Aventura",1996));
    personajes.add(new PersonajeAventura("Nathan Drake","Personajes de Aventura", 2007));
    personajes.add(new PersonajeAventura("Geralt","Personajes de Aventura",2007));
    personajes.add(new PersonajeAccion("Master Chief","Personajes de Acción",2001));
    personajes.add(new PersonajeAccion("Kratos","Personajes de Acción",2005));
    personajes.add(new PersonajeAccion("Aloy","Personajes de Acción",2017));

    Scanner scanner = new Scanner(System.in);

    while (true){
        System.out.println("Menú UF4: "+"\n1)Seleccionar personajes"+"\n2)Salir");

        String opcion = scanner.nextLine();

        if (opcion.equals("1")){
            for (int i=0; i<personajes.size(); i++){
                System.out.println(personajes.get(i).getTipo());
                System.out.println((i+1)+". "+personajes.get(i).getNombre());
                System.out.println((i+1)+". "+personajes.get(i).getYear());
            }
            int seleccionar = Integer.parseInt(scanner.nextLine())-1;

            if (seleccionar >= 0 && seleccionar < personajes.size()){
                Persona personajesSeleccionado = personajes.get(seleccionar);
                while(true){
                    System.out.println("Menú UF4-Personaje:"+"\n1)Hablar"+"\n2)Jugar"+"\n3)Atras");

                    String opcionPersonaje = scanner.nextLine();
                    if (opcionPersonaje.equals("1")){
                        personajesSeleccionado.hablar();
                    } else if( opcionPersonaje.equals("2")){
                        personajesSeleccionado.jugar();
                    } else if (opcionPersonaje.equals("3")){
                        break;
                    } else {
                        System.out.println("Opcion introducido valido");
                    }
                }
            } else {
                System.out.println("Opcion introducido no valido");
            }

        } else if (opcion.equals("2")){
            System.out.println("Salir");
            break;
        } else {
            System.out.println("Opcion no valido");
        }
    }



    }
}
