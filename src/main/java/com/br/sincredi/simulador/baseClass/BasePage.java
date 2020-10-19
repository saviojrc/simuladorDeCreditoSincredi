package com.br.sincredi.simulador.baseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.br.sincredi.simulador.support.TipoDeElementoByEnum;
import com.br.sincredi.simulador.support.Utilities;

public class BasePage {

	private static WebDriver driver;
	private static Integer TIME_OUT = 10;
	private static JavascriptExecutor js = ((JavascriptExecutor) driver);

	public void waintPresenceOfElementLocated(String strProperty, String strValue) {
		try {

			By by = TipoDeElementoByEnum.getTipoDeElemento(strProperty, strValue);
			WebDriverWait wait = new WebDriverWait(driver, TIME_OUT);
			wait.until(ExpectedConditions.presenceOfElementLocated(by));

		} catch (Exception e) {
			e.printStackTrace();
			try {
				throw new Exception(e.getMessage());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	public  JavascriptExecutor getJS() {
		return js;
	}

	public static void sleep(int segundos) {
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void waintElementToBeClickable(String strProperty, String strValue) {
		try {

			By by = TipoDeElementoByEnum.getTipoDeElemento(strProperty, strValue);
			WebDriverWait wait = new WebDriverWait(driver, TIME_OUT);
			wait.until(ExpectedConditions.elementToBeClickable(by));

		} catch (Exception e) {
			e.printStackTrace();
			try {
				throw new Exception(e.getMessage());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	public void waintVisibilityOfElementLocated(String strProperty, String strValue) {
		try {

			By by = TipoDeElementoByEnum.getTipoDeElemento(strProperty, strValue);
			WebDriverWait wait = new WebDriverWait(driver, TIME_OUT);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));

		} catch (Exception e) {
			e.printStackTrace();
			try {
				throw new Exception(e.getMessage());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	public void implicitlyWait(int timeOut) {
		driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
	}

	public void waintElementisEnable(String strProperty, String strValue) {
		By by = TipoDeElementoByEnum.getTipoDeElemento(strProperty, strValue);
		WebElement objhtmlWebElement = getWebElement(by);

		if (Utilities.VerificaObjetoValido(objhtmlWebElement)) {
			do {
				implicitlyWait(1);
			} while (!objhtmlWebElement.isEnabled());
		}

	}

	public WebElement getWebElement(By by) {
		WebElement objhtmlWebElement = driver.findElement(by);
		return objhtmlWebElement;
	}
	
	public  void navegatePage(String url) {

		try {
			getDriver().navigate().to(url);
			getDriver().manage().window().maximize();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}

	}
	
	public  void closeBrowser() {

		try {

			if(driver!=null ) {
				driver.quit();
				driver=null;
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}

	}

	public static synchronized WebDriver getDriver() {

		try {

			String driverFirefox = Utilities.getParameter("WEBDRIVER_FIREFOX");
			String pathFirefox = Utilities.getParameter("PATH_DRIVER_FIREFOX");
			System.setProperty(driverFirefox, pathFirefox);
			
			if(driver==null) {
				driver = new FirefoxDriver();
			}
			
			return driver;
			
			

		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException(e.getMessage());
		}

	}

}
