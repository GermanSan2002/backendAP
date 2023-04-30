package com.portfolioGermanSancho.mgb.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @javax.persistence.Id
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumpe con la longitud")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumpe con la longitud")
    private String apellido;
    
    @Size(min = 1, max = 50, message = "No cumpe con la longitud")
    private String img;
}
