package com.sulamerica.steps_definitions;

import com.sulamerica.pages_actions.BuscaPage;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;

public class BuscaSteps {
	BuscaPage busca = new BuscaPage();
	
	@Dado("^que acesse o site \"([^\"]*)\"$")
	public void queAcesseOSite(String site) {
		busca.acessarSite(site);
	}
	
	@Dado("^que realize a busca \"([^\"]*)\"$")
	public void queRealizeABusca(String produto) {
		busca.buscaProduto(produto);
	}

	@Entao("^validar retorno da busca conforme codicao$")
	public void validarRetornoBusca() {
		busca.validarRetorno();
	}
}
