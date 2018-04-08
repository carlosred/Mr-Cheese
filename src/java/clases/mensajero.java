/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author Carlos Asprilla
 */
public class mensajero {
 
    private String nombre_mensajero;
    private String id_mensajero;
    private String placa;
 private ArrayList<pedido> pedidos = new ArrayList();

    /**
     * @return the nombre_mensajero
     */
    public String getNombre_mensajero() {
        return nombre_mensajero;
    }

    /**
     * @param nombre_mensajero the nombre_mensajero to set
     */
    public void setNombre_mensajero(String nombre_mensajero) {
        this.nombre_mensajero = nombre_mensajero;
    }

    /**
     * @return the id_nombre
     */
    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the pedidos
     */
    public ArrayList<pedido> getPedidos() {
        return pedidos;
    }

    /**
     * @param pedidos the pedidos to set
     */
    public void setPedidos(ArrayList<pedido> pedidos) {
        this.pedidos = pedidos;
    }

    /**
     * @return the id_mensajero
     */
    public String getId_mensajero() {
        return id_mensajero;
    }

    /**
     * @param id_mensajero the id_mensajero to set
     */
    public void setId_mensajero(String id_mensajero) {
        this.id_mensajero = id_mensajero;
    }
}
