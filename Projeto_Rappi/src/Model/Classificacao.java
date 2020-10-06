package Model;

public class Classificacao {

	private static int pontuacao;

	public Classificacao() {
		Classificacao.pontuacao = 0;
	}

	public static int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		Classificacao.pontuacao = pontuacao;
	}
	
	public String elo(int pontuacao) {
		if (pontuacao == 0 && pontuacao < 2000) {
			return "BRONZE";
		}
		if (pontuacao >= 2000 && pontuacao < 4000) {
			return "SILVER";
		}
		if (pontuacao >= 2000 && pontuacao < 4000) {
			return "GOLD";
		}
		if (pontuacao >= 10000) {
			return "DIAMANTE";
		}
		return null;
	}
}
