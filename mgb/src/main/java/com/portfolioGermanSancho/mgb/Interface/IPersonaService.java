package com.portfolioGermanSancho.mgb.Interface;

import com.portfolioGermanSancho.mgb.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Traer una persona
    public List<Persona> getPersona();
    
    //Guardar objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto pero lo biscamos por ID
    public void deletePersona(Long id);
    
    //Buscar una persona por id
    public Persona findPersona(Long id);
    
    
}
