package com.logistica_pro.entities.cliente;

public class PessoaFisica extends Cliente{
	
	private String rg;
	private String cpf; 
	
	public PessoaFisica() {
		
	}
	
	public PessoaFisica(String r, String c) { 
		this.rg = r; 
		this.cpf = c;
	}
	
	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "PessoaFisica [rg=" + rg + ", cpf=" + cpf + "]";
	}
	
	
	

}
