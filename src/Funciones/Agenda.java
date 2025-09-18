package Funciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    Scanner sc = new Scanner(System.in);
    ArrayList<contacto> Contactos = new ArrayList<>();

    public void añadirContacto() {
        System.out.println("Ingrese el nombre del contacto");
        String Nombre = sc.nextLine();
        System.out.println("Ingrese el numero del contacto");
        int Numero = sc.nextInt();
        sc.nextLine();
        Contactos.add(new contacto(Nombre, Numero));
        System.out.println("Contacto añadido exitosamente.");
    }

    public void mostrarContactos() {
        System.out.println("Listado de contactos");
        for (contacto c:Contactos){
            System.out.println(c);
        }
    }

    public void buscarContacto() {
        System.out.println("Ingrese el nombre del contacto");
        String Nombre = sc.nextLine();
        for (contacto c:Contactos){
            if (c.getNombre().toLowerCase().equals(Nombre.toLowerCase())){
                System.out.println(c);
            }
        }
    }
}
