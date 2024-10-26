package edu.luc;

import java.util.Arrays;

public class Met {
    public int calcularConsumoTotal(String[] consumoSemanal) {
        int total = 0;
        int n = Arrays.stream(consumoSemanal).mapToInt(Integer::parseInt).sum();
        total += n / consumoSemanal.length;
        return total;

    }

    public static int calcularMediaSemanal(int totalConsumo, int numeroDeSemanas) {
        return 0;
    }
}

