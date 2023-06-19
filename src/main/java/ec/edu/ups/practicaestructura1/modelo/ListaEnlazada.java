/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practicaestructura1.modelo;

/**
 *
 * @author venot
 */
public class ListaEnlazada<T> {
    private NodoGenerico<T> cabeza;

    public ListaEnlazada() {
        this.cabeza = null;
    }
    

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void agregarContacto(T dato) {
        NodoGenerico<T> nuevoNodo = new NodoGenerico<T>(dato);
        if (estaVacia()) {
            cabeza = nuevoNodo;
        } else {
            NodoGenerico<T> actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
    }

    public void mostrarContactos() {
        if (estaVacia()) {
            System.out.println("La agenda está vacía.");
        } else {
            NodoGenerico<T> actual = cabeza;
            while (actual != null) {
                Contacto contacto = (Contacto) actual.getDato();
                System.out.println("Nombre: " + contacto.getNombre() + ", Teléfono: " + contacto.getTelefono());
                actual = actual.getSiguiente();
            }
        }
    }

    public NodoGenerico<T> getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoGenerico<T> cabeza) {
        this.cabeza = cabeza;
    }
    
}
