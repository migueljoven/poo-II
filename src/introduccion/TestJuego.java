package introduccion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestJuego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Juego juego  = new Juego("programación", "informática");
		try (Scanner sc = new Scanner(new File("usuarios.txt"));
){
			//String palabra = sc.next();
			String login;
			String password;
			Usuario u;
			String linea;
			while(sc.hasNextLine()){
				linea = sc.nextLine();
				String[] valores = linea.split(",");
				login = valores[0];
				if (valores.length==2)					
					password = valores[1];
				else 
					password = Usuario.generarLoginOPassword();
				
				try {
					u = new Usuario(login.trim(), password.trim());
					if (juego.addUsuario(u))
						System.out.println("Usuario "+login.trim()+" añadido correctamente al juego");
										
					juego.variarPuntuacion((int) (Math.random()*99));
				} catch (UsuarioException e) {
					// TODO Auto-generated catch block
					System.out.println(login+ "no válido");
				}
			}
			System.out.println("Inicialmente");
			System.out.println(juego);
			System.out.println("Eliminando un usuario");
			if (juego.eliminarUsuario("juanito"))
				System.out.println("Usuario eliminado");
			else
				System.out.println("Usuario no encontrado");
			System.out.println(juego);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Fichero no existe");;
		} 

	}

}
