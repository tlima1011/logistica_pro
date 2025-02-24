package com.logistica_pro.entities.locacao;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Locacao {

	private static int ultimoCodigo = 1;
	private int idLocacao;
	private LocalDate dataLocacao;
	private LocalDate dataDevolucao;
	private int periodo;
	private double valorUnitario;
	private double valorTotal;

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

}
