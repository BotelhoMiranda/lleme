package uff.ic.tcc00175.patterns.adapter;

import java.util.Date;

public class Operacoes {

    public String reservar(String tipoQuarto, Date inicio, Date fim) {

        return "Reserva realizada para quarto tipo " + tipoQuarto
                + " do dia " + inicio.toString() + " ate o dia " + fim.toString();

    }
}
