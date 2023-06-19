/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.practicaestructura1;

import ec.edu.ups.practicaestructura1.modelo.Agenda;
import ec.edu.ups.practicaestructura1.modelo.Contacto;
import java.util.Scanner;

/**
 *
 * @author venot
 */
public class PracticaEstructura1 {

    public static void main(String[] args) {
        Agenda<String> agenda = new Agenda<>();

        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("1. Ingresar contacto\n2. Buscar contacto\n3. Eliminar contacto\n4.Imprimir\n5.Salir");
            
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre: ");
                    String nombre = teclado.next();
                    System.out.print("Ingrese el teléfono: ");
                    String telefono = teclado.next();
                    agenda.agregarContacto(nombre, telefono);
                    
                    break;
                case 2:
                    System.out.print("Ingrese el nombre : ");
                    String nombreBusqueda = teclado.next();
                    Contacto<String> contactoEncontrado = agenda.buscarContacto(nombreBusqueda);
                    if (contactoEncontrado != null) {
                        System.out.println("Nombre: " + contactoEncontrado.getNombre());
                        System.out.println("Teléfono: " + contactoEncontrado.getTelefono());
                    } else {
                        System.out.println("El contacto no existe ");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del contacto a eliminar: ");
                    String nombreEliminacion = teclado.next();
                    agenda.eliminarContacto(nombreEliminacion);
                    System.out.println("Contacto eliminado correctamente.");
                    break;
                case 4:
                    agenda.mostrarContactos();
                    break;
                
            }

            System.out.println();
        } while (opcion != 5);
    }
}
