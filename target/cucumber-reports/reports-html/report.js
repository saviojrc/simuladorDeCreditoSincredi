$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SimuladorDeInvestimento.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 4,
  "name": "Simular um Investimento na Poupança",
  "description": "Eu como Associado \nQuero preencher o formulário de simulação\nPara a tabela de resultado com Mês e Valor.",
  "id": "simular-um-investimento-na-poupança",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@AplicarValoresNaPoupanca"
    }
  ]
});
formatter.before({
  "duration": 9410549700,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Simular um investimento na poupança como pessoa fisica",
  "description": "",
  "id": "simular-um-investimento-na-poupança;simular-um-investimento-na-poupança-como-pessoa-fisica",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 9,
      "name": "@SimularInvestimentoPessoaFisica"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "a disponibilização da simulação de um investimento na poupança como pessoa física",
  "keyword": "Dado "
});
formatter.step({
  "line": 12,
  "name": "é selecionado o perfil \"Para Você\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 13,
  "name": "ao informar o valor inicial de investimento igual a R$: \"1000.00\"",
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "ao informar o valor que deve ser poupando todo mês de \"500.00\"",
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "preencher o período mensal de aplicação igual a \"12\" meses",
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "selecionar a funcionalidade \"Simular\"",
  "keyword": "E "
});
formatter.step({
  "line": 17,
  "name": "é retornado a mensagem \"Em 12 meses você terá guardado\"",
  "keyword": "Entao "
});
formatter.step({
  "line": 18,
  "name": "o valor total de \"R$ 7.052\" que será investido até o fim do período",
  "keyword": "E "
});
formatter.step({
  "line": 19,
  "name": "o valor de \"R$ 13.190\" investidos em \"24\" meses na primeira linha da tabela de referência",
  "keyword": "E "
});
formatter.step({
  "line": 20,
  "name": "o valor de \"R$ 19.413\" investidos em \"36\" meses na segunda linha da tabela de referência",
  "keyword": "E "
});
formatter.step({
  "line": 21,
  "name": "o valor de \"R$ 25.723\" investidos em \"48\" meses na terceira linha da tabela de referência",
  "keyword": "E "
});
formatter.step({
  "line": 22,
  "name": "o valor de \"R$ 32.121\" investidos em \"60\" meses na quarta linha da tabela de referência",
  "keyword": "E "
});
formatter.step({
  "line": 23,
  "name": "a opção para  \"Refazer investimento\"",
  "keyword": "E "
});
formatter.match({
  "location": "InvestmentSimulatorSteps.aDisponibilizaçãoDaSimulaçãoDeUmInvestimentoNaPoupançaComoPessoaFísica()"
});
formatter.result({
  "duration": 198311700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Para Você",
      "offset": 24
    }
  ],
  "location": "InvestmentSimulatorSteps.éSelecionadoOPerfil(String)"
});
formatter.result({
  "duration": 327751200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1000.00",
      "offset": 57
    }
  ],
  "location": "InvestmentSimulatorSteps.aoInformarOValorInicialDeInvestimentoIgualAR$(String)"
});
formatter.result({
  "duration": 228528800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "500.00",
      "offset": 55
    }
  ],
  "location": "InvestmentSimulatorSteps.aoInformarOValorQueDeveSerPoupandoTodoMêsDe(String)"
});
formatter.result({
  "duration": 116801700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12",
      "offset": 49
    }
  ],
  "location": "InvestmentSimulatorSteps.preencherOPeríodoMensalDeAplicaçãoIgualAMeses(String)"
});
formatter.result({
  "duration": 109638400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Simular",
      "offset": 29
    }
  ],
  "location": "InvestmentSimulatorSteps.selecionarAFuncionalidade(String)"
});
formatter.result({
  "duration": 309027400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Em 12 meses você terá guardado",
      "offset": 24
    }
  ],
  "location": "InvestmentSimulatorSteps.éRetornadoAMensagem(String)"
});
formatter.result({
  "duration": 130937700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "R$ 7.052",
      "offset": 18
    }
  ],
  "location": "InvestmentSimulatorSteps.oValorTotalDeQueSeráInvestidoAtéOFimDoPeríodo(String)"
});
formatter.result({
  "duration": 85213000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "R$ 13.190",
      "offset": 12
    },
    {
      "val": "24",
      "offset": 38
    }
  ],
  "location": "InvestmentSimulatorSteps.oValorDeInvestidosEmMesesNaPrimeiraLinhaDaTabelaDeReferência(String,String)"
});
formatter.result({
  "duration": 148305900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "R$ 19.413",
      "offset": 12
    },
    {
      "val": "36",
      "offset": 38
    }
  ],
  "location": "InvestmentSimulatorSteps.oValorDeInvestidosEmMesesNaSegundaLinhaDaTabelaDeReferência(String,String)"
});
formatter.result({
  "duration": 128085500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "R$ 25.723",
      "offset": 12
    },
    {
      "val": "48",
      "offset": 38
    }
  ],
  "location": "InvestmentSimulatorSteps.oValorDeInvestidosEmMesesNaTerceiraLinhaDaTabelaDeReferência(String,String)"
});
formatter.result({
  "duration": 114941000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "R$ 32.121",
      "offset": 12
    },
    {
      "val": "60",
      "offset": 38
    }
  ],
  "location": "InvestmentSimulatorSteps.oValorDeInvestidosEmMesesNaQuartaLinhaDaTabelaDeReferência(String,String)"
});
formatter.result({
  "duration": 107788600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Refazer investimento",
      "offset": 15
    }
  ],
  "location": "InvestmentSimulatorSteps.aOpçãoPara(String)"
});
formatter.result({
  "duration": 76405200,
  "status": "passed"
});
formatter.after({
  "duration": 2507547100,
  "status": "passed"
});
});