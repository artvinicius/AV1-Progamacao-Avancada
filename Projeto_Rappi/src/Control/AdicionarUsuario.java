package Control;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Model.Usuario;

public class AdicionarUsuario {
	
	public static void desserializarListaUsuario() throws IOException {
		for (int i = 0; i < 2; i++) {
			try {										// Estou usando essa forma, pois o meu S.O é linux
				FileInputStream fileIn = new FileInputStream("/home/lucas/Documentos/AV1-PA/usuarios"+(i+1)+".txt");
				ObjectInputStream in = new ObjectInputStream(fileIn);
				Usuario users = (Usuario) in.readObject();
				System.out.println("Dados dos Usuarios:");
				System.out.println(users.toString());
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				{
				}
			}
		}
	}
	
	public static void serializarListaUsuario(Usuario usuarios[]) {
		for (int i = 0; i < usuarios.length; i++) {
			try {
				ObjectOutputStream oS = new ObjectOutputStream(// Estou usando essa forma, pois o meu S.O é linux
						new FileOutputStream("/home/lucas/Documentos/AV1-PA/usuarios"+(i+1)+".txt"));
				oS.writeObject(usuarios[i]);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
