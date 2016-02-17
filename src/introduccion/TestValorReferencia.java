package introduccion;

public class TestValorReferencia {
	static int a= 5;
	static int b= 10;
	public static void main(String[] args) {
		Persona p = new Persona("juanito", 22);
		System.out.println("antes de llamar a cambiarObjetos: "+p);
		cambiarObjetos(p);
		System.out.println("depués de llamar a cambiarObjetos: "+p);
		System.out.println("..........................");
		
		System.out.printf("%s, %d, %d%n","Antes de llamar al método cambiar", a, b);
		cambiarTiposPrimitivos(a, b);
		System.out.printf("%s, %d, %d%n","Después de llamar al método cambiar", a, b);

	}
	public static void cambiarObjetos(Persona p1){
		p1.setNombre("joaquinito");
		p1.setEdad(12);
		System.out.println("Dentro del método cambiar "+p1);
	}
	public static void cambiarTiposPrimitivos(int a, int b){
		int aux = a;
		a = b;
		b = aux;
		System.out.printf("%s, %d, %d%n","Dentro del método cambiar", a, b);
	}
	
}
