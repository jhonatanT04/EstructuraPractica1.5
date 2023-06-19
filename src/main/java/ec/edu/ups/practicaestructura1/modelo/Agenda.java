/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practicaestructura1.modelo;

/**
 *
 * @author venot
 */
public class Agenda<T> {
    private ListaEnlazada<Contacto<T>> contactos;

    public Agenda() {
        contactos = new ListaEnlazada<>();
    }

    public void agregarContacto(T nombre, T telefono) {
        Contacto<T> nuevoContacto = new Contacto<>(nombre, telefono);
        contactos.agregarContacto(nuevoContacto);
    }

    public void mostrarContactos(){
        contactos.mostrarContactos();
    }
    
    public Contacto<T> buscarContacto(T nombre) {
        NodoGenerico<Contacto<T>> actual = contactos.getCabeza();
        while (actual != null) {
            Contacto<T> contacto = actual.getDato();
            if (contacto.getNombre().equals(nombre)) {
                return contacto;
            }
            actual = actual.getSiguiente();
        }
        return null;
    }

    public void eliminarContacto(T nombre) {
        NodoGenerico<Contacto<T>> actual = contactos.getCabeza();
        NodoGenerico<Contacto<T>> anterior = null;

        while (actual != null) {
            Contacto<T> contacto = actual.getDato();
            if (contacto.getNombre().equals(nombre)) {
                if (anterior == null) {
                    contactos.setCabeza(actual.getSiguiente());
                } else {
                    anterior.setSiguiente(actual.getSiguiente());
                }
                return;
            }
            anterior = actual;
            actual = actual.getSiguiente();
        }
    }
    
}
