package com.arrays;

public class ArraysEstranhos {

	public static void main(String[] args) {
		int[][] numeros = new int[2][2];

		int[][] cubo[];
		int[][] dimensao4[][];

		int[][] teste = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] estranhao = new int[2][];
		estranhao[0] = new int[20];
		estranhao[1] = new int[10];

		for (int i = 0; i < estranhao.length; i++) {
			System.out.println(estranhao[i].length);
		}

	}

}
