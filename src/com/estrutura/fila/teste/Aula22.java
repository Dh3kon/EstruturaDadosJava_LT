package com.estrutura.fila.teste;

import com.estrutura.fila.Fila;

public class Aula22 {

	public static void main(String[] args) {
		
		Fila<Integer> fila = new Fila<>();
		
		fila.enfileirar(1);
		fila.enfileirar(2);
		fila.enfileirar(3);
		fila.enfileirar(4);
		
		System.out.println(fila);
		
		System.out.println(fila.desenfileirar());
		System.out.println(fila);
		System.out.println(fila.desenfileirar());
		System.out.println(fila);
		System.out.println(fila.desenfileirar());
		System.out.println(fila);
	}
}
