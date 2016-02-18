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

	}

}
