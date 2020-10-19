package com.br.sincredi.simulador.pages.enums;

import java.util.Arrays;
import java.util.List;

public enum InvestmentFormEnum {

	
	/***
	 * CAMPO Qual o valor que você quer aplicar?
	 * */
	Initial_Value_Investment(".id","valorAplicar"),
	/***
	 * CAMPO Quanto você quer poupar todo mês? 
	 * */
	Monthly_Investment_Value(".id","valorInvestir"),
	/***
	 * CAMPO Por quanto tempo você quer poupar?
	 * */
	Investment_Frequency(".id","tempo"),
	/***
	 * Dropdowm  Meses ou Anos
	 * */
	
	Drop_Dowm_Frequency(".cssSelector","span.btn");
	
	private String strType;
	private String strProp;
	
	 InvestmentFormEnum(String strType, String strProp) {
		this.strType=strType;
		this.strProp=strProp;
	}
	 
	 public String getStrProp() {
		return strProp;
	}
	 public String getStrType() {
		return strType;
	}
	 
	 
	public static List<InvestmentFormEnum> listOfTextFields(){
		return Arrays.asList(Initial_Value_Investment,Monthly_Investment_Value,Investment_Frequency);
	}
}
