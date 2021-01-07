package com.caelum.string;

public class MainString {

    static String empty;

    public static void main(String[] args) {
        String s = "aba";

        for (int i = 0; i < 9; i++) {
            s = s + "aba";
        }
        // FIXME s.length não é uma função pertecente à String
        // System.out.println(s.length);

        // FIXME
        // new B().imprime();

        // String empty;
        // String empty = null;
        String full = "Welcome " + empty;
        System.out.println(full);

        // String s = null;
        // String s2 = new String(null);
        // System.out.println(s2);

        String s1 = "estudando para a certificação";
        // FIXME Replace feito com uma string e um char
        // s1.replace("e",'a');
        System.out.println(s1);

    }

}
