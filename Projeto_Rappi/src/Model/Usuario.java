package Model;

public class Usuario extends Classificacao{
	private String nome;
	private String ultNome;
	private String numCelular;
	private String genero;
	private int id;
	private String email;


	public Usuario(String nome, String ultNome, String numCelular, String genero, int id, String email,
			Classificacao classificacao) {
		this.nome = nome;
		this.ultNome = ultNome;
		this.numCelular = numCelular;
		this.genero = genero;
		this.id = id;
		this.email = email;
	}
	
	public Usuario(String nivel, int pontuacao) {
		super();
		this.setNivel(nivel);
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
	
	@Override
	public String toString() {
		return nome+","+ultNome+","+numCelular+","+genero+","+id+","+email+","+getNivel();
	}
	
}
