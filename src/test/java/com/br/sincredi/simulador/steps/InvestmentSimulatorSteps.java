package com.br.sincredi.simulador.steps;

import com.br.sincredi.simulador.baseClass.BaseVerificationPoint;
import com.br.sincredi.simulador.pages.CheckpointPage;
import com.br.sincredi.simulador.pages.InvestmentFormPage;
import com.br.sincredi.simulador.pages.SimulationResultPage;
import com.br.sincredi.simulador.pages.enums.InvestmentFormEnum;
import com.br.sincredi.simulador.pages.enums.InvestmentProfileTypeEnum;
import com.br.sincredi.simulador.pages.enums.InvestmentSimulationTableEnum;
import com.br.sincredi.simulador.pages.enums.MessageEnum;
import com.br.sincredi.simulador.pages.enums.OptionsSimulatorEnum;
import com.br.sincredi.simulador.pages.enums.PageEnum;
import com.br.sincredi.simulador.pages.enums.SimulationResultEnum;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class InvestmentSimulatorSteps {

	private InvestmentFormPage formularioDeInvestimento = new InvestmentFormPage();
	private CheckpointPage verificarPagina = new CheckpointPage();
	private SimulationResultPage resultadoSimulacaoInvestimento = new SimulationResultPage();

	@Dado("^a disponibilização da simulação de um investimento na poupança como pessoa física$")
	public void aDisponibilizaçãoDaSimulaçãoDeUmInvestimentoNaPoupançaComoPessoaFísica() throws Throwable {
		verificarPagina.checkCurrentPage(PageEnum.Investment_Form);
	}

	@Quando("^é selecionado o perfil \"([^\"]*)\"$")
	public void éSelecionadoOPerfil(String arg1) throws Throwable {
		formularioDeInvestimento.informInvestmentProfile(InvestmentProfileTypeEnum.For_You);
	}

	@Quando("^ao informar o valor inicial de investimento igual a R\\$: \"([^\"]*)\"$")
	public void aoInformarOValorInicialDeInvestimentoIgualAR$(String arg1) throws Throwable {
		formularioDeInvestimento.fillTextField(InvestmentFormEnum.Initial_Value_Investment, arg1);
	}

	@Quando("^ao informar o valor que deve ser poupando todo mês de \"([^\"]*)\"$")
	public void aoInformarOValorQueDeveSerPoupandoTodoMêsDe(String arg1) throws Throwable {
		formularioDeInvestimento.fillTextField(InvestmentFormEnum.Monthly_Investment_Value, arg1);
	}

	@Quando("^preencher o período mensal de aplicação igual a \"([^\"]*)\" meses$")
	public void preencherOPeríodoMensalDeAplicaçãoIgualAMeses(String arg1) throws Throwable {
		formularioDeInvestimento.fillTextField(InvestmentFormEnum.Investment_Frequency, arg1);
	}

	@Quando("^selecionar a funcionalidade \"([^\"]*)\"$")
	public void selecionarAFuncionalidade(String arg1) throws Throwable {
		formularioDeInvestimento.selectFormOption(OptionsSimulatorEnum.Simulate);
	}

	@Entao("^é retornado a mensagem \"([^\"]*)\"$")
	public void éRetornadoAMensagem(String arg1) throws Throwable {
		String mensagemValorAtual = resultadoSimulacaoInvestimento
				.getFieldValue(SimulationResultEnum.Number_Of_Months_Invested);
		BaseVerificationPoint.verificationPointConditionalString(mensagemValorAtual.trim(), arg1.trim());
	}

	@Entao("^o valor total de \"([^\"]*)\" que será investido até o fim do período$")
	public void oValorTotalDeQueSeráInvestidoAtéOFimDoPeríodo(String arg1) throws Throwable {
		String mensagemValorAtual = resultadoSimulacaoInvestimento
				.getFieldValue(SimulationResultEnum.Total_Amount_Invested);
		BaseVerificationPoint.verificationPointConditionalString(mensagemValorAtual.trim(), arg1.trim());
	}

	@Entao("^o valor de \"([^\"]*)\" investidos em \"([^\"]*)\" meses na primeira linha da tabela de referência$")
	public void oValorDeInvestidosEmMesesNaPrimeiraLinhaDaTabelaDeReferência(String arg1, String arg2)
			throws Throwable {
		String tempoAtualInvestimentoLinhaUm = resultadoSimulacaoInvestimento
				.getInvestmentTimeValue(InvestmentSimulationTableEnum.Line_One);
		String valorAtualInvestimentoLinhaUm = resultadoSimulacaoInvestimento
				.getInvestedCapitalListValue(InvestmentSimulationTableEnum.Line_One);

		BaseVerificationPoint.verificationPointConditionalString(tempoAtualInvestimentoLinhaUm.trim(), arg2.trim());
		BaseVerificationPoint.verificationPointConditionalString(valorAtualInvestimentoLinhaUm.trim(), arg1.trim());

	}

	@Entao("^o valor de \"([^\"]*)\" investidos em \"([^\"]*)\" meses na segunda linha da tabela de referência$")
	public void oValorDeInvestidosEmMesesNaSegundaLinhaDaTabelaDeReferência(String arg1, String arg2) throws Throwable {
		String tempoAtualInvestimentoLinhaDois = resultadoSimulacaoInvestimento
				.getInvestmentTimeValue(InvestmentSimulationTableEnum.Line_Two);
		String valorAtualInvestimentoLinhaDois = resultadoSimulacaoInvestimento
				.getInvestedCapitalListValue(InvestmentSimulationTableEnum.Line_Two);

		BaseVerificationPoint.verificationPointConditionalString(tempoAtualInvestimentoLinhaDois.trim(), arg2.trim());
		BaseVerificationPoint.verificationPointConditionalString(valorAtualInvestimentoLinhaDois.trim(), arg1.trim());
	}

	@Entao("^o valor de \"([^\"]*)\" investidos em \"([^\"]*)\" meses na terceira linha da tabela de referência$")
	public void oValorDeInvestidosEmMesesNaTerceiraLinhaDaTabelaDeReferência(String arg1, String arg2)
			throws Throwable {

		String tempoAtualInvestimentoLinhaTres = resultadoSimulacaoInvestimento
				.getInvestmentTimeValue(InvestmentSimulationTableEnum.Line_Three);
		String valorAtualInvestimentoLinhaTres = resultadoSimulacaoInvestimento
				.getInvestedCapitalListValue(InvestmentSimulationTableEnum.Line_Three);

		BaseVerificationPoint.verificationPointConditionalString(tempoAtualInvestimentoLinhaTres.trim(), arg2.trim());
		BaseVerificationPoint.verificationPointConditionalString(valorAtualInvestimentoLinhaTres.trim(), arg1.trim());
	}

	@Entao("^o valor de \"([^\"]*)\" investidos em \"([^\"]*)\" meses na quarta linha da tabela de referência$")
	public void oValorDeInvestidosEmMesesNaQuartaLinhaDaTabelaDeReferência(String arg1, String arg2) throws Throwable {
		String tempoAtualInvestimentoLinhaQuatro = resultadoSimulacaoInvestimento
				.getInvestmentTimeValue(InvestmentSimulationTableEnum.Line_Four);
		String valorAtualInvestimentoLinhaQuatro = resultadoSimulacaoInvestimento
				.getInvestedCapitalListValue(InvestmentSimulationTableEnum.Line_Four);

		BaseVerificationPoint.verificationPointConditionalString(tempoAtualInvestimentoLinhaQuatro.trim(), arg2.trim());
		BaseVerificationPoint.verificationPointConditionalString(valorAtualInvestimentoLinhaQuatro.trim(), arg1.trim());
	}

	@Entao("^a opção para  \"([^\"]*)\"$")
	public void aOpçãoPara(String arg1) throws Throwable {
		verificarPagina.checkCurrentPage(PageEnum.Simulation_Result);
		verificarPagina.checkButton(OptionsSimulatorEnum.Clear_Formulario);
	}

	@Dado("^a disponibilização do preenchimento do formulário de simulação na poupança$")
	public void aDisponibilizaçãoDoPreenchimentoDoFormulárioDeSimulaçãoNaPoupança() throws Throwable {
		verificarPagina.checkCurrentPage(PageEnum.Investment_Form);
	}

	@Quando("^for escolhido o perfil \"([^\"]*)\"$")
	public void forEscolhidoOPerfil(String arg1) throws Throwable {
		formularioDeInvestimento.informInvestmentProfile(InvestmentProfileTypeEnum.For_You);
	}

	@Quando("^ao informar o valor de investimento inicial igual a R\\$: \"([^\"]*)\"$")
	public void aoInformarOValorDeInvestimentoInicialIgualAR$(String arg1) throws Throwable {
		formularioDeInvestimento.fillTextField(InvestmentFormEnum.Initial_Value_Investment, arg1);
	}

	@Quando("^ao informar o valor de investimento mensal igual a R\\$: \"([^\"]*)\"$")
	public void aoInformarOValorDeInvestimentoMensalIgualAR$(String arg1) throws Throwable {
		formularioDeInvestimento.fillTextField(InvestmentFormEnum.Monthly_Investment_Value, arg1);
	}

	@Quando("^informar o período mensal de aplicação igual a \"([^\"]*)\" meses$")
	public void informarOPeríodoMensalDeAplicaçãoIgualAMeses(String arg1) throws Throwable {
		formularioDeInvestimento.fillTextField(InvestmentFormEnum.Investment_Frequency, arg1);
	}

	@Quando("^selecionar a opção \"([^\"]*)\"$")
	public void selecionarAOpção(String arg1) throws Throwable {
		formularioDeInvestimento.selectFormOption(OptionsSimulatorEnum.Simulate);
	}

	@Então("^a mensagem \"([^\"]*)\" para o investimento inicial$")
	public void aMensagemParaOInvestimentoInicial(String arg1) throws Throwable {
		verificarPagina.checkMessage(MessageEnum.Invalid_Initial_Value_Message, arg1);
	}

	@Então("^a mensagem \"([^\"]*)\" para o investimento final$")
	public void aMensagemParaOInvestimentoFinal(String arg1) throws Throwable {
		verificarPagina.checkMessage(MessageEnum.Invalid_Monthly_Amount_Message, arg1);
	}

}
