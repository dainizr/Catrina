/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.entidades;

import mx.itson.catrina.enumeradores.Enumeradores;

/**
 *
 * @author 52622
 */
public class Cliente {
    private String Cliente;
    private String Rfc;
    private String domicilio;
    private String codigoPostal;
    private String numeroCuenta;
    private String codigo;
    private Enumeradores tipo;
    
    

    /**
     * @return the Cliente
     */
    public String getCliente() {
        return Cliente;
    }

    /**
     * @param Cliente the Cliente to set
     */
    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    /**
     * @return the Rfc
     */
    public String getRfc() {
        return Rfc;
    }

    /**
     * @param Rfc the Rfc to set
     */
    public void setRfc(String Rfc) {
        this.Rfc = Rfc;
    }

    /**
     * @return the domicilio
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * @param domicilio the domicilio to set
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * @return the codigoPostal
     */
    public String getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * @param codigoPostal the codigoPostal to set
     */
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    
    
}
