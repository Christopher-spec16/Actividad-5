package com.example;

public class ParqueExplora implements EspacioCulturarl {

    @Override
    public void mostrarHorario() {
        System.out.println("Horario: Lunes a Domingo de 9:00 a 5:00");
    }

    @Override
    public String obtenerRequisitoEntrada() {
        return "entrada pagada";
    }

    @Override
    public void realizarActividadPrincipal() {
        System.out.println("Actividades: acuario, planetario, museo interactivo");
    }
}
