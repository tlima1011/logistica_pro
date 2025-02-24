package com.logistica_pro.app;

import com.logistica_pro.entities.autos.Carro;
import com.logistica_pro.entities.autos.Moto;
import com.logistica_pro.entities.autos.Van;
import com.logistica_pro.entities.autos.Veiculo;

public class Main {

	public static void main(String[] args) {
		
		Veiculo fiat = new Carro();
		fiat.setModelo("Uno");
		fiat.setAno(2011);
		System.out.println("Modelo: "+fiat.getModelo() + " - Ano: "+ fiat.getAno());
		System.out.println(fiat.getStatus());
		System.out.println(fiat.getVelocidadeMinima());
		
		Veiculo cbr = new Moto(); 
		cbr.setModelo("CBR"); 
		cbr.setAno(2020); 
		System.out.println("Modelo: "+cbr.getModelo() + " - Ano: "+ cbr.getAno());
		System.out.println(cbr.getStatus());
		System.out.println(cbr.getVelocidadeMinima());
		
		Moto cbr1 = (Moto) cbr; 
		cbr1 = (Moto) cbr;
		
		System.out.println("Modelo: "+cbr1.getModelo() + " - Ano: "+ cbr1.getAno());
		System.out.println(cbr1.getStatus());
		System.out.println(cbr1.getVelocidadeMinima());
		
		Van topic = new Van(); 
		topic.setModelo("Topic"); 
		topic.setAno(2022); 
		System.out.println("Modelo: "+topic.getModelo() + " - Ano: "+ topic.getAno());
		System.out.println(topic.getStatus());
		System.out.println(topic.getVelocidadeMinima());
		
		topic.ligar(); 
				

	}

}
