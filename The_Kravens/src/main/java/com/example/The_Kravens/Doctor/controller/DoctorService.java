package com.example.The_Kravens.Doctor.controller;

import com.example.The_Kravens.Doctor.model.Doctor;
import com.example.The_Kravens.Doctor.model.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public List<Doctor> getAllDoctores() {
        return doctorRepository.findAll();
    }

    public Optional<Doctor> getDoctorById(int id) {
        return doctorRepository.findById(id);
    }

    public Doctor saveDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    public void deleteDoctor(int id) {
        doctorRepository.deleteById(id);
    }
}
