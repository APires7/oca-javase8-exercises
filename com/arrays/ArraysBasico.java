package com.arrays;

public class ArraysBasico {

	public static void main(String[] args) {

		// Declaração de um array para guardar variáveis do tipo int.
		int[] idades;

		// Declaração de um array para guardar variáveis do tipo double.
		double pesos[];

		// Declaração de um array para guardar variáveis do tipo long.
		long []pesos2;

		// Declaração de um array para guardar variáveis do tipo long.
		long[] tamanhos;

		// compila e roda
		int[] numeros = new int[0];
		// compila, mas joga NegativeArraySizeException
		numeros = new int[-1];

		int[] inteiros = { 1, 2, 5, 7, 5 }; // compila
		int[] inteiros2;
		inteiros2={1,2,5,7,5}; // Não compila

	}

}
