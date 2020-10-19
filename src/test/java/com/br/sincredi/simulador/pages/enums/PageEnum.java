package com.br.sincredi.simulador.pages.enums;

public enum PageEnum {
	
	/**
	 * PAGINA DE SIMULADOR DE INVESTIMENTO
	 * */
	Investment_Form(".cssSelector",".sessaoTitulo","Simulador de Investimento - Poupança"),
	
	/**
	 * PAGINA RESULTADO DA SIMULAÇÃO
	 * */
	Simulation_Result(".cssSelector","a.btnAmarelo","REFAZER A SIMULAÇÃO");

	
	private String strType;
	private String strProp;
	private String name;
	
	 PageEnum(String strType,String strProp,String name) {
		this.strType=strType;
		this.strProp=strProp;
		this.name=name;
	}
	 
	 public String getStrProp() {
		return strProp;
	}
	 
	 public String getStrType() {
		return strType;
	}
	 
	 public String getName() {
		return name;
	}
}
