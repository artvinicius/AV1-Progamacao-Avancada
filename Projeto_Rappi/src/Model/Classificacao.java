package Model;

public class Classificacao implements Nivel {

	private String nivel;
	private double pontuacao;

	public Classificacao() {

		this.nivel = "Bronze";
	}

	public double getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(double pontuacao) {
		this.pontuacao = pontuacao;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	@Override
	public void BRONZE() {
		if (pontuacao < 2000) {
			System.out.println("BRONZE");
		}
	}

	@Override
	public void SILVER() {
		if (pontuacao >= 2000 && pontuacao < 4000) {
			System.out.println("SILVER");
		}

	}

	@Override
	public void GOLD() {
		if (pontuacao >= 4000 && pontuacao < 10000) {
			System.out.println("GOLD");
		}
	}

	@Override
	public void DIAMANTE() {
		if (pontuacao >= 10000) {
			System.out.println("DIAMANTE");
		}
	}

}
