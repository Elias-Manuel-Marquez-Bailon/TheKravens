package com.example.The_Kravens.Farmacia.controller;

import com.example.The_Kravens.Farmacia.model.Farmacia;
import com.example.The_Kravens.Farmacia.model.FarmaciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FarmaciaService {

    @Autowired
    private FarmaciaRepository farmaciaRepository;

    public List<Farmacia> getAllFarmacias() {
        return farmaciaRepository.findAll();
    }

    public Farmacia saveFarmacia(Farmacia farmacia) {
        return farmaciaRepository.save(farmacia);
    }

    public void deleteFarmacia(Long id) {
        farmaciaRepository.deleteById(id);
    }
}
