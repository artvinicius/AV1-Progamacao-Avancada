package Model;

public class Pagamento {
	
	private String modo;
	
	public Pagamento(String modo) {
		this.setModo(modo);
	}

	public String getModo() {
		return modo;
	}

	public void setModo(String modo) {
		this.modo = modo;
	}

}
