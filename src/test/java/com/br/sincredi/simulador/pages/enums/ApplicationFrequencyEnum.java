package com.br.sincredi.simulador.pages.enums;

/**
 * @author Savio Rodrigues</br>
 *         <strong>Periodicidade da aplicação</strong>
 * 
 */
public enum ApplicationFrequencyEnum {

	/**
	 * Meses
	 */
	Months("Meses",".cssSelector",".listaSelect > li:nth-child(1) > a:nth-child(1)"),
	/**
	 * Anos
	 */
	Years("Anos",".cssSelector",".listaSelect > li:nth-child(2) > a:nth-child(1)");

	private String name;
	private String strType;
	private String strProp;

	ApplicationFrequencyEnum(String name, String strType,String strProp) {
		this.name = name;
		this.strType=strType;
		this.strProp=strProp;
	}

	public String getName() {
		return name;
	}
	
	public String getStrProp() {
		return strProp;
	}
	
	public String getStrType() {
		return strType;
	}
}
