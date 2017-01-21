package com.estutura.vetor.teste;

import com.estutura.vetor.Lista;

public class Aula11 {

	public static void main(String[] args) {
		
		Lista<String> vetor = new Lista<String>(1);
		
		vetor.adiciona("Elemento");
		
		System.out.println(vetor);
		
		Lista<Contato> vetor2 = new Lista<>(1);
		
		Contato c1 = new Contato("Contato 1", "1239-5678", "contato1@teste.com");
		vetor2.adiciona(c1);
		System.out.println(vetor2);
	}
}
