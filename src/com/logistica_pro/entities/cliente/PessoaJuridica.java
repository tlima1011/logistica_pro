package com.logistica_pro.entities.cliente;

public class PessoaJuridica extends Cliente{
	
	private String cnpj; 
	private String ie; 
	
	public PessoaJuridica(String c, String i) { 
		this.cnpj = c; 
		this.ie = i; 
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getIe() {
		return ie;
	}

	public void setIe(String ie) {
		this.ie = ie;
	}

	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", ie=" + ie + "]";
	}
	
	

}
