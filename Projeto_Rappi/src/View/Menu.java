package View;

import Control.Compra;
import Model.Classificacao;
import Model.Usuario;

public class Menu {
	public static void main(String[] args) {
		
		Classificacao nivel = new Classificacao();
		Operacoes op = new Operacoes();
//		Usuario user1 =  new Usuario("Lucas", "Eduardo", "XXXX", "masculino", 12231, "XXXXX", nivel);
//		Compra compra =  new Compra();
//		
//		compra.compra();
		
		op.menu();
		
	}

}
