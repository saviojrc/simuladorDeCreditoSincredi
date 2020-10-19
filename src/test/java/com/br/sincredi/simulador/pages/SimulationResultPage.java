package com.br.sincredi.simulador.pages;

import com.br.sincredi.simulador.baseClass.BaseSteps;
import com.br.sincredi.simulador.pages.enums.InvestmentSimulationTableEnum;
import com.br.sincredi.simulador.pages.enums.SimulationResultEnum;

public class SimulationResultPage extends BaseSteps {

	/***
	 *Método para obter o valor dos campos: </br>
	 * <li>Quantidade de meses informada para o investimento</li>
	 * <li>Valor Investido</li>
	 **/
	
	public String getFieldValue(SimulationResultEnum field) {
		triggerDowmKey();
		waintVisibilityOfElementLocated(field.getStrType(), field.getStrProp());
		waintPresenceOfElementLocated(field.getStrType(), field.getStrProp());
		return getPropertyObject(field.getStrType(), field.getStrProp(), "innerText").trim();
	}
	
	/***
	 *Método para obter o valor do campo: </br>
	 * <li>Tempo (Meses)</li>
	 **/

	public String getInvestmentTimeValue(InvestmentSimulationTableEnum field) {
		MoveToElementPage(field.getStrTypeTime(), field.getStrPropTime());
		waintVisibilityOfElementLocated(field.getStrTypeTime(), field.getStrPropTime());
		waintPresenceOfElementLocated(field.getStrTypeTime(), field.getStrPropTime());
		return getPropertyObject(field.getStrTypeTime(), field.getStrPropTime(), "innerText").trim();
	}

	/***
	 *Método para obter o valor dos campos: </br>
	 * <li>Valor do investimento da tabela</li>
	 **/
	public String getInvestedCapitalListValue(InvestmentSimulationTableEnum field) {
		waintVisibilityOfElementLocated(field.getStrTypeValue(), field.getStrPropValue());
		waintPresenceOfElementLocated(field.getStrTypeValue(), field.getStrPropValue());
		return getPropertyObject(field.getStrTypeValue(), field.getStrPropValue(), "innerText").trim();
	}
	
	
	
	
}
