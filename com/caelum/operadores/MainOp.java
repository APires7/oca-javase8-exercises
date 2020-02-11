package com.caelum.operadores;

public class MainOp {

    public static void main(String[] args) {
        // i1 = 1
        int i1 = 3 / 2;

        // i2 = 1.0
        double i2 = 3 / 2;

        // i3 = 1.5
        double i3 = 3 / 2.0;

        long x = 0;
        double d = 0;

        double zero = x + d;

        // 3.5
        System.out.println(i1 + i2 + i3 + x + d + zero);

        int i = (byte) 5;
        // long l = 3.0; Não converte direto
        // float f = 0.0; Não converte direto
        char c = 3;
        // char c2 = -2; Não converte direto

        // Sobe exception ArithmeticException: / by zero (divisão por 0)
        // System.out.println(3 / 0);
        System.out.println(3 / 0.0); // Infinity
        System.out.println(3.0 / 0); // Infinity
        System.out.println(-3.0 / 0); // -Infinity

    }

}
