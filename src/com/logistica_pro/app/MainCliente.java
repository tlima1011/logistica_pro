package com.logistica_pro.app;

import com.logistica_pro.entities.cliente.PessoaFisica;
import com.logistica_pro.entities.cliente.PessoaJuridica;

public class MainCliente {

	public static void main(String[] args) {
		
		PessoaFisica cliente1 = new PessoaFisica(); 
		cliente1.setNome("Luis Astrogildo");
		cliente1.setCnh("2225488NADA"); 
		cliente1.setRg("22223335-5"); 
		cliente1.setCpf("33558878-8");
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getCnh());
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getRg());
		
		PessoaJuridica cliente2 = new PessoaJuridica("11111111/02222-22","2223355566-88"); 
		cliente2.setNome("Luis Astrogildo"); 
		cliente2.setEmail("beta@betamax.com");
		System.out.println(cliente2.getNome());
		cliente2.setCnh("2225488NADA");
		System.out.println(cliente2.getCnh());
		System.out.println(cliente2.getEmail());
		System.out.println(cliente2);
		

	}

}
