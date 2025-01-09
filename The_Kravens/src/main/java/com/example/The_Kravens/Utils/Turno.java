package com.example.The_Kravens.Utils;


public enum Turno {
    TURNO_1("08:00 - 16:00", "Lunes a Viernes", "Sábado y Domingo"),
    TURNO_2("16:00 - 00:00", "Lunes a Viernes", "Sábado y Domingo"),
    TURNO_3("00:00 - 08:00", "Lunes a Viernes", "Sábado y Domingo"),
    TURNO_4("10:00 - 18:00", "Martes a Sábado", "Domingo y Lunes"),
    TURNO_5("12:00 - 20:00", "Miércoles a Domingo", "Lunes y Martes");

    private final String horario;
    private final String diasDeLabor;
    private final String diasDeDescanso;

    // Constructor
    Turno(String horario, String diasDeLabor, String diasDeDescanso) {
        this.horario = horario;
        this.diasDeLabor = diasDeLabor;
        this.diasDeDescanso = diasDeDescanso;
    }

    // Getters
    public String getHorario() {
        return horario;
    }

    public String getDiasDeLabor() {
        return diasDeLabor;
    }

    public String getDiasDeDescanso() {
        return diasDeDescanso;
    }
}