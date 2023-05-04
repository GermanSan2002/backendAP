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
public class DTOEstudio {
    @NotBlank
    private String nombreE;
    
    @NotBlank
    private String institucionE;
    
    @NotBlank
    private String descripcionE;
    
    @NotBlank
    private String inicioE;
    
    @NotBlank
    private String FinalE;

    public DTOEstudio() {
    }

    public DTOEstudio(String nombreE, String institucionE, String descripcionE, String inicioE, String FinalE) {
        this.nombreE = nombreE;
        this.institucionE = institucionE;
        this.descripcionE = descripcionE;
        this.inicioE = inicioE;
        this.FinalE = FinalE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getInstitucionE() {
        return institucionE;
    }

    public void setInstitucionE(String institucionE) {
        this.institucionE = institucionE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getInicioE() {
        return inicioE;
    }

    public void setInicioE(String inicioE) {
        this.inicioE = inicioE;
    }

    public String getFinalE() {
        return FinalE;
    }

    public void setFinalE(String FinalE) {
        this.FinalE = FinalE;
    }
    
    
}
