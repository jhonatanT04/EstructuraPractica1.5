/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practicaestructura1.modelo;

/**
 *
 * @author venot
 */
public class NodoGenerico<T> {
    private T dato;
    private NodoGenerico<T> siguiente;

    public NodoGenerico(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public T getDato() {
        return dato;
    }

    public NodoGenerico<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoGenerico<T> siguiente) {
        this.siguiente = siguiente;
    }

}
