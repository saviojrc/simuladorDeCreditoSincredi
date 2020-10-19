package com.br.sincredi.simulador.pages.enums;

public enum InvestmentSimulationTableEnum {

	Line_One(".cssSelector",".maisOpcoes > table:nth-child(2) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(1)",".cssSelector",".maisOpcoes > table:nth-child(2) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2)"),
	Line_Two(".cssSelector",".maisOpcoes > table:nth-child(2) > tbody:nth-child(2) > tr:nth-child(2) > td:nth-child(1)",".cssSelector",".maisOpcoes > table:nth-child(2) > tbody:nth-child(2) > tr:nth-child(2) > td:nth-child(2)"),
	Line_Three(".cssSelector",".maisOpcoes > table:nth-child(2) > tbody:nth-child(2) > tr:nth-child(3) > td:nth-child(1)",".cssSelector",".maisOpcoes > table:nth-child(2) > tbody:nth-child(2) > tr:nth-child(3) > td:nth-child(2)"),
	Line_Four(".cssSelector",".maisOpcoes > table:nth-child(2) > tbody:nth-child(2) > tr:nth-child(4) > td:nth-child(1)",".cssSelector",".maisOpcoes > table:nth-child(2) > tbody:nth-child(2) > tr:nth-child(4) > td:nth-child(2)");


	private String strTypeTime;
	private String strPropTime;
	private String strTypeValue;
	private String strPropValue;
	
	 InvestmentSimulationTableEnum(String strTypeTime,String strPropTime,String strTypeValue,String strPropValue) {
		this.strTypeTime=strTypeTime;
		this.strPropTime=strPropTime;
		this.strTypeValue=strTypeValue;
		this.strPropValue=strPropValue;
	}

	
	public String getStrTypeTime() {
		return strTypeTime;
	}
	
	public String getStrPropTime() {
		return strPropTime;
	}

	
	public String getStrTypeValue() {
		return strTypeValue;
	}
	
	public String getStrPropValue() {
		return strPropValue;
	}

	

	
	
}
