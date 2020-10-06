package View;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import Control.AdicionarUsuario;
import Control.Compra;
import Model.Classificacao;
import Model.Pagamento;
import Model.Usuario;

public class Operacoes {

	Scanner T = new Scanner(System.in);

	public void menu() throws IOException {
		String value;
		boolean resultado = false;
		while (!resultado) {
			System.out.println("||====================================||");
			System.out.println("||       [1] - Criar Conta            ||");
			System.out.println("||       [2] - Logar conta existente  ||");
			System.out.println("||                                    ||");
			System.out.println("||       [0] - Encerrar               ||");
			System.out.println("||====================================||");
			System.out.println("");
			System.out.print("Digite uma opcao: ");
			value = T.nextLine();

			boolean validacao = true;

			if (validacao) {
				int opcao = Integer.parseInt(value);
				if (opcao >= 0 && opcao <= 2) {
					opcoesMenu(opcao);
					resultado = true;
				} else {
					System.out.println("");
					System.out.println("||---------------------------------||");
					System.out.println("||---------N�mero Invalido!--------||");
					System.out.println("||- Digite um numero entre 0 e 2 - ||");
					System.out.println("||---------------------------------||");
					System.out.println("");
				}
			}

		}
	}

	public void opcoesMenu(int opcao) throws IOException {
		switch (opcao) {
		case 1:
			exibirMenuAdicionar();
			break;
		case 2:
			exibirMenuLogin();

			break;
		case 0:
			sairDoSistema();
			break;
		default:

			break;
		}

	}

	public void exibirMenuLogin() throws IOException {
		String value;
		boolean resultado = false;
		int opcaoAdicionar = 0;

		while (!resultado) {
			System.out.println("");
			System.out.println("||====================================||");
			System.out.println("||       [1] - Avancar                ||");
			System.out.println("||       [2] - Voltar                 ||");
			System.out.println("||====================================||");
			System.out.println("");
			System.out.print("Escolha uma op��es: ");
			value = T.nextLine();
			boolean validacao = true;
			if (validacao == true) {
				opcaoAdicionar = Integer.parseInt(value);
				if (opcaoAdicionar == 1) {
					login();
					resultado = true;
				} else if (opcaoAdicionar == 2) {
					menu();

				} else {
					System.out.println("");
					System.out.println("||----------------------------------||");
					System.out.println("||---------N�mero Invalido!---------||");
					System.out.println("|| - Digite um numero entre 0 e 2 - ||");
					System.out.println("||----------------------------------||");
					System.out.println("");
				}
			}
		}
	}

	public void exibirMenuAdicionar() throws IOException {

		String value;
		boolean resultado = false;
		int opcaoAdicionar = 0;

		while (!resultado) {
			System.out.println("");
			System.out.println("||====================================||");
			System.out.println("||       [1] - Avan�ar                ||");
			System.out.println("||       [2] - Voltar                 ||");
			System.out.println("||====================================||");
			System.out.println("");
			System.out.print("Escolha uma opcoes: "); 
			value = T.nextLine();

			boolean validacao = true;

			if (validacao == true) {
				opcaoAdicionar = Integer.parseInt(value);
				if (opcaoAdicionar == 1) {
					addUsuario();
					resultado = true;
				} else if (opcaoAdicionar == 2) {
					menu();

				} else {
					System.out.println("");
					System.out.println("||----------------------------------||");
					System.out.println("||---------N�mero Inv�lido!---------||");
					System.out.println("|| - Digite um numero entre 0 e 2 - ||");
					System.out.println("||----------------------------------||");
					System.out.println("");
				}
			}
		}
	}

	private void sairDoSistema() {
		System.out.println("||--------------------||");
		System.out.println("|| Sistema Encerrado! ||");
		System.out.println("||--------------------||");
		System.exit(0);
	}

	private void addUsuario() throws IOException {
		Usuario usuarios[];
		usuarios = new Usuario[2];
		usuarios[0] = new Usuario("Lucas", "Eduardo", "XXXXX", "masculino", 1, "lucas@gmail.com", 10000, "DIAMANTE");
		usuarios[1] = new Usuario("Ph", "Brito", "XXXXX", "masculino", 2, "Ph@gmail.com", Classificacao.getPontuacao(),
				"BRONZE");
		AdicionarUsuario.escreverArquivo(usuarios[0]);
		System.out.println("Adicionado um usuario predefinido");
		System.out.println("");
	}

	public void login() throws IOException {
		Scanner T = new Scanner(System.in);
		String nome = "", numCelular = "", texto = "";

		String path = "D:\\Projeto/usuarios.txt";

		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
		while (true) {
			if (linha != null) {
				texto = linha;
			} else
				break;
			linha = buffRead.readLine();
		}
		buffRead.close();
		String resultado[] = texto.split(",");

		System.out.print("Digite o nome do usuario: ");
		nome = T.next();
		System.out.print("Digite o numero de celular: ");
		numCelular = T.next();

		if (nome.equals(resultado[0]) && numCelular.equals(resultado[2])) {
			exibirMenuPedido();
		} else {
			System.out.println("");
			System.out.println("||--------------------||");
			System.out.println("||   Login Errado!    ||");
			System.out.println("||--------------------||");
			login();
		}
	}

	public void exibirMenuPedido() throws IOException {
		String value;
		boolean resultado = false;
		int opcaoAdicionar = 0;

		while (!resultado) {
			System.out.println("");
			System.out.println("||====================================||");
			System.out.println("||       [1] - Realizar Busca         ||");
			System.out.println("||       [2] - Carrinho de compras    ||");
			System.out.println("||       [3] - Voltar                 ||");
			System.out.println("||====================================||");
			System.out.println("");
			System.out.print("Escolha uma opcao: ");
			value = T.nextLine();

			boolean validacao = true;

			if (validacao == true) {
				opcaoAdicionar = Integer.parseInt(value);
				if (opcaoAdicionar == 1) {
					fazerPedido();
					resultado = true;
				} else if (opcaoAdicionar == 2) {
					carrinho();

				} else {
					System.out.println("");
					System.out.println("||----------------------------------||");
					System.out.println("||---------Numero Invalido!---------||");
					System.out.println("|| - Digite um numero entre 0 e 2 - ||");
					System.out.println("||----------------------------------||");
					System.out.println("");
				}
			}
		}
	}

	public void fazerPedido() throws IOException {

		Compra compra = new Compra();
		String value;
		int opc = 0;
		
		System.out.println("");
		System.out.print("O que voc� procura?: ");
		value = T.nextLine();

		if (value.equals("pao")) {
			System.out.println("Encontramos a loja Banquete");
			System.out.println("");
			System.out.println("||============ CARDAPIO ============||");
			System.out.println("||         [1] SUCOS   R$5,00       ||");
			System.out.println("||==================================||");
			System.out.println("");
			System.out.print("Escolha a sua opcao: ");
			opc = T.nextInt();
			if (opc == 1) {
				System.out.print("Escolha a forma de pagamento: ");
				compra.compra(T.next());
				

			}

		}
	}

	public void carrinho() {

	}

}
