package com.sulamerica.pages_actions;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;


public class BuscaPage {
    BasePage base = new BasePage();
    
 // *********Variaveis interativas*********
 	public String itemBusca = "";
 	
 // *********Web Elements*********
 	String inputBusca = "inpHeaderSearch";
 	By lupaBusca = By.cssSelector("span#btnHeaderSearch");
 	By itensRetorno = By.cssSelector("div#productShowcaseSearch li");
 	By titleItem = By.cssSelector("h3.productTitle");

	public void acessarSite(String site) {
		base.getUrl(site);
	}
	public void buscaProduto(String produto) {
		itemBusca = produto;
		base.clicarBotao(inputBusca);
		base.escrever(inputBusca, produto);
		base.clicarBotao(lupaBusca);
	}

	public void validarRetorno() {
		List<WebElement> itens = base.listar(itensRetorno);
		for(WebElement li : itens) {
			li.findElement(titleItem).getText();
		}
	}

	
}
