package com.estutura.pilha.exercicios;

import java.util.Scanner;

import com.estutura.pilha.Pilha;

public class Exer02 {

	public static void main(String[] args) {

		Pilha<Integer> par = new Pilha<>();
		Pilha<Integer> impar = new Pilha<>();
		Scanner scan = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite um n�mero: ");
			int num = scan.nextInt();

			if (num == 0) {
				// Pilha par
				Integer desempilhado = par.desempilha();

				if (desempilhado == null) {
					System.out.println("Pilha par vazia");
				} else {
					System.out.println("Desempilhando da pilha par: " + desempilhado);
				}

				// Pilha impar
				desempilhado = impar.desempilha();

				if (desempilhado == null) {
					System.out.println("Pilha impar vazia");
				} else {
					System.out.println("Desempilhando da pilha impar: " + desempilhado);
				}
			} else if (num % 2 == 0) {
				System.out.println("N�mero par, empilhando na pilha par " + num);
				par.empilha(num);
			} else {
				System.out.println("N�mero par, empilhando na pilha par " + num);
				impar.empilha(num);
			}
		}

		System.out.println("Desempilhando todos os n�meros da pilha par");

		while (!par.estaVazia()) {
			System.out.println("Desempilhando da pilha par: " + par.desempilha());
		}

		System.out.println("Desempilhando todos os n�meros da pilha impar");

		while (!impar.estaVazia()) {
			System.out.println("Desempilhando da pilha impar: " + impar.desempilha());
		}
	}
}
