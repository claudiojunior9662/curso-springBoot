package com.claudio.curso.boot.domain;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@SuppressWarnings("serial")
@Entity
@Table(name = "ENDERECOS")
public class Endereco extends AbstractEntity<Long> {

	@NotBlank(message = "Informe um logradouro.")
	@Column(nullable = false)
	private String logradouro;

	@NotBlank(message = "Informe um bairro.")
	@Column(nullable = false)
	private String bairro;

	@NotBlank(message = "Informe uma cidade.")
	@Column(nullable = false)
	private String cidade;

	@NotNull(message = "Informe uma UF.")
	@Column(nullable = false, length = 2)
	@Enumerated(EnumType.STRING)
	private UF uf;

	@NotBlank(message = "Informe um CEP.")
	@Size(min = 9, message = "O CEP deve conter 9 caracteres.")
	@Column(nullable = false, length = 9)
	private String cep;

	@NotNull(message = "Informe um número.")
	@Digits(integer = 5, fraction = 0)
	@Column(nullable = false, length = 5)
	private Integer numero;

	private String complemento;

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public UF getUf() {
		return uf;
	}

	public void setUf(UF uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

}
