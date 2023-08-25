package br.com.senai.usuariosmktplace.core.domain;

import java.util.Objects;

import lombok.Getter;
import lombok.Setter;

public class Usuario {
	
	@Getter @Setter
	private String login;
	private String senha;
	private String nomeCompleto;
	
	public Usuario(String login, String senha, String nomeCompleto) {
		super();
		this.login = login;
		this.senha = senha;
		this.nomeCompleto = nomeCompleto;
	}

	

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(login);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(login, other.login);
	}
	
	
	
}
