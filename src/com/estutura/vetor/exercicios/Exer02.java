package com.estutura.vetor.exercicios;

import java.util.ArrayList;

import com.estutura.vetor.Lista;

public class Exer02 {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>(5);
		arrayList.add("K");
		arrayList.add("M");
		arrayList.add("X");
		System.out.println(arrayList.lastIndexOf("X"));
		
		Lista<String> lista = new Lista<>(5);
		lista.adiciona("K");
		lista.adiciona("M");
		lista.adiciona("D");
		System.out.println(lista.ultimoIndice("D"));
		
	}
}
