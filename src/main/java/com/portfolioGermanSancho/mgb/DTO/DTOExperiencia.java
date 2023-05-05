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
public class DTOExperiencia {
    @NotBlank
    private String nombreE;
    
    @NotBlank
    private String descripcionE;
    
    @NotBlank
    private String empresaE;
    
    @NotBlank
    private String inicioE;
    
    @NotBlank
    private String finalE;
    
    //Constructores

    public DTOExperiencia() {
    }

    public DTOExperiencia(String nombreE, String descripcionE, String empresaE, String inicioE, String finalE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.empresaE = empresaE;
        this.inicioE = inicioE;
        this.finalE = finalE;
    }
    
    public DTOExperiencia(String nombreE, String descripcionE, String empresaE, String inicioE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.empresaE = empresaE;
        this.inicioE = inicioE;
    }

    //Getters & Setters

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getEmpresaE() {
        return empresaE;
    }

    public void setEmpresaE(String empresaE) {
        this.empresaE = empresaE;
    }

    public String getInicioE() {
        return inicioE;
    }

    public void setInicioE(String inicioE) {
        this.inicioE = inicioE;
    }

    public String getFinalE() {
        return finalE;
    }

    public void setFinalE(String finalE) {
        this.finalE = finalE;
    }
}
