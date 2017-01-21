package com.estutura.vetor.exercicios;

import java.util.Scanner;

import com.estutura.vetor.Lista;
import com.estutura.vetor.teste.Contato;

public class Exer06 {

	public static void main(String[] args) {

		// cria��o das vari�veis
		Scanner scan = new Scanner(System.in);
		// criar vetor com 20 de capacidade
		Lista<Contato> lista = new Lista<Contato>(20);
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
				imprimeTamanhoVetor(lista);
				break;
			case 10:
				limparVetor(lista);
				break;
			case 11:
				imprimeVetor(lista);
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

	private static void adicionarContatoFinal(Scanner scan, Lista<Contato> lista) {

		System.out.println("Criando um contato, entre com as informa��es: ");
		String nome = leInformacao("Digite o nome: ", scan);
		String telefone = leInformacao("digite o telefone: ", scan);
		String email = leInformacao("Digite o email", scan);

		Contato contato = new Contato(nome, telefone, email);
		lista.adiciona(contato);
		System.out.println("Contato adicionado com sucesso!");
		System.out.println(contato);
	}

	private static void adicionarContatoPosicao(Scanner scan, Lista<Contato> lista) {

		System.out.println("Criando um contato, entre com as informa��es: ");
		String nome = leInformacao("Digite o nome: ", scan);
		String telefone = leInformacao("digite o telefone: ", scan);
		String email = leInformacao("Digite o email", scan);

		Contato contato = new Contato(nome, telefone, email);
		int pos = leInformacaoInt("Digite a posi��o para adicionar o contato: ", scan);
		try {
			lista.adiciona(pos, contato);
			System.out.println("Contato adicionado com sucesso!");
			System.out.println(contato);
		} catch (Exception e) {
			System.out.println("Posi��o inv�lida, contato n�o adicionado");
		}
	}

	private static void obterContatoPosicao(Scanner scan, Lista<Contato> lista) {

		int pos = leInformacaoInt("Digite a posi��o a ser pesquisada: ", scan);
		try {
			Contato contato = lista.busca(pos);
			System.out.println("Contato existe, seguem os dados: ");
			System.out.println(contato);
		} catch (Exception e) {
			System.out.println("Posi��o inv�lida");
		}
	}

	private static void obterContato(Scanner scan, Lista<Contato> lista) {

		int pos = leInformacaoInt("Digite a posi��o a ser pesquisada: ", scan);
		try {
			Contato contato = lista.busca(pos);
			System.out.println("Contato existe, seguem os dados: ");
			System.out.println(contato);
			System.out.println("Fazendo pesquisa do contato encontrado:");
			pos = lista.busca(contato);
			System.out.println("Contato encontrado na posi��o " + pos);
		} catch (Exception e) {
			System.out.println("Posi��o inv�lida");
		}
	}

	private static void pesquisarUltimoContato(Scanner scan, Lista<Contato> lista) {

		int pos = leInformacaoInt("Digite a posi��o a ser pesquisada: ", scan);
		try {
			Contato contato = lista.busca(pos);
			System.out.println("Contato existe, seguem os dados: ");
			System.out.println(contato);
			System.out.println("Fazendo pesquisa do �ltimo �ndice do contato encontrado:");
			pos = lista.ultimoIndice(contato);
			System.out.println("Contato encontrado na posi��o " + pos);
		} catch (Exception e) {
			System.out.println("Posi��o inv�lida");
		}
	}

	private static void pesquisarContatoExiste(Scanner scan, Lista<Contato> lista) {

		int pos = leInformacaoInt("Digite a posi��o a ser pesquisada: ", scan);
		try {

			Contato contato = lista.busca(pos);
			boolean existe = lista.contem(contato);
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

	private static void excluirPorPosicao(Scanner scan, Lista<Contato> lista) {

		int pos = leInformacaoInt("Digite a posi��o a ser removida: ", scan);
		try {

			lista.remove(pos);
			System.out.println("Contato exclu�do");
		} catch (Exception e) {
			System.out.println("Posi��o inv�lida");
		}
	}

	private static void excluirContato(Scanner scan, Lista<Contato> lista) {

		int pos = leInformacaoInt("Digite a posi��o a ser removida: ", scan);
		try {

			Contato contato = lista.busca(pos);
			lista.remove(contato);
			System.out.println("Contato exclu�do");
		} catch (Exception e) {
			System.out.println("Posi��o inv�lida");
		}
	}

	private static void imprimeTamanhoVetor(Lista<Contato> lista) {

		System.out.println("O tamanho do vetor � de : " + lista.tamanho());
	}

	private static void limparVetor(Lista<Contato> lista) {

		lista.limpar();
		System.out.println("Todos os contatos foram excluidos");
	}

	private static void imprimeVetor(Lista<Contato> lista) {

		System.out.println(lista);
	}

	private static String leInformacao(String msg, Scanner scan) {

		System.out.println(msg);
		String entrada = scan.nextLine();
		return entrada;
	}

	private static int leInformacaoInt(String msg, Scanner scan) {

		int num = 0;
		boolean entradaValida = false;
		while (!entradaValida) {

			try {
				System.out.println(msg);
				String entrada = scan.nextLine();
				num = Integer.parseInt(entrada);
				entradaValida = true;
			} catch (Exception e) {
				System.out.println("Entrada inv�lida, digite novamente");
			}
		}

		return num;
	}

	private static int obterOpcaoMenu(Scanner scan) {

		int opcao = 0;
		String entrada;
		boolean entradaValida = false;
		while (!entradaValida) {

			System.out.println("Digite a op��o desejada: ");
			System.out.println("1: Adiciona um contato no final do vetor");
			System.out.println("2: Adiciona um contato em uma posi��o espec�fica do vetor");
			System.out.println("3: Busca um contato em uma posi��o espec�fica do vetor");
			System.out.println("4: Consulta um contato ");
			System.out.println("5: Consulta �ltimo �ndice do contato");
			System.out.println("6: Verifica se um contato existe");
			System.out.println("7: Excluir por posi��o");
			System.out.println("8: Excluir um contato");
			System.out.println("9: Verifica tamanho do vetor");
			System.out.println("10: Excluir todos os contatos do vetor");
			System.out.println("11: Imprime vetor");
			System.out.println("0: Sair");

			try {
				entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);
				if (opcao >= 0 && opcao <= 11) {
					entradaValida = true;
				} else {
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.println("Entrada inv�lida, digite novamente");
			}
		}

		return opcao;
	}

	private static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista) {

		Contato contato;
		for (int i = 1; i <= quantidade; i++) {

			contato = new Contato();
			contato.setNome("Contato " + i);
			contato.setTelefone("1111-111" + i);
			contato.setEmail("contato" + i + "@email.com");
			lista.adiciona(contato);
		}
	}
}
