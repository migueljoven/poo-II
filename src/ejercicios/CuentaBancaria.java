package ejercicios;

import java.time.LocalDate;

public class CuentaBancaria {
	private String numeroCuenta = generarNumeroCuenta();
	private double saldo=0;
	private double interes=2.5;
	private LocalDate fechaApertura = LocalDate.now();
	private static int numeroDeCuentasBancarias=0;
	
	public CuentaBancaria(){
		numeroDeCuentasBancarias++;
	}
	public CuentaBancaria(double saldo, double interes) throws CuentaBancariaException{
		if (saldo >=0){
			this.saldo = saldo;	
			this.interes = interes;
			numeroDeCuentasBancarias++;
		}
		else
			throw new CuentaBancariaException();
		
	}
	private String generarNumeroCuenta(){
		final String ENTIDAD="1234";
		final String OFICINA="5648";
		
		String digitosCuenta="";
		for (int i = 0; i < 10; i++) {
			digitosCuenta+=(int) (Math.random()*10);
		}
		String digitoControl=generarDigitoControl(digitosCuenta, ENTIDAD, OFICINA);
		return ENTIDAD+"-"+OFICINA+"-"+digitoControl+"-"+digitosCuenta;
	}
	private String generarDigitoControl(String digitos, String entidad, String oficina){
		String entidadOficina="00"+entidad+oficina;
		int[] multiplicador = {1, 2, 4, 8, 5, 10, 9, 7, 3, 6};
		int suma1=0, suma2=0;
		for (int i = 0; i < 10; i++) {
			suma1 += multiplicador[i] * Character.getNumericValue(entidadOficina.charAt(i));
			suma2 += multiplicador[i] * Character.getNumericValue(digitos.charAt(i));
		}
		int resto1 = suma1 % 11;
		int primerDigito = 11-resto1;
		if (primerDigito == 11)
			primerDigito = 0;
		if (primerDigito == 10)
			primerDigito = 1;
		int resto2 = suma2 % 11;
		int segundoDigito = 11-resto2;
		if (segundoDigito == 11)
			segundoDigito = 0;
		if (segundoDigito == 10)
			segundoDigito = 1;
		String digitoControl= ""+primerDigito+segundoDigito;
		//logica
		return digitoControl;
	}
	
	/**
	 * @return the numeroCuenta
	 */
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	/**
	 * @param numeroCuenta the numeroCuenta to set
	 */
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
	 * @return the interes
	 */
	public double getInteres() {
		return interes;
	}
	/**
	 * @param interes the interes to set
	 */
	public void setInteres(double interes) {
		this.interes = interes;
	}
	/**
	 * @return the fechaApertura
	 */
	public LocalDate getFechaApertura() {
		return fechaApertura;
	}
	/**
	 * @param fechaApertura the fechaApertura to set
	 */
	public void setFechaApertura(LocalDate fechaApertura) {
		this.fechaApertura = fechaApertura;
	}
	
	public boolean retirarEfectivo(int cantidad){
		if (this.saldo >= cantidad){
			this.saldo-=cantidad;
			return true;
		}
		else
			return false;
	}
	public void ingresarEfectivo(int cantidad){
		this.saldo+=cantidad;
	}
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroCuenta == null) ? 0 : numeroCuenta.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentaBancaria other = (CuentaBancaria) obj;
		if (numeroCuenta == null) {
			if (other.numeroCuenta != null)
				return false;
		} else if (!numeroCuenta.equals(other.numeroCuenta))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CuentaBancaria [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", interes=" + interes
				+ ", fechaApertura=" + fechaApertura + "]";
	}
	/*public static void main(String[] args) throws CuentaBancariaException {
		CuentaBancaria c1 = new CuentaBancaria();
		System.out.println(c1);
		CuentaBancaria c2 = new CuentaBancaria(100,1.1);
		System.out.println(c2);
	}*/
	
	
}
class CuentaBancariaException extends Exception{}
