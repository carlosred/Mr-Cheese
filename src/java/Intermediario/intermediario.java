/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intermediario;
import clases.cliente;
import clases.despachador;
import clases.mensajero;

import clases.pedido;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
 import javax.faces.bean.RequestScoped;
@ManagedBean
@RequestScoped
/**
 *clase intermediaria entre la pagina y las clases java
 * @author Carlos Asprilla
 */

public class intermediario {
    private  mensajero mensajero = new mensajero();
    private cliente cliente = new cliente();
    private pedido pedido = new pedido();
    private despachador despachador = new despachador();
    private static List<mensajero> mensajeros = new ArrayList<>();
    private mensajero before = null;
    /**
     * @return the cliente
     */
    public cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the pedido
     */
    public pedido getPedido() {
        return pedido;
    }

    /**
     * @param pedido the pedido to set
     */
    public void setPedido(pedido pedido) {
        this.pedido = pedido;
    }

    /**
     * @return the despachador
     */
    public despachador getDespachador() {
        return despachador;
    }

    /**
     * @param despachador the despachador to set
     */
    public void setDespachador(despachador despachador) {
        this.despachador = despachador;
    }

    /**
     * @return the mensajeros
     */
    
    
    public void AgregarMensajero(){
        this.mensajeros.add(this.mensajero);
        // limpiar campos o bueno el beans de memoria
        mensajero = new mensajero();
    }
    public void EliminarMensajero(mensajero m){
        this.mensajeros.remove(m);
         //limpiar campos o bueno el beans de memoria
        mensajero = new mensajero();
        
    }
    // busca el elemento que se va a editar lo clona y lo vuelve el nuevo before.
    public void search(){
         mensajero clone = this.mensajero;
        setBefore(clone);
    }
    // metodo para actualizar cogiendo la posicion del anterior y agregandole en el arraylist al nuevo , seteandolo.
    public void ActualizarMensajero(mensajero editado ){
       
        int pos = intermediario.mensajeros.indexOf(this.before);
        
        intermediario.mensajeros.add(pos, editado);
      // limpiar campos o bueno el beans de memoria
        
    } 
    // captura el mensajero y lo vuelve la el nuevo beans global y me informa el nombre del before.
    public String capturar(mensajero m){
        this.setMensajero(m);
        String t ;
        if(before ==null){
            t =""; 
        }else{
            t= this.before.getNombre_mensajero();
        }
       return t;
    }

    /**
     * @return the mensajeros
     */
    public List<mensajero> getMensajeros() {
        return mensajeros;
    }

    /**
     * @param mensajeros the mensajeros to set
     */
    public void setMensajeros(List<mensajero> mensajeros) {
        this.mensajeros = mensajeros;
    }

    /**
     * @return the mensajero
     */
    public mensajero getMensajero() {
        return mensajero;
    }

    /**
     * @param mensajero the mensajero to set
     */
    public void setMensajero(mensajero mensajero) {
        this.mensajero = mensajero;
    }

    /**
* @return the before
     */
    public mensajero getBefore() {
        return before;
    }

    /**
     * @param before the before to set
     */
    public void setBefore(mensajero before) {
        this.before = before;
    }
}
