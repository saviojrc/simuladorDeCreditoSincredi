#language: pt

@AplicarValoresNaPoupanca
Funcionalidade: Simular um Investimento na Poupança
	Eu como Associado 
	Quero preencher o formulário de simulação
	Para a tabela de resultado com Mês e Valor.
	
@SimularInvestimentoPessoaFisica
Cenario: Simular um investimento na poupança como pessoa fisica 
    Dado a disponibilização da simulação de um investimento na poupança como pessoa física
    Quando é selecionado o perfil "Para Você"
    E ao informar o valor inicial de investimento igual a R$: "1000.00"
    E ao informar o valor que deve ser poupando todo mês de "500.00"
    E preencher o período mensal de aplicação igual a "12" meses
    E selecionar a funcionalidade "Simular"
    Entao é retornado a mensagem "Em 12 meses você terá guardado"
    E o valor total de "R$ 7.052" que será investido até o fim do período
    E o valor de "R$ 13.190" investidos em "24" meses na primeira linha da tabela de referência 
    E o valor de "R$ 19.413" investidos em "36" meses na segunda linha da tabela de referência 
    E o valor de "R$ 25.723" investidos em "48" meses na terceira linha da tabela de referência 
    E o valor de "R$ 32.121" investidos em "60" meses na quarta linha da tabela de referência 
    E a opção para  "Refazer investimento"
    
   

@InformarUmValorParaOInvestimentoInferiorAoPermitido
Cenario: Simular um investimento na poupança como pessoa física com um valor inferior há R$20.00
    Dado a disponibilização do preenchimento do formulário de simulação na poupança
    Quando for escolhido o perfil "Para Você"
    E ao informar o valor de investimento inicial igual a R$: "19.00"
    E ao informar o valor de investimento mensal igual a R$: "19.00"
    E informar o período mensal de aplicação igual a "12" meses
    E selecionar a opção "Simular"
    Então a mensagem "Valor mínimo de 20.00" para o investimento inicial
  	E a mensagem "Valor mínimo de 20.00" para o investimento final
     