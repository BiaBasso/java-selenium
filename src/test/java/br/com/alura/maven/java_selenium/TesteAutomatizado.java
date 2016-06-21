package br.com.alura.maven.java_selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteAutomatizado {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/opt/google/chrome/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		WebElement campoDeTexto = driver.findElement(By.name("q"));
		campoDeTexto.sendKeys("Caelum");
		// campoDeTexto.submit();

		// File pathToBinary = new
		// File("/home/bianca/Applications/Firefox/firefox-46.0b6/firefox");
		// FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		// FirefoxProfile firefoxProfile = new FirefoxProfile();
		// WebDriver driver = new FirefoxDriver(ffBinary, firefoxProfile);
		//
		//
		// driver.get("http://www.google.com.br");
		//
		// WebElement campoDeTexto = driver.findElement(By.name("q"));
		// campoDeTexto.sendKeys("Caelum");
		//
		// campoDeTexto.submit();
	}
}
