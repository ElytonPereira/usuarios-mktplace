package br.com.senai.usuariosmktplace.core;

import br.com.senai.usuariosmktplace.core.service.UsuarioService;

public class InitApp {

	public static void main(String[] args) {
		UsuarioService service = new UsuarioService();
		
		System.out.println(service.removerAcentoDo("José da Silvá"));
		System.out.println(service.fracionar("José da Silvá Alburquerque dos anjos bragança"));
		System.out.println(service.gerarLoginPor("José da Silvá Alburquerque dos anjos bragança"));
		System.out.println(service.gerarHashDa("jose123456"));
		
	}

}
