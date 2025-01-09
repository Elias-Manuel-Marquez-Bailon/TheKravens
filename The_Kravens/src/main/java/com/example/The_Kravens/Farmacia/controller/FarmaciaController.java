package com.example.The_Kravens.Farmacia.controller;

import com.example.The_Kravens.Farmacia.model.Farmacia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/farmacias")
public class FarmaciaController {

    @Autowired
    private FarmaciaService farmaciaService;

    @GetMapping
    public List<Farmacia> getAllFarmacias() {
        return farmaciaService.getAllFarmacias();
    }

    @PostMapping
    public Farmacia createFarmacia(@RequestBody Farmacia farmacia) {
        return farmaciaService.saveFarmacia(farmacia);
    }

    @DeleteMapping("/{id}")
    public void deleteFarmacia(@PathVariable Long id) {
        farmaciaService.deleteFarmacia(id);
    }
}
