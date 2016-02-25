package introduccion;

import java.util.ArrayList;
import java.util.List;

public class ClaseParametrizada<T> {
	private List<T> lista = new ArrayList<T>();
	public void addElemento(T elemento){
		lista.add(elemento);
	}
	public T getElemento(int i){
		if (i>=0 && i <lista.size())
			return lista.get(i);
		else
			return null;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ClaseParametrizada [lista=" + lista + "]";
	}
	
}
