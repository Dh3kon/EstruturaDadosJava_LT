package com.estutura.vetor;

import java.util.Arrays;

public class VetorObjetos {

	private Object[] elementos;
	private int tamanho;

	public VetorObjetos(int capacidade) {
		this.elementos = new Object[capacidade];
		this.tamanho = 0;
	}

	public void adiciona2(Object elemento) {// M� pr�tica
		this.aumentaCapacidade();
		for (int i = 0; i < this.elementos.length; i++) {
			if (this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
	}

	public void adiciona1(Object elemento) throws Exception {
		this.aumentaCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		} else {
			throw new Exception("Vetor cheio, n�o � poss�vel adicionar novos elementos");
		}
	}

	public boolean adiciona(Object elemento) {
		this.aumentaCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}

	public boolean adiciona(int posicao, Object elemento) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posi��o inv�lida");
		}

		this.aumentaCapacidade();

		// mover todos os elementos
		for (int i = (this.tamanho - 1); i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;

		return true;
	}

	public void remove(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posicao inv�lida");
		}

		for (int i = posicao; i < (tamanho - 1); i++) {
			this.elementos[i] = this.elementos[i + 1];
		}
		this.tamanho--;
	}

	private void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			Object[] elementosNovos = new String[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

	public Object busca(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posi��o inv�lida");
		}
		return this.elementos[posicao];
	}

	public boolean busca1(Object elemento) {
		for (int i = 0; i < tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return true;
			}
		}
		return false;
	}

	public int busca(Object elemento) {
		for (int i = 0; i < tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}

	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}
		s.append("]");
		return s.toString();
	}
}
