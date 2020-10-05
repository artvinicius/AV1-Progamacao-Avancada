package View;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import Control.AdicionarUsuario;
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
			System.out.println("||       [3] - Criar Conta            ||");
			System.out.println("||       [0] - Encerrar               ||");
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
					System.out.println("||---------------------------------||");
					System.out.println("||---------Número Inválido!--------||");
					System.out.println("||- Digite um número entre 0 e 4 - ||");
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
		case 3:

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

	public void exibirMenuLogin() throws IOException {
		String value;
		boolean resultado = false;
		int opcaoAdicionar = 0;

		while (!resultado) {
			System.out.println("");
			System.out.println("||====================================||");
			System.out.println("||       [1] - Avançar                ||");
			System.out.println("||       [2] - Voltar                 ||");
			System.out.println("||====================================||");
			System.out.println("");
			System.out.print("Escolha uma opção: ");
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
					System.out.println("||---------Número Inválido!---------||");
					System.out.println("|| - Digite um número entre 0 e 2 - ||");
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
			System.out.println("||       [1] - Avançar                ||");
			System.out.println("||       [2] - Voltar                 ||");
			System.out.println("||====================================||");
			System.out.println("");
			System.out.print("Escolha uma opção: ");
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
					System.out.println("||---------Número Inválido!---------||");
					System.out.println("|| - Digite um número entre 0 e 2 - ||");
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
		Classificacao nivel = new Classificacao();
		Usuario usuarios[];
		usuarios = new Usuario[2];
		usuarios[0] = new Usuario("Lucas", "Eduardo", "XXXXX", "masculino", 1, "lucas@gmail.com", nivel);
		usuarios[1] = new Usuario("Ph", "Brito", "XXXXX", "masculino", 2, "Ph@gmail.com", nivel);
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
		
		if(nome.equals(resultado[0]) && numCelular.equals(resultado[2])) {
			exibirMenuPedido();
		}else {
			System.out.println("");
			System.out.println("||--------------------||");
			System.out.println("||   Login Errado!    ||");
			System.out.println("||--------------------||");
			login();
		}
	}
	
	public void exibirMenuPedido() {
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
			System.out.print("Escolha uma opção: ");
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
					System.out.println("||---------Número Inválido!---------||");
					System.out.println("|| - Digite um número entre 0 e 2 - ||");
					System.out.println("||----------------------------------||");
					System.out.println("");
				}
			}
		}
	}
	
	public void fazerPedido() {
		
		String value;
		int opc = 0;
		String pagamento;
		
		System.out.println("");
		System.out.print("O que voc� procura: ");
		value = T.nextLine();
		
		if(value.equals("pao")) {
			System.out.println("Encontramos a loja Banquete");
			System.out.println("");
			System.out.println("||============ CARDAPIO ============||");
			System.out.println("||         [1] SUCOS   R$5,00       ||");
			System.out.println("||==================================||");
			System.out.println("");
			System.out.print("Escolha a sua opção: ");
			opc = T.nextInt();
			if(opc == 1) {
				System.out.println("Escolha a forma de pagamento: ");
				pagamento = T.next();
			}
			
		}
	}
	
	public void carrinho() {
		
	}

}
