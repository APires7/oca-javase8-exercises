package com.caelum.exceptions;

public class MainException {

    public static void main(String... args) {
        // FIXME Caso a string só tenha sido declarada, não compila
        // String name;

        // FIXME Caso a string tenha sido inicializada, imprime b e c
        String name = null;

        try {
            name.toLowerCase();
            System.out.println("a");
        } catch (NullPointerException ex) {
            System.out.println("b");
        }
        System.out.println("c");

    }

}
