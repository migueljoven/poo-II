package clasesInternas;

//import clasesInternas.Externa.Interna;

public class TestClasesInternas1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Externa e = new Externa();
	//	Externa.Interna i = e.new Interna();
	//	System.out.println(i.multiplicarValores(5, 4));
		System.out.println(e.multiplicar(5, 4));
	}

}
class Externa{
	private static final int CONSTANTE = 12;
	public Externa(){
		System.out.println("Creado objeto Externa");		
	}
	class Interna{
		private Interna(){
			System.out.println("Creado objeto Interna");
		}
		private int multiplicarValores(int valor1, int valor2 ){
			return valor1*valor2*CONSTANTE;
		}
	}
	public int multiplicar(int valor1, int valor2){
		Interna i = new Interna();
		return i.multiplicarValores(valor1, valor2);
	}
}