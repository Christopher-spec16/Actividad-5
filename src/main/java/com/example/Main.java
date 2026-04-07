package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
    ArrayList<EspacioCulturar> lugares = new ArrayList<>();

        lugares.add(new JardinBotanico());
        lugares.add(new MuseoDeAntioquia());
        lugares.add(new ParqueExplora());

        for (EspacioCulturar lugar : lugares) {
            lugar.mostrarHorario();
            System.out.println("Requisito de entrada: " + lugar.obtenerRequisitoEntrada());
            lugar.realizarActividadPrincipal();
            System.out.println();
        }
    }
}