package com.caelum.exceptions;

public class MyException extends RuntimeException {

}

class A {

    public void m2() {
        System.out.println("e");
        boolean sim = true;
        if (sim)
            throw new MyException();
        System.out.println("f");
    }

    public void m() throws java.io.FileNotFoundException {
        System.out.println("c");

        // FIXME Não compila, catch desnecessário
        // try {
         m2();
        // } catch (java.io.FileNotFoundException e) {
        //
        // }
        System.out.println("d");
    }

    public static void main(String[] args) throws java.io.IOException {
        System.out.println("a");
        new A().m();
        System.out.println("b");
    }

}
