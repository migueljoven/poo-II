package introduccion;

public class TestClaseParametrizada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = {1,2,3,4,5,6,7};
		ClaseParametrizada<Integer> c1 = new ClaseParametrizada<Integer>();
		for (int i : numeros) {
			c1.addElemento(i);
		}
		System.out.println(c1);
		String[] cadenas = {"hola","mundo","ddd"};
		ClaseParametrizada<String> c2 = new ClaseParametrizada<String>();
		for (String string : cadenas) {
			c2.addElemento(string);
		}
		System.out.println(c2);
		System.out.println("Elemento 0 de enteros: "+c1.getElemento(0));
		System.out.println("Elemento 0 de cadena: "+c2.getElemento(0));
		//trabajando con objetos Usuario
		ClaseParametrizada<Usuario> c3 =  new ClaseParametrizada<Usuario>();
		
		try {
			
			Usuario u1 = new Usuario("juan", "passwordJuan");
			c3.addElemento(u1);
			Usuario u2 = new Usuario("luis", "passwordLuis");
			c3.addElemento(u2);
			Usuario u3 = new Usuario("rufino", "passwordRufino");
			c3.addElemento(u3);
			
		} catch (UsuarioException e) {
			// TODO Auto-generated catch block
			System.out.println("Usuario no válido");
		}
		
		System.out.println(c3);
		System.out.println("Elemento 0 de usuario: "+c3.getElemento(0));
		System.out.println("Propiedad password elemento 0 de usuario: "+c3.getElemento(0).getPassword());
		//accediendo a un usuario que no existe
		System.out.println("Elemento 3 de usuario: "+c3.getElemento(3));
		//System.out.println("Propiedad password elemento 3 de usuario: "+c3.getElemento(3).getPassword());
		//origina la terrible NullPointerException
		if (c3.getElemento(3) != null){
			System.out.println("Elemento 3 de usuario: "+c3.getElemento(3));
			System.out.println("Propiedad password elemento 3 de usuario: "+c3.getElemento(3).getPassword());
		}
		else
			System.out.println("Ese usuario no existe");
	}

}
