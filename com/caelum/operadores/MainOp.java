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

        System.out.println("Operadores bit a bit");
        // Converte os números em binário e realiza a operação via tabela da verdade e depois converte para decimal
        // int a = 34 - Inteiro tem 16 bits = 0000000000100010
        // int b = 43 - Inteiro tem 16 bits = 0000000000101011
        // int c = a & b = 0000000000100010 = 34
        // int d = a ^ b = 0000000000001001 = 9
        // int e = a | b = 0000000000101011 = 43

        // & - 1 e 1 = 1
        // | - sempre que aparece 1 é 1
        // ^ - valores iguais são 0
        System.out.println(34 & 43); // 34
        System.out.println(34 ^ 46); // 12
        System.out.println(436 | 547); // 951

        /* */
        int y;
        for (int j = 0; j < 10; ++j) {
            y = j % 5 + 2;
        }
        // System.out.println(y); // Erro de compilação, var não inicializada

        byte b = 1;
        int ii = 1;
        long l = 1;
        // float f = 1.0; Não compila (double não pode ser colocado em um float)

        /* */
        byte b1 = 127;
        byte b2 = -128;
        // byte b3 = b1 + b2; Somando dois bytes que dão um inteiro, sem cast não funciona

        /* */
        int k;
        for (k = 0; k < 5; k++) {
            if (++k % 3 == 0) {
                break;
            }
        }
        // ++k = 3 // k++ = 1
        System.out.println(k);

        /* */
        char c1 = 65;
        // char c2 = -3; Não compila
        char c2 = 68 - 65;
        System.out.println(c1 + c2);

        /* */
        double result = 15 / 0;
        System.out.println(result); // Dá exception (division by zero)

    }

}
