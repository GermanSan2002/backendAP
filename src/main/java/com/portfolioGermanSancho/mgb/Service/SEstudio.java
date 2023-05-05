/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolioGermanSancho.mgb.Service;

import com.portfolioGermanSancho.mgb.Entity.Estudio;
import com.portfolioGermanSancho.mgb.Repository.REstudio;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SEstudio {
    @Autowired
    REstudio rEstudio;
    
    public List<Estudio> list() {
        return rEstudio.findAll();
    }

    public Optional<Estudio> getOne(int id) {
        return rEstudio.findById(id);
    }

    public Optional<Estudio> getByNombreE(String nombreE) {
        return rEstudio.findByNombreE(nombreE);
    }

    public void save(Estudio est) {
        rEstudio.save(est);
    }

    public void delete(int id) {
        rEstudio.deleteById(id);
    }

    public boolean existsById(int id) {
        return rEstudio.existsById(id);
    }

    public boolean existsByNombreE(String nombreE) {
        return rEstudio.existsByNombreE(nombreE);
    }
}
