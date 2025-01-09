package com.example.The_Kravens.Consultorio.controller;

import com.example.The_Kravens.Consultorio.model.Consultorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consultorios")
public class ConsultorioController {

    @Autowired
    private ConsultorioService consultorioService;

    @GetMapping
    public List<Consultorio> getAllConsultorios() {
        return consultorioService.getAllConsultorios();
    }

    @PostMapping
    public Consultorio createConsultorio(@RequestBody Consultorio consultorio) {
        return consultorioService.saveConsultorio(consultorio);
    }

    @DeleteMapping("/{id}")
    public void deleteConsultorio(@PathVariable Long id) {
        consultorioService.deleteConsultorio(id);
    }
}
