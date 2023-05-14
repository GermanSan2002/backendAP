/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolioGermanSancho.mgb.DTO;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author Usuario
 */
public class DTOProyecto {
    @NotBlank
    private String nombre;
    
    @NotBlank
    private String descripcion;
    
    @NotBlank
    private String linkCode;
    
    @NotBlank
    private String linkDemo;

    public DTOProyecto() {
    }

    public DTOProyecto(String nombre, String descripcion, String linkCode, String linkDemo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.linkCode = linkCode;
        this.linkDemo = linkDemo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLinkCode() {
        return linkCode;
    }

    public void setLinkCode(String linkCode) {
        this.linkCode = linkCode;
    }

    public String getLinkDemo() {
        return linkDemo;
    }

    public void setLinkDemo(String linkDemo) {
        this.linkDemo = linkDemo;
    }
}
