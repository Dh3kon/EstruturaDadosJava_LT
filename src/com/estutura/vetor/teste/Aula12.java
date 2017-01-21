package com.estutura.vetor.teste;

import java.util.ArrayList;

public class Aula12 {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>();

		arrayList.add("A");
		arrayList.add("C");

		System.out.println(arrayList);

		arrayList.add(1, "K");

		System.out.println(arrayList);

		boolean existe = arrayList.contains("A");
		if (existe) {
			System.out.println("O elemento existe no array");
		} else {
			System.out.println("O elemento não existe no array");
		}
		
		int pos = arrayList.indexOf("K");
		if (pos > -1) {
			System.out.println("O elemento existe no array " + pos);
		} else {
			System.out.println("O elemento não existe no array " + pos);
		}
		
		System.out.println(arrayList.get(2));
		
		arrayList.remove(0);
		arrayList.remove("K");
		
		System.out.println(arrayList);
		
		System.out.println(arrayList.size());
		
	}
}
