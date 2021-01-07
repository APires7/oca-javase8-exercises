package com.args;

public class MainTest {

	public static void main(String[] args) {
		
		
		

	}
	
	public int palindromo(int valor) {
		int num, invertido, digito;
		
		digito = valor;
		
		num = digito;
		invertido = 0;
		
		while (num != 0) {
			digito = num % 10;
			invertido = (invertido * 10) + digito;
			num = num % 10;
		}
		
		if(valor == invertido) {
			return 1;
		} else {
			return 0;
		}
		
	}

}
