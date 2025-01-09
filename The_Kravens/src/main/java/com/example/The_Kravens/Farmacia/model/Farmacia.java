package com.example.The_Kravens.Farmacia.model;

import jakarta.persistence.*;

@Entity
@Table(name = "farmacia")
public class Farmacia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
