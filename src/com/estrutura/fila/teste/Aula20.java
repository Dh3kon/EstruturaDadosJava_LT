package com.estrutura.fila.teste;

import com.estrutura.fila.Fila;

public class Aula20 {

	public static void main(String[] args) {
		
		Fila<Integer> fila = new Fila();
		fila.enfileirar(1);
		fila.enfileirar(2);
		fila.enfileirar(3);
		fila.enfileirar(4);
		fila.enfileirar(5);
		
		System.out.println(fila.estaVazia());
		System.out.println(fila.tamanho());
		System.out.println(fila.toString());
	}
}
