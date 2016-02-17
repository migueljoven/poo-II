package introduccion;

import java.util.ArrayList;
import java.util.List;

public class Juego {
	private String nombreJuego;
	private String categoria;
	private int puntuacion;
	private List<Usuario> listaUsuarios;
	/**
	 * @param nombreJuego
	 * @param categoria
	 */
	public Juego(String nombreJuego, String categoria) {
		this.nombreJuego = nombreJuego;
		this.categoria = categoria;
		this.puntuacion= 0;
		this.listaUsuarios = new ArrayList<Usuario>();
	}
	public void addUsuario(Usuario u){
		this.listaUsuarios.add(u);
	}
	public void eliminarUsuario(Usuario u){
		this.listaUsuarios.remove(u);
	}
	public void variarPuntuacion(int puntuacion){
		this.puntuacion+=puntuacion;
	}
	/**
	 * @return the nombreJuego
	 */
	public String getNombreJuego() {
		return nombreJuego;
	}
	/**
	 * @return the categoria
	 */
	public String getCategoria() {
		return categoria;
	}
	/**
	 * @return the puntuacion
	 */
	public int getPuntuacion() {
		return puntuacion;
	}
	/**
	 * @param nombreJuego the nombreJuego to set
	 */
	public void setNombreJuego(String nombreJuego) {
		this.nombreJuego = nombreJuego;
	}
	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Juego [nombre del juego=" + nombreJuego + ", categoria=" + categoria + ", puntuacion=" + puntuacion
				+ ", listaUsuarios=" + listaUsuarios + "]";
	}
	
}
