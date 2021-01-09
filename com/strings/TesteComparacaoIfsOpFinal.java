package com.strings;

public class TesteComparacaoIfsOpFinal {

	public static void main(String[] args) {
		B b = new B();
		
		// A variavel valor em B é do tipo final, sendo assim não altera o valor
		if (b.valor = true) {
			System.out.println("verdadeiro");
		}
	}
}

class B {
	final boolean valor = false;
}


class A {
    public static void main(String[] args) {
        int quantidade = 15;
        
        // Não é uma comparação no if, logo não compila
        if(quantidade=15) {
            System.out.println("sim");
        } else {
            System.out.println("nao");
        }
    }
}