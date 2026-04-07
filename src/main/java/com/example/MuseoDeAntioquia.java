package com.example;

public class MuseoDeAntioquia implements EspacioCulturar {

    @Override
    public void mostrarHorario() {
        System.out.println("Horario: Lunes a Domingo de 10:00 a 6:00");
    }

    @Override
    public String obtenerRequisitoEntrada() {
        return "entrada pagada";
    }

    @Override
    public void realizarActividadPrincipal() {
        System.out.println("Actividades: exposiciones de arte, visitas guiadas");
    }


}
