package com.br.sincredi.simulador.steps;

import com.br.sincredi.simulador.baseClass.BaseSteps;
import com.br.sincredi.simulador.support.Utilities;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseSteps {
	
	private String url = Utilities.getParameter("URL_APP");

	@Before
	public void Initialize(Scenario _scenario) throws Throwable {
		
		navegatePage(url);
		BaseSteps.scenario = _scenario;
	}

	@After
	public void Finish() throws Throwable {
		if (BaseSteps.scenario.isFailed())
			screenShotNow();
		closeBrowser();
	}

}
