package View;

import Control.Compra;
import Model.Classificacao;
import Model.Usuario;

public class Menu {
	public static void main(String[] args) {
		
		Classificacao nivel = new Classificacao();
		Usuario user1 =  new Usuario("Lucas", "Eduardo", "XXXX", "masculino", 12231, "XXXXX", nivel);
		Compra compra =  new Compra();
		
//		System.out.println(user1.toString());
//		System.out.println(nivel.toString());
		compra.compra();
		
	}

}
