import Funciones.contacto;
import Funciones.Agenda;
import java.util.ArrayList;
import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contactos = 0;
        int opcion = 0;
        Agenda agenda = new Agenda();
        ArrayList<contacto> Contactos = new ArrayList<>();

        while (opcion !=4) {
            System.out.println("Agenda de contactos");
            System.out.println("===================");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Mostrar todos los contactos");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            while (opcion!=4&&opcion!=1&&opcion!=2&&opcion!=3) {
                System.out.println("Opcion incorrecta.");
                opcion = sc.nextInt();
                sc.nextLine();
            }


            switch (opcion) {
                case 1:
                    agenda.añadirContacto();
                    break;
                case 2:
                    agenda.mostrarContactos();
                    break;
                case 3:
                    agenda.buscarContacto();
                    break;

                case 4:
                    System.out.println("Programa finalizado");
                    break;
            }

        }
    }

}
