package com.example.The_Kravens.Consultorio.model;

import com.example.The_Kravens.Archivo.model.Archivo;
import com.example.The_Kravens.Doctor.model.Doctor;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Consultorio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(mappedBy = "consultorio", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Doctor> doctores;

    @OneToMany(mappedBy = "consultorio", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Archivo> archivos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Doctor> getDoctores() {
        return doctores;
    }

    public void setDoctores(List<Doctor> doctores) {
        this.doctores = doctores;
    }

    public List<Archivo> getArchivos() {
        return archivos;
    }

    public void setArchivos(List<Archivo> archivos) {
        this.archivos = archivos;
    }

}

