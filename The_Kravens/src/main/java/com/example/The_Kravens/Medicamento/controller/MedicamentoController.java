package com.example.The_Kravens.Medicamento.controller;

import com.example.The_Kravens.Medicamento.model.Medicamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/medicamentos")
public class MedicamentoController {

    @Autowired
    private MedicamentoService medicamentoService;

    @GetMapping
    public List<Medicamento> getAllMedicamentos() {
        return medicamentoService.getAllMedicamentos();
    }

    @GetMapping("/{id}")
    public Optional<Medicamento> getMedicamentoById(@PathVariable Long id) {
        return medicamentoService.getMedicamentoById(id);
    }

    @PostMapping
    public Medicamento createMedicamento(@RequestBody Medicamento medicamento) {
        return medicamentoService.saveMedicamento(medicamento);
    }

    @PutMapping("/{id}")
    public Medicamento updateMedicamento(@PathVariable int id, @RequestBody Medicamento medicamento) {
        medicamento.setId(id);
        return medicamentoService.saveMedicamento(medicamento);
    }

    @DeleteMapping("/{id}")
    public void deleteMedicamento(@PathVariable Long id) {
        medicamentoService.deleteMedicamento(id);
    }
}
