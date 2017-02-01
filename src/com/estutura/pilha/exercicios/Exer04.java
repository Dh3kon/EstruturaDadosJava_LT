package com.estutura.pilha.exercicios;

import java.util.Stack;

public class Exer04 {

public static void main(String[] args) {
		
		Stack<Livro> pilha = new Stack<Livro>();
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
		
		System.out.println("Pilha de livros criada, pilha está vazia? " + pilha.isEmpty());
		System.out.println("Empilhando livros na pilha");
		
		pilha.push(livro1);
		pilha.push(livro2);
		pilha.push(livro3);
		pilha.push(livro4);
		
		System.out.println(pilha.size() + " livros foram empilhados");
		System.out.println(pilha);
		
		System.out.println("Pilha de livros criada, pilha está vazia? " + pilha.isEmpty());
		System.out.println("Espiando o topo da pilha: " + pilha.peek());
		System.out.println("Desempilhando livros da pilha");
		
		while(!pilha.isEmpty()) {
			System.out.println("Desempilhando livro: " + pilha.pop());
		}
		
		System.out.println("Todos os livros foram desempilhados, pilha vazia " + pilha.isEmpty());
	}
}
