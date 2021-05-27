#language: pt

@fluxo-busca-produtos
Funcionalidade: Fluxo busca
  Cliente faz busca e visualiza retorno de itens encontrados conforme condição solicitada

  @done @Web
  Cenario: Validar os produtos incluidos no carrinho na tela de pagamento
    Dado que acesse o site "https://www.magazineluiza.com.br/"
    E que realize a busca "capa iphone6"
    Entao validar retorno da busca conforme codicao
