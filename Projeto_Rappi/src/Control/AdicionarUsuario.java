package Control;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import Model.Usuario;

public class AdicionarUsuario {
	
	public static void escreverArquivo(Usuario usuarios) throws IOException {
		FileWriter arq = new FileWriter("D:\\Projeto/usuarios.txt");
	    PrintWriter gravarArq = new PrintWriter(arq);
	    
		    gravarArq.print(usuarios);
		    gravarArq.append("\n");
		    arq.close();
	}
	
	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
		while (true) {
			if (linha != null) {
				System.out.println(linha);
			} else
				break;
			linha = buffRead.readLine();
		}
		buffRead.close();
	}
	
}
