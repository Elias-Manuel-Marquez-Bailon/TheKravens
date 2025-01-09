package com.example.The_Kravens.Archivo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "archivo")
public class Archivo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



}
