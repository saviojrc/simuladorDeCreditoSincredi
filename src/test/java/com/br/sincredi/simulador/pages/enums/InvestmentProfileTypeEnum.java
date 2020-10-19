package com.br.sincredi.simulador.pages.enums;

public enum InvestmentProfileTypeEnum {

	/**
	 * <strong>PARA VOCÊ</strong>
	 * */
	For_You(".cssSelector", "div.relative:nth-child(1) > input:nth-child(2)"),
	/**
	 * <strong>Para sua empresa ou agronegócio </strong>
	 * */
	For_Your_Company_Or_Agribusiness(".cssSelector", "div.relative:nth-child(1) > input:nth-child(4)");

	private String strType;
	private String strProp;

	InvestmentProfileTypeEnum(final String strType, final String strProp) {
		this.strType = strType;
		this.strProp = strProp;
	}

	public String getStrProp() {
		return strProp;
	}

	public String getStrType() {
		return strType;
	}

}
