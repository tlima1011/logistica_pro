package com.logistica_pro.entities.autos;

import com.logistica_pro.entities.locacao.Locacao;

public class Carro extends Veiculo{
	
	private double vu; 
		
	public Carro() {
		Locacao locaCarro = new Locacao();
		locaCarro.setValorUnitario(10.5); 
		vu = locaCarro.getValorUnitario(); 
	}
	
	public double getVu() {
		return vu; 
	}
	
	
}
