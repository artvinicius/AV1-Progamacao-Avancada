package Control;

import Model.Classificacao;
import Model.Pagamento;
import Model.Pedido;
import Model.Usuario;

public class Compra implements Pedido {

	Usuario usuario = new Usuario();
	Classificacao nivel = new Classificacao();
	Pagamento formaPagamento = new Pagamento();

	@Override
	public void compra(String modo) {
		int teste = Classificacao.getPontuacao();
		String elo = nivel.elo(teste);

		if(modo.equals("dinheiro")) {
			if (Classificacao.getPontuacao() == 0 && Classificacao.getPontuacao() < 2000) {
				System.out.println("||============================================||");
				System.out.println("||=== Você está na classificação BRONZE ======||");
				System.out.println("||=== Você GANHOU nesta compra 1000 pontos ===||");
				System.out.println("||============================================||");
				nivel.setPontuacao(1000);
			}else if (Classificacao.getPontuacao() >= 2000 && Classificacao.getPontuacao() < 4000 ) {
				System.out.println("||============================================||");
				System.out.println("||=== Você está na classificação SILVER ======||");
				System.out.println("||=== Você GANHOU nesta compra 1000 pontos ===||");
				System.out.println("||============================================||");
				nivel.setPontuacao(1000);
			}else if (Classificacao.getPontuacao() >= 4000 && Classificacao.getPontuacao() < 6000 ) {
				System.out.println("||============================================||");
				System.out.println("||=== Você está na classificação GOLD ========||");
				System.out.println("||=== Você GANHOU nesta compra 1000 pontos ===||");
				System.out.println("||============================================||");
				nivel.setPontuacao(1000);
			}else if (Classificacao.getPontuacao() >= 10000 ) {
				System.out.println("||============================================||");
				System.out.println("||=== Você está na classificação DIAMANTE ====||");
				System.out.println("||=== Você GANHOU nesta compra 1000 pontos ===||");
				System.out.println("||============================================||");
				nivel.setPontuacao(1000);
			}
		}else if(modo.equals("cartao")) {
			if (Classificacao.getPontuacao() == 0 && Classificacao.getPontuacao() < 2000) {
				System.out.println("||============================================||");
				System.out.println("||=== Você está na classificação BRONZE ======||");
				System.out.println("||=== Você GANHOU nesta compra 1000 pontos ===||");
				System.out.println("||============================================||");
				nivel.setPontuacao(1000);
			}
			if (Classificacao.getPontuacao() >= 2000 && Classificacao.getPontuacao() < 4000 ) {
				System.out.println("||============================================||");
				System.out.println("||=== Você está na classificação SILVER ======||");
				System.out.println("||=== Você GANHOU nesta compra 1000 pontos ===||");
				System.out.println("||============================================||");
				nivel.setPontuacao(1000);
			}
			if (Classificacao.getPontuacao() >= 4000 && Classificacao.getPontuacao() < 6000 ) {
				System.out.println("||============================================||");
				System.out.println("||=== Você está na classificação GOLD ========||");
				System.out.println("||=== Você GANHOU nesta compra 1000 pontos ===||");
				System.out.println("||============================================||");
				nivel.setPontuacao(1000);
			}
			if (Classificacao.getPontuacao() >= 10000 ) {
				System.out.println("||============================================||");
				System.out.println("||=== Você está na classificação DIAMANTE ====||");
				System.out.println("||=== Você GANHOU nesta compra 1000 pontos ===||");
				System.out.println("||============================================||");
				nivel.setPontuacao(1000);
			}
		}
	}

	@Override
	public void desconto() {

	}

	@Override
	public void brinde() {
		// TODO Auto-generated method stub

	}

}
