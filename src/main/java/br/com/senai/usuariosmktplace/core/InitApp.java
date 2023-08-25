package br.com.senai.usuariosmktplace.core;

import br.com.senai.usuariosmktplace.core.dao.ManagerDb;
import br.com.senai.usuariosmktplace.core.domain.Usuario;

public class InitApp {

	public static void main(String[] args) {
		ManagerDb.getInstance().getConexao();
		System.out.println("Conectou");
		
		Usuario usuario = new Usuario("Elyton teste", "Jose Elyton", "jose1234");
		usuario.getLogin();
		
		
	}

}
