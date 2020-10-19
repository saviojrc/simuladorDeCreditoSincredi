package com.br.sincredi.simulador.pages.enums;

public enum SimulationResultEnum {
	
	Number_Of_Months_Invested(".cssSelector","span.texto:nth-child(1)"),
	Total_Amount_Invested(".cssSelector",".valor");
	

	private String strType;
	private String strProp;

	private SimulationResultEnum(String strType, String strProp) {
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
