package Model;

public class Classificacao {
	
	private String nivel;
	private int pontuacao;
	
	public Classificacao() {
		this.nivel = "Bronze";
	}
	
	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

}
