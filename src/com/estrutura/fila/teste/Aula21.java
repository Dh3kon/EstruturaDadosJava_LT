package com.estrutura.fila.teste;

import com.estrutura.fila.Fila;

public class Aula21 {

	public static void main(String[] args) {
		
		Fila<Integer> fila = new Fila<>();
		fila.enfileirar(1);
		fila.enfileirar(2);
		fila.enfileirar(3);
		System.out.println(fila.espiar());
		System.out.println(fila.toString());
	}
}
