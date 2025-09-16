package com.ecomerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "pessoa_juridica")
public class PessoaJuridica extends Pessoa{

	
	private static final long serialVersionUID = 1L;
	
	private String cnpj;
	private String inscricaoESt;
	private String inscricaoMun;
	private String nomeFantasia;
	private String razaoSocial;
	private String categoria;
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getInscricaoESt() {
		return inscricaoESt;
	}
	public void setInscricaoESt(String inscricaoESt) {
		this.inscricaoESt = inscricaoESt;
	}
	public String getInscricaoMun() {
		return inscricaoMun;
	}
	public void setInscricaoMun(String inscricaoMun) {
		this.inscricaoMun = inscricaoMun;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
}
