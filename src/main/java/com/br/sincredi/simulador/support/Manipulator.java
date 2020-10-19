package com.br.sincredi.simulador.support;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Manipulator {

	public static Properties getProp() throws IOException {
		Properties props = new Properties();
		FileInputStream file = new FileInputStream(".\\src\\test\\resources\\dados.properties");
		props.load(file);
		return props;

	}
}
