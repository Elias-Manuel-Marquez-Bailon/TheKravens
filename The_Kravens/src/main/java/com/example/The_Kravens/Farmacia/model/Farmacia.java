package com.example.The_Kravens.Farmacia.model;

import com.example.The_Kravens.Medicamento.model.Medicamento;
import jakarta.persistence.*;

import java.util.List;
@Entity
public class Farmacia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(mappedBy = "farmacia", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Medicamento> medicamentos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }
}

