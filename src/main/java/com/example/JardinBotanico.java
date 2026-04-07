
package com.example;

public class JardinBotanico implements EspacioCulturarl {

    @Override
    public void mostrarHorario() {
        System.out.println("Horario: Lunes a Domingo de 9:00 a 4:00");
    }

    @Override
    public String obtenerRequisitoEntrada() {
        return "Entrada libre (algunos eventos requeieren registro)";
    }

    @Override
    public void realizarActividadPrincipal() {
        System.out.println("Actividades: caminata ");
        
    }

}
