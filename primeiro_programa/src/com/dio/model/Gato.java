package com.dio.model;

import java.util.Objects;

public class Gato {

	private String nome;
	private String cor;
	private Integer idadel;

	public Gato() {
	}

	public Gato(String nome, String cor, Integer idadel) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.idadel = idadel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", cor=" + cor + ", idadel=" + idadel + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cor, idadel, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(idadel, other.idadel)
				&& Objects.equals(nome, other.nome);
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getIdadel() {
		return idadel;
	}

	public void setIdadel(Integer idadel) {
		this.idadel = idadel;
	}

//	public Gato(String nome, String cor,Integer idade) {
//		this.nome = nome;
//		this.cor = cor;
//		this.idade = idade;
//		
//	}

}
