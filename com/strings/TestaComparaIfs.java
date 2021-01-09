package com.strings;

public class TestaComparaIfs {

	public static void main(String[] args) {
		boolean autentico = true;
		
		if(autentico) {
			System.out.println("ok");
		} else {
			System.out.println("Não autorizado");
		}

	}
}

// Compila
class A {
    public static void main(String[] args) {
        if(args.length > 0)
            System.out.println("Um ou mais argumentos");
        else
            System.out.println("0");
    }
}


class B{
    final boolean valor = false;
}
class A {
    public static void main(String[] args) {
        B b = new B();
        if(b.valor = true) {
            System.out.println("verdadeiro");
        }
    }
}