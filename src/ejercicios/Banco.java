package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private List<CuentaBancaria> cuentas = new ArrayList<CuentaBancaria>();
	public boolean addCuentaBancaria(CuentaBancaria c){
		return cuentas.add(c);
	}
	public boolean eliminarCuentaBancia(CuentaBancaria c){
		return cuentas.remove(c);
	}
	public CuentaBancaria devolvercuentaMayorSaldo(){
		CuentaBancaria c = null;
		if (cuentas.size() > 0 ){
			double saldoMayor=0;
			for (CuentaBancaria cuentaBancaria : cuentas) {
				if (cuentaBancaria.getSaldo() > saldoMayor){
					c = cuentaBancaria;
					saldoMayor = c.getSaldo();
				}
			}
		}
		return c;
	}
	public CuentaBancaria devolvercuentaMenorSaldo(){
		CuentaBancaria c = null;
		if (cuentas.size() > 0 ){
			double saldoMenor=Double.MAX_VALUE;
			for (CuentaBancaria cuentaBancaria : cuentas) {
				if (cuentaBancaria.getSaldo() < saldoMenor){
					c = cuentaBancaria;
					saldoMenor = c.getSaldo();
				}
			}
		}
		return c;
	}
	public List<CuentaBancaria> devolverListadoMorosos(){
		List<CuentaBancaria> listaMorosos = new ArrayList<CuentaBancaria>();
		for (CuentaBancaria cuentaBancaria : cuentas) {
			if (cuentaBancaria.getSaldo() < 0)
				listaMorosos.add(cuentaBancaria);
		}
		return listaMorosos;
	}
	
}
