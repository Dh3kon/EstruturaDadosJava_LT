package com.estutura.vetor.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

import com.estutura.vetor.teste.Contato;

public class Exer07 extends Exer06a{

	public static void main(String[] args) {

		// cria��o das vari�veis
		Scanner scan = new Scanner(System.in);
		// criar vetor com 20 de capacidade
		ArrayList<Contato> lista = new ArrayList<Contato>(20);
		// criar e adicionar X contatos
		criarContatosDinamicamente(5, lista);
		// criar um menu para que o usu�rio escolha a op��o
		int opcao = 1;

		while (opcao != 0) {
			opcao = obterOpcaoMenu(scan);

			switch (opcao) {
			case 1:
				adicionarContatoFinal(scan, lista);
				break;
			case 2:
				adicionarContatoPosicao(scan, lista);
				break;
			case 3:
				obterContatoPosicao(scan, lista);
				break;
			case 4:
				obterContato(scan, lista);
				break;
			case 5:
				pesquisarUltimoContato(scan, lista);
				break;
			case 6:
				pesquisarContatoExiste(scan, lista);
				break;
			case 7:
				excluirPorPosicao(scan, lista);
				break;
			case 8:
				excluirContato(scan, lista);
				break;
			case 9:
				imprimirTamanhoVetor(lista);
				break;
			case 10:
				limparVetor(lista);
				break;
			case 11:
				imprimirVetor(lista);
				break;
			case 0:
				System.exit(0);
				break;
			default:
				break;
			}
		}

		System.out.println("Usu�rio digitou 0, sistema finalizado");
	}

	private static void imprimirVetor(ArrayList<Contato> lista) {

		System.out.println(lista);
	}

	private static void limparVetor(ArrayList<Contato> lista) {

		lista.clear();
		System.out.println("Todos os cadastros foram exclu�dos");
	}

	private static void imprimirTamanhoVetor(ArrayList<Contato> lista) {
		
		System.out.println("Tamanho do vetor � de : " + lista.size());
	}

	private static void excluirPorPosicao(Scanner scan, ArrayList<Contato> lista) {

		int pos = leInformacaoInt("Digite a posi��o a ser removida: ", scan);
		try {

			lista.remove(pos);
			System.out.println("Contato exclu�do");
		} catch (Exception e) {
			System.out.println("Posi��o inv�lida");
		}
	}

	private static void excluirContato(Scanner scan,ArrayList<Contato> lista) {

		int pos = leInformacaoInt("Digite a posi��o a ser removida: ", scan);
		try {

			Contato contato = lista.get(pos);
			lista.remove(contato);
			System.out.println("Contato exclu�do");
		} catch (Exception e) {
			System.out.println("Posi��o inv�lida");
		}
	}

	private static void pesquisarContatoExiste(Scanner scan, ArrayList<Contato> lista) {

		int pos = leInformacaoInt("Digite a posi��o a ser pesquisada: ", scan);
		try {

			Contato contato = lista.get(pos);
			boolean existe = lista.contains(contato);
			if (existe) {
				System.out.println("Contato existe, seguem os dados: ");
				System.out.println(contato);
			} else {
				System.out.println("Contato n�o existe");
			}

			System.out.println("Contato encontrado na posi��o " + pos);
		} catch (Exception e) {
			System.out.println("Posi��o inv�lida");
		}
	}

	private static void pesquisarUltimoContato(Scanner scan, ArrayList<Contato> lista) {

		int pos = leInformacaoInt("Digite a posi��o a ser pesquisada: ", scan);
		try {
			Contato contato = lista.get(pos);
			System.out.println("Contato existe, seguem os dados: ");
			System.out.println(contato);
			System.out.println("Fazendo pesquisa do �ltimo �ndice do contato encontrado:");
			pos = lista.lastIndexOf(contato);
			System.out.println("Contato encontrado na posi��o " + pos);
		} catch (Exception e) {
			System.out.println("Posi��o inv�lida");
		}
	}

	private static void obterContato(Scanner scan, ArrayList<Contato> lista) {

		int pos = leInformacaoInt("Digite a posi��o a ser pesquisada: ", scan);
		try {
			Contato contato = lista.get(pos);
			System.out.println("Contato existe, seguem os dados: ");
			System.out.println(contato);
			System.out.println("Fazendo pesquisa do contato encontrado:");
			pos = lista.indexOf(contato);
			System.out.println("Contato encontrado na posi��o " + pos);
		} catch (Exception e) {
			System.out.println("Posi��o inv�lida");
		}
	}

	private static void obterContatoPosicao(Scanner scan, ArrayList<Contato> lista) {
		
		int pos = leInformacaoInt("Digite a posi��o a ser pesquisada: ", scan);
		try {
			Contato contato = lista.get(pos);
			System.out.println("Contato existe, seguem os dados: ");
			System.out.println(contato);
		} catch (Exception e) {
			System.out.println("Posi��o inv�lida");
		}
	}

	private static void adicionarContatoFinal(Scanner scan, ArrayList<Contato> lista) {

		System.out.println("Criando um contato, entre com as informa��es: ");
		String nome = leInformacao("Digite o nome: ", scan);
		String telefone = leInformacao("digite o telefone: ", scan);
		String email = leInformacao("Digite o email", scan);

		Contato contato = new Contato(nome, telefone, email);
		lista.add(contato);
		System.out.println("Contato adicionado com sucesso!");
		System.out.println(contato);
	}

	private static void adicionarContatoPosicao(Scanner scan, ArrayList<Contato> lista) {

		System.out.println("Criando um contato, entre com as informa��es: ");
		String nome = leInformacao("Digite o nome: ", scan);
		String telefone = leInformacao("digite o telefone: ", scan);
		String email = leInformacao("Digite o email", scan);

		Contato contato = new Contato(nome, telefone, email);
		int pos = leInformacaoInt("Digite a posi��o para adicionar o contato: ", scan);
		try {
			lista.add(pos, contato);
			System.out.println("Contato adicionado com sucesso!");
			System.out.println(contato);
		} catch (Exception e) {
			System.out.println("Posi��o inv�lida, contato n�o adicionado");
		}
	}

	private static void criarContatosDinamicamente(int quantidade, ArrayList<Contato> lista) {

		Contato contato;
		for (int i = 1; i <= quantidade; i++) {

			contato = new Contato();
			contato.setNome("Contato " + i);
			contato.setTelefone("1111-111" + i);
			contato.setEmail("contato" + i + "@email.com");
			lista.add(contato);
		}
	}
}
