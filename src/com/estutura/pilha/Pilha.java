package com.estutura.pilha;

import com.estutura.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica{

	public Pilha() {
		super();
	}
	
	public Pilha(int capacidade){
		super(capacidade);
	}
	
	@SuppressWarnings("unchecked")
	public void empilha(T elemento) {
		super.adiciona(elemento);
	}
	
	public boolean estaVazia() {
		return this.tamanho == 0;
	}
	
	public T topo() {
		
		if (this.estaVazia()) {
			return null;
		}
		
		return (T) this.elementos[tamanho - 1];
	}
	
	@SuppressWarnings("unchecked")
	public T desempilha() {

		if (this.estaVazia()) {
			return null;
		}
		
		T elemento = (T) this.elementos[tamanho -1];
		tamanho--;
		
		return elemento;
		//return this.elementos[--tamanho];
	}
}
