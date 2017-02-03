package com.estrutura.fila.teste;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Aula25 {

	public static void main(String[] args) {

		Queue<Paciente> filaComPrioridade = new PriorityQueue<>(new Comparator<Paciente>() {

			@Override
			public int compare(Paciente o1, Paciente o2) {
				/*if (o1.getPrioridade() > o2.getPrioridade()) {
					return 1;
				} else if (o1.getPrioridade() < o2.getPrioridade()) {
					return -1;
				}
				return 0;*/
				return Integer.valueOf(o1.getPrioridade()).compareTo(o2.getPrioridade());
			}

		});
		filaComPrioridade.add(new Paciente("A", 2));
		filaComPrioridade.add(new Paciente("B", 1));
		System.out.println(filaComPrioridade);
	}
}
