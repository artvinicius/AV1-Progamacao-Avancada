package Model;

public class Usuario extends Classificacao{
	private String nome;
	private String ultNome;
	private String numCelular;
	private String genero;
	private int id;
	private String email;
	private String nivel;


	public Usuario(String nome, String ultNome, String numCelular, String genero, int id, String email,
			int classificacao, String nivel) {
		this.nome = nome;
		this.ultNome = ultNome;
		this.numCelular = numCelular;
		this.genero = genero;
		this.id = id;
		this.email = email;
		this.nivel = nivel;
	}
	
	public Usuario(int pontuacao) {
		super();
		this.setPontuacao(pontuacao);
	}
	
	public Usuario() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUltNome() {
		return ultNome;
	}

	public void setUltNome(String ultNome) {
		this.nome = ultNome;
	}

	public String getNumCelular() {
		return numCelular;
	}

	public void setNumCelular(String numCelular) {
		this.numCelular = numCelular;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getNivel() {
		return nivel;
	}
	
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	
	
	@Override
	public String toString() {
		return nome+","+ultNome+","+numCelular+","+genero+","+id+","+email+","+Classificacao.getPontuacao()+","+nivel;
	}
	
}
