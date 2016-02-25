package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private List<CuentaBancaria> cuentas = new ArrayList<CuentaBancaria>();
	public boolean addCuentaBancaria(CuentaBancaria c){
		if (cuentas.contains(c))
			return false;
		else
			return cuentas.add(c);
	}
	public boolean eliminarCuentaBancia(CuentaBancaria c){
		if (cuentas.contains(c))
			return cuentas.remove(c);
		else
			return false;
	}
	public List<CuentaBancaria> devolvercuentaMayorSaldo(){
		List<CuentaBancaria> listaMayorSaldo = new ArrayList<CuentaBancaria>();
		if (cuentas.size() > 0 ){
			double saldoMayor=0;
			CuentaBancaria c = null;
			//recorremos para encontrar UNA de las cuentas 
			//de mayor saldo
			for (CuentaBancaria cuentaBancaria : cuentas) {
				if (cuentaBancaria.getSaldo() > saldoMayor){
					c = cuentaBancaria;
					saldoMayor = c.getSaldo();
				}
			}
			for (CuentaBancaria cuentaBancaria : listaMayorSaldo) {
				if (c.getSaldo() == cuentaBancaria.getSaldo())
					listaMayorSaldo.add(cuentaBancaria);
			}
		}
		return listaMayorSaldo;
	}
	public List<CuentaBancaria> devolvercuentaMenorSaldo(){
		List<CuentaBancaria> listaMenorSaldo = new ArrayList<CuentaBancaria>();
		if (cuentas.size() > 0 ){
			double saldoMenor=cuentas.get(0).getSaldo();
			CuentaBancaria c = null;
			for (CuentaBancaria cuentaBancaria : cuentas) {
				if (cuentaBancaria.getSaldo() < saldoMenor){
					saldoMenor = c.getSaldo();
					listaMenorSaldo.clear(); //resetea la lista
					listaMenorSaldo.add(c);
				}
				if (cuentaBancaria.getSaldo() == saldoMenor)
					listaMenorSaldo.add(cuentaBancaria);
			}
		}
		return listaMenorSaldo;
	}
	public List<CuentaBancaria> devolverListadoMorosos(){
		List<CuentaBancaria> listaMorosos = new ArrayList<CuentaBancaria>();
		for (CuentaBancaria cuentaBancaria : cuentas) {
			if (cuentaBancaria.getSaldo() < 0)
				listaMorosos.add(cuentaBancaria);
		}
		return listaMorosos;
	}
	private double getSaldoMedio(){
		double saldoMedio=0;
		for (CuentaBancaria cuentaBancaria : cuentas) {
			saldoMedio += cuentaBancaria.getSaldo();
		}
		return saldoMedio/cuentas.size();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		//return "Banco [cuentas=" + cuentas + "]";
		return "Nº de cuentas: "+cuentas.size()+", saldo medio: "+getSaldoMedio();
	}
	
	
	
}
