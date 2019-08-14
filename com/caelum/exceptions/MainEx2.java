package com.caelum.exceptions;

public class MainEx2 {

    public void m2() throws java.io.FileNotFoundException {
        System.out.println("e");
        int[][] x = new int[15][20];

        // FIXME Caso realize esse código, imprime ACE e joga uma Exception (ArrayIndexOutOfBoundsException)
        // int[] x = new int[15];
        // x[20] = 13;

        // FIXME Precisa ter uma declaração de throws, senão não compila
        // FIXME Caso realize esse código, imprime ACE e joga uma Exception (FileNotFoundException)
        new java.io.FileInputStream("teste.txt");

        System.out.println("f");
    }

    // FIXME Caso add throws java.io.IOException é preciso add em outro método para funcionar, logo não compila
    public void m() throws java.io.FileNotFoundException {
        System.out.println("c");
        m2();
        System.out.println("d");
    }

    // FIXME Funciona incluindo throws IOException e FileNotFoundException
    public static void main(String args[]) throws java.io.IOException {
        System.out.println("a");
        new MainEx2().m();
        System.out.println("b");
    }

}
