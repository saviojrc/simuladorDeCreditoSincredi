package com.br.sincredi.simulador.pages.enums;

/***
 * 
 * OPÇÕES DO SIMULADOR
 * 
 */
public enum OptionsSimulatorEnum {

	/**
	 * Limpar Formulário
	 */
	Clear_Formulario(".cssSelector", "a.btn:nth-child(1)"),
	/***
	 * Simular
	 * 
	 */
	Simulate(".cssSelector", "button.btn"),
	
	/***
	 * Refazer Simulação
	 * 
	 */
	Make_Simulation(".cssSelector", "a.btnAmarelo");

	private String strType;
	private String strProp;

	OptionsSimulatorEnum(final String strType, String strProp) {
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
