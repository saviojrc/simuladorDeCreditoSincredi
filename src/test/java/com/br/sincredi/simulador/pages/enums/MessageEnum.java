package com.br.sincredi.simulador.pages.enums;

public enum MessageEnum{

	/**
	 * MENSAGEM DE ERRO DO INVESTIMENTO INICIAL
	 * */
	Invalid_Initial_Value_Message(".id","valorAplicar-error"),
	/**
	 * MENSAGEM DE ERRO DO INVESTIMENTO MENSAL
	 * */
	Invalid_Monthly_Amount_Message(".id","valorInvestir-error");
	
	private String strType;
	private String strProp;
	
	private MessageEnum(String strType, String strProp) {
		this.strType=strType;
		this.strProp=strProp;
	}

	public String getStrProp() {
		return strProp;
	}

	public String getStrType() {
		return strType;
	}

}
