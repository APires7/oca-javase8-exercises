package com.strings;

class ComparacaoStrings {

	public static void main(String[] args) {

		Cliente c1 = new Cliente("guilherme");
		Cliente c2 = new Cliente("mario");
		System.out.println(c1 == c2); // false
		System.out.println(c1 == c1); // true

		Cliente c3 = new Cliente("guilherme");
		System.out.println(c1 == c3);// false, pois não é a mesma // referência: são objetos diferentes na memória

		/*
		 * 
		 * Cliente c1 = new Cliente("guilherme"); Cliente c2 = new Cliente("mario");
		 * System.out.println(c1.equals(c2)); // false
		 * System.out.println(c1.equals(c1)); // true
		 * 
		 * Cliente c3 = new Cliente("guilherme"); System.out.println(c1.equals(c3)); //
		 * false, pois não é a mesma // referência: são objetos diferentes na memória
		 */
		
	}
}

class Cliente {
	private String nome;

	Cliente(String nome) {
		this.nome = nome;
	}

	public boolean equals(Object o) {
		if (!(o instanceof Cliente)) {
			return false;
		}
		Cliente outro = (Cliente) o;
		return this.nome.equals(outro.nome);
	}
}
