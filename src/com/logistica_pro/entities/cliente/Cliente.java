package com.logistica_pro.entities.cliente;

import com.logistica_pro.entities.locacao.Locacao;

public abstract class Cliente { 
	
	private static int ultimoCodigo = 1; 
	private int idCliente; 
	private String nome; 
	private String cnh; 
	private String email; 
	private Locacao locacao; 
	
	public Cliente() {
		this.idCliente = ultimoCodigo++; 
	}
	
	
	public void setNome(String n) {
		this.nome = n; 
	}
	
	public String getNome() {
		return nome; 
	}
	
	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Cliente [idCliente: " + idCliente + "\nNome: " + nome + ",\nCnh: " + cnh + "]";
	}
	
	
	

}
