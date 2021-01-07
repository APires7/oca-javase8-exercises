/**
 * 
 */
package com.strings;

/**
 * @author allan
 *
 */
public class ContandoStrings {

	public static void main(String[] args) {

		String ab = "a" + "b";
		System.out.println("ab" == ab); // true

		String a = "a";
		String ab_literal = a + "b"; // usando uma referência e um literal
		System.out.println("ab" == ab_literal); // false

		String str = "um texto qualquer";
		String txt1 = "texto";
		String txt2 = str.substring(3, 8); // cria uma nova string
		System.out.println(txt1 == txt2); // false
		System.out.println(txt1.equals(str.substring(3, 8))); // true

		String h = new String("hello"); // Cria 2 objs
		String h1 = "hello "; // Nao cria um novo objeto porque recupera do pool
		String w = "world"; // Cria um novo objeto e coloca no pool

		System.out.println("hello "); // Recupera do pool e nao cria um novo objeto
		System.out.println(h1 + "world"); // Concatenacao de strings cria um novo objeto
		System.out.println("Hello " == h1); // Cria novo objeto porque a string está com H maiusculo

	}

}
