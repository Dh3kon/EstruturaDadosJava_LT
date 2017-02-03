package com.estrutura.fila.teste;

import com.estrutura.fila.FilaComPrioridade;

public class Aula24 {

	public static void main(String[] args) {
		
		FilaComPrioridade<Integer> fila = new FilaComPrioridade();
		fila.enfileirar(1);
		fila.enfileirar(3);
		fila.enfileirar(2);
		
		System.out.println(fila);
		
		FilaComPrioridade<Paciente> fila2 = new FilaComPrioridade();
		fila2.enfileirar(new Paciente("A", 2));
		fila2.enfileirar(new Paciente("C", 1));
		fila2.enfileirar(new Paciente("B", 3));
		
		System.out.println(fila2);
	}
}
