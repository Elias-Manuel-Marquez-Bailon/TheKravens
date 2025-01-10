package com.example.The_Kravens.Doctor.controller;

import com.example.The_Kravens.Utils.Turno;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/turnos")
public class TurnoController {

    @GetMapping
    public List<String> getAllTurnos() {
        return Arrays.stream(Turno.values())
                .map(Enum::name)
                .collect(Collectors.toList());
    }
}

