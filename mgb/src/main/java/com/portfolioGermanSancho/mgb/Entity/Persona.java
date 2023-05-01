package com.portfolioGermanSancho.mgb.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.data.annotation.Id;

@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @javax.persistence.Id
    private int id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumpe con la longitud")
    private String nombre;
    
    @NotNull
    private String descripcion;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumpe con la longitud")
    private String apellido;
    
    private String img;

    public Persona() {
    }

    public Persona(String nombre, String descripcion, String apellido, String img) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.apellido = apellido;
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
