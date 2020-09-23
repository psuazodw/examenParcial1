/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examenparcial1.model;

import java.util.Objects;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 *
 * @author pablo.suazo1
 */
public class Cliente {
    
    @NotNull(message = "codCliente no puede ser null")
    @NotEmpty(message = "Porfavor ingrese un codigo de cliente valido")
    private Long codCliente;
    
    @NotNull(message = "NIT no puede ser null")
    @NotEmpty(message = "Porfavor ingrese un NIT de cliente valido")
    private int nit;
    
    @NotNull(message = "Porfavor ingrese un nombre")
    @NotEmpty(message = "Debe ingresar un nombre de clietne")
    private String nombre;
    
    @NotNull(message = "Debe ingresar direccion valida")
    @NotEmpty(message = "Porfavor ingrese un direccion")
    private String direccion;
    
    private boolean activo;

    /**
     * @return the codCliente
     */
    public Long getCodCliente() {
        return codCliente;
    }

    /**
     * @param codCliente the codCliente to set
     */
    public void setCodCliente(Long codCliente) {
        this.codCliente = codCliente;
    }

    /**
     * @return the nit
     */
    public int getNit() {
        return nit;
    }

    /**
     * @param nit the nit to set
     */
    public void setNit(int nit) {
        this.nit = nit;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the activo
     */
    public boolean isActivo() {
        return activo;
    }

    /**
     * @param activo the activo to set
     */
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
}
