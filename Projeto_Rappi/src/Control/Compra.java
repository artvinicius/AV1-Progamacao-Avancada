package Control;

import java.io.IOException;

import Model.Classificacao;
import Model.Pagamento;
import Model.Pedido;
import Model.Usuario;
import View.Operacoes;

public class Compra implements Pedido {

	Usuario usuario = new Usuario();
	Classificacao nivel = new Classificacao();
	Pagamento formaPagamento = new Pagamento();
	

	@Override
	public void compra(String modo) throws IOException {
		int teste = Classificacao.getPontuacao();
		String elo = nivel.elo(teste);

		if (modo.equals("dinheiro")) {
			if (usuario.getPontuacao() == 0 && usuario.getPontuacao() < 2000) {
				System.out.println("||============================================||");
				System.out.println("||=== Voce este na classificacao BRONZE ======||");
				System.out.println("||=== Voce GANHOU nesta compra 1000 pontos ===||");
				System.out.println("||============================================||");
				usuario.setPontuacao(1000);
				
				
			} else if (Classificacao.getPontuacao() >= 2000 && Classificacao.getPontuacao() < 4000) {
				System.out.println("||============================================||");
				System.out.println("||=== Voce esta na classificacao SILVER ======||");
				System.out.println("||=== Voce GANHOU nesta compra 1000 pontos ===||");
				System.out.println("||============================================||");
				nivel.setPontuacao(1000);
			} else if (Classificacao.getPontuacao() >= 4000 && Classificacao.getPontuacao() < 6000) {
				System.out.println("||============================================||");
				System.out.println("||=== Voce esta na classificacao GOLD ========||");
				System.out.println("||=== Voce GANHOU nesta compra 1000 pontos ===||");
				System.out.println("||============================================||");
				nivel.setPontuacao(1000);
			} else if (Classificacao.getPontuacao() >= 10000) {
				System.out.println("||============================================||");
				System.out.println("||=== Voce esta na classificacao DIAMANTE ====||");
				System.out.println("||=== Voce GANHOU nesta compra 1000 pontos ===||");
				System.out.println("||============================================||");
				nivel.setPontuacao(1000);
			}
		} else if (modo.equals("cartao")) {
			if (Classificacao.getPontuacao() == 0 && Classificacao.getPontuacao() < 2000) {
				System.out.println("||============================================||");
				System.out.println("||=== Voce este na classificacao BRONZE ======||");
				System.out.println("||=== Voce GANHOU nesta compra 1000 pontos ===||");
				System.out.println("||============================================||");
				nivel.setPontuacao(1000);
			} else if (Classificacao.getPontuacao() >= 2000 && Classificacao.getPontuacao() < 4000) {
				System.out.println("||============================================||");
				System.out.println("||=== Voce esta na classificacao SILVER ======||");
				System.out.println("||=== Voce GANHOU nesta compra 1000 pontos ===||");
				System.out.println("||============================================||");
				nivel.setPontuacao(1000);
			} else if (Classificacao.getPontuacao() >= 4000 && Classificacao.getPontuacao() < 6000) {
				System.out.println("||============================================||");
				System.out.println("||=== Voce esta na classificacao GOLD ========||");
				System.out.println("||=== Voce GANHOU nesta compra 1000 pontos ===||");
				System.out.println("||============================================||");
				nivel.setPontuacao(1000);
			} else if (Classificacao.getPontuacao() >= 10000) {
				System.out.println("||============================================||");
				System.out.println("||=== Voce esta na classificacao DIAMANTE ====||");
				System.out.println("||=== Voce GANHOU nesta compra 1000 pontos ===||");
				System.out.println("||============================================||");
				nivel.setPontuacao(1000);
			}
		}
	}

//	@Override
//	public void desconto() {
//
//	}
//
//	@Override
//	public void brinde() {
//		// TODO Auto-generated method stub
//
//	}

}
