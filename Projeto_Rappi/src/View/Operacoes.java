package View;

import java.io.IOException;
import java.util.Scanner;

import Control.AdicionarUsuario;
import Model.Classificacao;
import Model.Usuario;

public class Operacoes {
	
	Scanner T = new Scanner(System.in);
	
	public void menu() throws IOException {
		String value;
		boolean resultado = false;
		while(!resultado) {
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
//			excluirPedido();

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
			System.out.print("Escolha uma opção: ");
			value = T.nextLine();

			boolean validacao = true;
			
			if (validacao == true) {
				opcaoAdicionar = Integer.parseInt(value);
				if (opcaoAdicionar == 1) {
					addUsuario();
//					System.out.println("sim");
					resultado = true;
				} else if(opcaoAdicionar == 2){
					menu();
					
				}else {
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
		AdicionarUsuario.serializarListaUsuario(usuarios);
		System.out.println("Adicionado um usuario predefinido");
		System.out.println("");
		AdicionarUsuario.desserializarListaUsuario();
	}

}
