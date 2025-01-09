package com.example.The_Kravens.Archivo.controller;

import com.example.The_Kravens.Archivo.model.Archivo;
import com.example.The_Kravens.Archivo.model.ArchivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArchivoService {

    @Autowired
    private ArchivoRepository archivoRepository;

    public List<Archivo> getAllArchivos() {
        return archivoRepository.findAll();
    }

    public Archivo saveArchivo(Archivo archivo) {
        return archivoRepository.save(archivo);
    }

    public void deleteArchivo(Long id) {
        archivoRepository.deleteById(id);
    }
}
