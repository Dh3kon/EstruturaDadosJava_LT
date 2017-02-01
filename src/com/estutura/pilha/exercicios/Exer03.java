package com.estutura.pilha.exercicios;

import com.estutura.pilha.Pilha;

public class Exer03 {

	public static void main(String[] args) {
		
		Pilha<Livro> pilha = new Pilha<>(20);
		Livro livro1 = new Livro();
		livro1.setNome("Java Estrutura de Dados");
		livro1.setAutor("Master java");
		livro1.setAnoLancamento(2017);
		livro1.setIsbn("abc123456kjh");
		
		Livro livro2 = new Livro();
		livro2.setNome("C# Estrutura de Dados");
		livro2.setAutor("Master C#");
		livro2.setAnoLancamento(2017);
		livro2.setIsbn("abd123456kjh");
		
		Livro livro3 = new Livro();
		livro3.setNome("Phytom Estrutura de Dados");
		livro3.setAutor("Master Phytom");
		livro3.setAnoLancamento(2017);
		livro3.setIsbn("abc12345fkjh");
		
		Livro livro4 = new Livro();
		livro4.setNome("Javascript Estrutura de Dados");
		livro4.setAutor("Master javascript");
		livro4.setAnoLancamento(2017);
		livro4.setIsbn("abc123556kjh");
		
		System.out.println("Pilha de livros criada, pilha está vazia? " + pilha.estaVazia());
		System.out.println("Empilhando livros na pilha");
		
		pilha.empilha(livro1);
		pilha.empilha(livro2);
		pilha.empilha(livro3);
		pilha.empilha(livro4);
		
		System.out.println(pilha.tamanho() + " livros foram empilhados");
		System.out.println(pilha);
		
		System.out.println("Pilha de livros criada, pilha está vazia? " + pilha.estaVazia());
		System.out.println("Espiando o topo da pilha: " + pilha.topo());
		System.out.println("Desempilhando livros da pilha");
		
		while(!pilha.estaVazia()) {
			System.out.println("Desempilhando livro: " + pilha.desempilha());
		}
		
		System.out.println("Todos os livros foram desempilhados, pilha vazia " + pilha.estaVazia());
	}
}
