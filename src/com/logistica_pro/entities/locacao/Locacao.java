package com.logistica_pro.entities.locacao;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

import com.logistica_pro.entities.autos.Veiculo;
import com.logistica_pro.entities.cliente.Cliente;

public class Locacao {

	private static int ultimoCodigo = 1;
	private int idLocacao;
	private LocalDate dataLocacao;
	private LocalDate dataDevolucao;
	private int periodo;
	private double valorUnitario;
	private double valorTotal;
	
	public ArrayList<Cliente> cliente = new ArrayList<>();
	public ArrayList<Veiculo> veiculo = new ArrayList<>();

	public Locacao() {
		this.idLocacao = ultimoCodigo++;
	}

	public Locacao(LocalDate dl, LocalDate dd) {
		this.idLocacao = ultimoCodigo++;
		this.dataLocacao = dl;
		this.dataDevolucao = dd;
	}

	public void fecharTrajeto(LocalDate dl, LocalDate dd) {
		Period periodo = Period.between(dl, dd);
		this.periodo = periodo.getDays();
	}

	public int getPeriodo() {
		return periodo;
	}	
	
	public void setValorUnitario(double vu) {
		this.valorUnitario = vu; 
	}
	
	public double getValorUnitario() {
		return valorUnitario; 		
	}
		
	public void adicionarCliente(Cliente c) {
		cliente.add(c); 
	}
	
	public void adicionarVeiculo(Veiculo v) {
		veiculo.add(v); 
	}
	
	public void removerCliente(Cliente c) {
		cliente.remove(c); 
	}
	
	public void removerVeiculo(Veiculo v) {
		veiculo.remove(v); 
	}
	

}
