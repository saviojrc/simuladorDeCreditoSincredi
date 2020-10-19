package com.br.sincredi.simulador.pages;

import com.br.sincredi.simulador.baseClass.BaseSteps;
import com.br.sincredi.simulador.baseClass.BaseVerificationPoint;
import com.br.sincredi.simulador.pages.enums.MessageEnum;
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
		BaseVerificationPoint.verificationPointConditional(true,
				verifyIsEnabled(option.getStrType(), option.getStrProp()));
	}

	public void checkMessage(MessageEnum message, String expectedMessage ) {
		waintElementisEnable(message.getStrType(), message.getStrProp());
		waintPresenceOfElementLocated(message.getStrType(), message.getStrProp());
		
		String currentMessage = getPropertyObject(message.getStrType(), message.getStrProp(), "innerText").trim();
		
		BaseVerificationPoint.verificationPointConditionalString(currentMessage, expectedMessage.trim());
	}

}
