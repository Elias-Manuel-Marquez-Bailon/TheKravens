package com.example.The_Kravens.Consultorio.model;

import jakarta.persistence.*;

@Entity
@Table(name = "consultorio")
public class Consultorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
