package com.strings;

public class TestaComparaSwitch {

	public static void main(String[] args) {
		// argumento do switch int, e cases int
		int valor = 20;
		switch (valor) {
		case 10:
			System.out.println(10);
		case 20:
			System.out.println(20);
		}

		// Argumento String, e cases String
		String s = "Oi";
		switch (s) {
		case "Oi":
			System.out.println("Olá");
		case "Hi":
			System.out.println("Hello");
		}

		// Argumento Byte, e cases byte
		Byte b = 10;
		switch (b) {
		case 10:
			System.out.println("DEZ");
		}

		// argumento do switch int, e cases string, não compila
		int mix = 20;
		switch (mix) {
		case "10":
			System.out.println(10);
		case "20":
			System.out.println(20);
		}

		// Cuidado pois switch de double não faz sentido conforme a lista de argumentos
		// que citamos compatíveis com o switch
		double mix = 20;
		switch (mix) { // não compila
		case 10.0:
			System.out.println(10);
		case 20.0:
			System.out.println(20);
		}
	}
}