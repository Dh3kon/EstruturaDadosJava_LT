package com.estutura.vetor.teste;

import com.estutura.vetor.VetorObjetos;

public class Aula10Especial {

	public static void main(String[] args) {
		
		VetorObjetos vetor = new VetorObjetos(3);

		Contato c1 = new Contato("Contato 1", "1239-5678", "contato1@teste.com");
		Contato c2 = new Contato("Contato 2", "1236-5678", "contato2@teste.com");
		Contato c3 = new Contato("Contato 3", "1235-5678", "contato3@teste.com");
		Contato c4 = new Contato("Contato 3", "1235-5678", "contato3@teste.com");
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		
		System.out.println("Tamanho: " + vetor.tamanho());
		
		int pos = vetor.busca(c4);
		if (pos > -1) {
			System.out.println("O elemento existe no vetor");
		} else {
			System.out.println("O elemento não existe no vetor");
		}
		
		System.out.println(vetor);
		
	}
}
