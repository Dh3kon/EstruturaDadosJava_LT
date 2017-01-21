package com.estutura.vetor.exercicios;

import java.util.ArrayList;

import com.estutura.vetor.Lista;

public class Exer05 {

	public static void main(String[] args) {

		ArrayList<String> array = new ArrayList<>(5);

		array.add("A");
		array.add("B");
		array.add("C");
		array.add("D");
		array.add("E");
		System.out.println(array);
		array.clear();
		System.out.println(array);
		
		Lista<String> lista = new Lista<>(5);

		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		lista.adiciona("E");

		System.out.println(lista);
		lista.limpar();
		System.out.println(lista);

	}
}
