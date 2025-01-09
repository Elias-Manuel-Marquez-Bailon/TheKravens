package com.example.The_Kravens.Consultorio.controller;

import com.example.The_Kravens.Consultorio.model.Consultorio;
import com.example.The_Kravens.Consultorio.model.ConsultorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultorioService {

    @Autowired
    private ConsultorioRepository consultorioRepository;

    public List<Consultorio> getAllConsultorios() {
        return consultorioRepository.findAll();
    }

    public Consultorio saveConsultorio(Consultorio consultorio) {
        return consultorioRepository.save(consultorio);
    }

    public void deleteConsultorio(Long id) {
        consultorioRepository.deleteById(id);
    }
}
