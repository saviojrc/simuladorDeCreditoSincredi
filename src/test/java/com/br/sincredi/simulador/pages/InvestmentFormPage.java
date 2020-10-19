package com.br.sincredi.simulador.pages;

import com.br.sincredi.simulador.baseClass.BaseSteps;
import com.br.sincredi.simulador.pages.enums.ApplicationFrequencyEnum;
import com.br.sincredi.simulador.pages.enums.InvestmentFormEnum;
import com.br.sincredi.simulador.pages.enums.InvestmentProfileTypeEnum;
import com.br.sincredi.simulador.pages.enums.OptionsSimulatorEnum;

public class InvestmentFormPage extends BaseSteps {

	/***
	 * CAMPO INFORME SEU PERFIL
	 * 
	 **/
	public void informInvestmentProfile(InvestmentProfileTypeEnum profile) {

		waintVisibilityOfElementLocated(profile.getStrType(), profile.getStrProp());
		waintPresenceOfElementLocated(profile.getStrType(), profile.getStrProp());
		clickCheckBox(profile.getStrType(), profile.getStrProp());
	}

	/***
	 * Informar um dos campos
	 * <li>Qual o valor que você quer aplicar?</li>
	 * <li>Quanto você quer poupar todo mês?</li>
	 * <li>Por quanto tempo você quer poupar?</li>
	 **/
	public void fillTextField(InvestmentFormEnum textField, String value) {
		if (InvestmentFormEnum.listOfTextFields().contains(textField)) {
			waintVisibilityOfElementLocated(textField.getStrType(), textField.getStrProp());
			waintVisibilityOfElementLocated(textField.getStrType(), textField.getStrProp());
			clearText(textField.getStrType(), textField.getStrProp());
			setText(textField.getStrType(), textField.getStrProp(), value);
		}
	}

	/***
	 * Informar uma das opções
	 * <li>Limpar formulário</li>
	 * <li>Simular</li>
	 * 
	 **/
	public void selectFormOption(OptionsSimulatorEnum option) {

		waintVisibilityOfElementLocated(option.getStrType(), option.getStrProp());
		waintElementisEnable(option.getStrType(), option.getStrProp());
		clickObject(option.getStrType(), option.getStrProp());
	}

	/***
	 * Informar uma das opções
	 * <li>Anos</li>
	 * <li>Meses</li>
	 * 
	 **/

	public void selectPeriodicity(ApplicationFrequencyEnum frequency) {
		
		triggerDowmKey();
		waintVisibilityOfElementLocated(InvestmentFormEnum.Drop_Dowm_Frequency.getStrType(),
				InvestmentFormEnum.Drop_Dowm_Frequency.getStrProp());
		waintElementisEnable(InvestmentFormEnum.Drop_Dowm_Frequency.getStrType(),
				InvestmentFormEnum.Drop_Dowm_Frequency.getStrProp());
		triggerDowmKey();
		clickObject(InvestmentFormEnum.Drop_Dowm_Frequency.getStrType(), InvestmentFormEnum.Drop_Dowm_Frequency.getStrProp());
		waintVisibilityOfElementLocated(InvestmentFormEnum.Drop_Dowm_Frequency.getStrType(),
				frequency.getStrProp());
		triggerDowmKey();
		waintElementisEnable(frequency.getStrType(),
				frequency.getStrProp());
		waintElementToBeClickable(frequency.getStrType(),frequency.getStrProp());
		
		clickObject(frequency.getStrType(),frequency.getStrProp());
	}

}
