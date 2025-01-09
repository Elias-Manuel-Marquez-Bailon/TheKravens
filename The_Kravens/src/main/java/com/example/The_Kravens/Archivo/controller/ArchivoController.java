package com.example.The_Kravens.Archivo.controller;

import com.example.The_Kravens.Archivo.model.Archivo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/archivos")
public class ArchivoController {

    @Autowired
    private ArchivoService archivoService;

    @GetMapping
    public List<Archivo> getAllArchivos() {
        return archivoService.getAllArchivos();
    }

    @PostMapping("/{doctorId}")
    public Archivo createArchivo(@PathVariable int doctorId, @RequestBody Archivo archivo) {
        return archivoService.saveArchivo(archivo, doctorId);
    }

    @DeleteMapping("/{id}")
    public void deleteArchivo(@PathVariable int id) {
        archivoService.deleteArchivo(id);
    }
}
