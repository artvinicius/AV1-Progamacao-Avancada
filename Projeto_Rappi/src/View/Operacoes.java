package View;

import java.util.Scanner;

public class Operacoes {
	
	Scanner T = new Scanner(System.in);
	
	public void menu() {
		String value;
		boolean resultado = false;
		while(resultado) {
			System.out.println("||====================================||");
			System.out.println("|| [1] - Criar Conta                  ||");
			System.out.println("|| [2] - Logar conta existente        ||");
			System.out.println("|| [3] - Criar Conta                  ||");
			System.out.println("|| [0] - Encerrar                     ||");
			System.out.println("||====================================||");
			System.out.println("");
			System.out.print("Digite uma opção: ");
			value = T.nextLine();
			
			boolean validacao = true;
			
			if (validacao) {
				int opcao = Integer.parseInt(value);
				if (opcao >= 0 && opcao <= 3) {
					opcoesMenu(opcao);
					resultado = true;
				} else {
					System.out.println("");
					System.out.println("----------------------------");
					System.out.println("------Número Inválido!------");
					System.out.println("Digite um número entre 0 e 4");
					System.out.println("----------------------------");
					System.out.println("");
				}
			}
			
		}
	}
	public void opcoesMenu(int opcao) {
		switch (opcao) {
		case 1:
			exibirMenuAdicionar();
			break;
		case 2:
//			excluirPedido();

			break;
		case 3:
			// exibirEdicaoDeLivro();
			// menu();
			break;
		case 4:
			
			break;
		case 0:
			sairDoSistema();
			break;
		default:

			break;
		}

	}
	
	public void exibirMenuAdicionar() {

		String value;
		boolean resultado = false;
		int opcaoAdicionar = 0;

		while (!resultado) {
			System.out.println("");
			System.out.println("||====================================||");
			System.out.println("|| [1] - Adicionar Nome               ||");
			System.out.println("|| [2] - Adicionar Autor              ||");
			System.out.println("|| [3] - Adicionar Editora            ||");
			System.out.println("|| [4] - Tipo do Livro                ||");
			System.out.println("|| [5] - Salvar Livro                 ||");
			System.out.println("||====================================||");
			System.out.print("Qual campo você deseja adicionar?: ");
			value = T.nextLine();

			
			boolean validacao = true;
			
			if (validacao == true) {
				opcaoAdicionar = Integer.parseInt(value);
				if (opcaoAdicionar >= 1 && opcaoAdicionar <= 8) {
//					menuAdicionar(opcaoAdicionar);
					resultado = true;
				} else {
					System.out.println("");
					System.out.println("----------------------------");
					System.out.println("------Número Inválido!------");
					System.out.println("Digite um número entre 1 e 8");
					System.out.println("----------------------------");
					System.out.println("");
				}
			}
		}
	}
	private void sairDoSistema() {
		System.out.println("------------------");
		System.out.println("Sistema Encerrado!");
		System.out.println("------------------");
		System.exit(0);
	}

}
