package br.com.senai.usuariosmktplace.core;

import br.com.senai.usuariosmktplace.core.service.UsuarioService;

public class InitApp {

	public static void main(String[] args) {
		UsuarioService service = new UsuarioService();
		
		service.criarPor("Elyton Fernandes Pereira","elyton1234");
	}

}
