package com.br.sincredi.simulador.pages;

import com.br.sincredi.simulador.baseClass.BaseSteps;
import com.br.sincredi.simulador.baseClass.BaseVerificationPoint;
import com.br.sincredi.simulador.pages.enums.OptionsSimulatorEnum;
import com.br.sincredi.simulador.pages.enums.PageEnum;

public class CheckpointPage extends BaseSteps {

	public void checkCurrentPage(PageEnum page) {
		String paginaAtual = getPropertyObject(page.getStrType(), page.getStrProp(), "innerText").trim();
		String paginaInicialEsperada = page.getName();

		BaseVerificationPoint.verificationPointConditionalString(paginaAtual, paginaInicialEsperada);
	}

	public void checkButton(OptionsSimulatorEnum option) {
		waintElementisEnable(option.getStrType(), option.getStrProp());
		waintPresenceOfElementLocated(option.getStrType(), option.getStrProp());
		triggerDowmKey();
		MoveToElementPage(option.getStrType(), option.getStrProp());
		BaseVerificationPoint.verificationPointConditional(true, verifyIsEnabled(option.getStrType(), option.getStrProp()));
	}

}
