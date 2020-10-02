package Control;

import Model.Classificacao;
import Model.Pedido;
import Model.Usuario;

public class Compra implements Pedido{

	Usuario usuario = new Usuario();
	Classificacao nivel = new Classificacao();
	
	@Override
	public void compra() {
		if(usuario.getNivel() == "Bronze") {
			System.out.println("ITS MY");
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
