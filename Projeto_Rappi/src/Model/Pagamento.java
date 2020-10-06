package Model;

public class Pagamento {
	
	private String modo;
	
	public Pagamento(String modo) {
		this.modo = modo;
	}
	
	public Pagamento() {}

	public String getModo() {
		return modo;
	}

	public void setModo(String modo) {
		this.modo = modo;
	}

	@Override
	public String toString() {
		return modo;
	}
	
	

}
