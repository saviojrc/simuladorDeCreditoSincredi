package com.br.sincredi.simulador.support;

import java.io.IOException;

public class Utilities {

	public static Boolean VerificaObjetoValido(Object obj) {
		return obj != null;
	}

	public static Boolean VerificaObjetoValido(String obj) {
		return obj != null && obj.length() > 0;
	}
	
	public static String getParameter(String strPrm) {
		try {
			return Manipulator.getProp().getProperty(strPrm);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}
	}

}
