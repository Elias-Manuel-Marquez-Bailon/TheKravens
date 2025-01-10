package com.example.The_Kravens.Archivo.controller;
import com.example.The_Kravens.Archivo.model.Archivo;
import com.example.The_Kravens.Archivo.model.ArchivoRepository;
import com.example.The_Kravens.Doctor.model.Doctor;
import com.example.The_Kravens.Doctor.model.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ArchivoService {

    @Autowired
    private ArchivoRepository archivoRepository;

    @Autowired
    private DoctorRepository doctorRepository;

    public List<Archivo> getAllArchivos() {
        return archivoRepository.findAll();
    }

    public Archivo saveArchivo(Archivo archivo, int doctorId) {
        Optional<Doctor> doctor = doctorRepository.findById(doctorId);
        if (doctor.isPresent()) {
            archivo.setDoctor(doctor.get());
            return archivoRepository.save(archivo);
        } else {
            throw new IllegalArgumentException("Doctor no encontrado con ID: " + doctorId);
        }
    }

    public void deleteArchivo(int id) {
        archivoRepository.deleteById(id);
    }
}
