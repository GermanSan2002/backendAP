package com.portfolioGermanSancho.mgb.Repository;

import com.portfolioGermanSancho.mgb.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long>{
    
}
