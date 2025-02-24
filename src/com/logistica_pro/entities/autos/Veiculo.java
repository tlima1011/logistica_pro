package com.logistica_pro.entities.autos;

import com.logistica_pro.enums.Combustivel;

public abstract class Veiculo {
	
	private static int ultimoCodigo = 1; 
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
	private static boolean ligado = false ; 
	private int velocidadeAtual = 0; 
	
	
	public void setModelo(String m) {
		this.modelo = m; 
	}
	
	public String getModelo() {
		return this.modelo; 
	}
	
	public void setAno(int a) {
		this.ano = a; 
	}
	
	public int getAno() {
		return ano; 
	}
	
	public boolean getStatus() {
		return ligado;
	}
	
	public int getVelocidadeMinima() {
		return VELOCIDADE_MINIMA;
	}
	
	public Veiculo() { 
		this.idVeiculo = ultimoCodigo++; 
		this.ligado = false; 
	}
	
	public void ligar() { 
		System.out.println("Veiculo ligado");
		ligado = true; 
	}
	
	public void desligar() { 
		System.out.println("Veiculo desligado");
		ligado = false; 
	}
	
	public void aumentarVelocidade(int v) { 
		if(ligado == true && velocidadeAtual > 0) { 
			this.velocidadeAtual = v;
		}else {
			System.out.println("Veículo não ligado, ligue-o");
		}
	}
	
	public void diminuirVelocidade(int v) { 
		if(ligado == true && velocidadeAtual > 0) {
			this.velocidadeAtual = velocidadeAtual - v; 
		}else {
			System.out.println("Inválido");
		}
	}
	
	
	
	
	

}
