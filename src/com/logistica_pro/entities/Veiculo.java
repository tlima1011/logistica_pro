package com.logistica_pro.entities;

import com.logistica_pro.enums.Combustivel;

public abstract class Veiculo {
	
	private int idVeiculo; 
	private String renavam; 
	private String modelo; 
	private String marca; 
	private int rodas; 
	private int ano; 
	private String fabricante; 
	private String chassi; 
	private double capacidade; 
	private static final int VELOCIDADE_MINIMA = 0;  
	private int velocidadeMaxima; 
	private Combustivel tipoCombustivel; 
	private double capacidadeTanque; 
	private double kml;  
	
	
	
	
	
	
	

}
