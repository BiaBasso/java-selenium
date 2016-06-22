package br.com.alura.maven.java_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DetalhesDoLeilaoPage {

	private WebDriver driver;
	
	public DetalhesDoLeilaoPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void lance(String usuario, double valor) {
		WebElement txtValor = driver.findElement(By.name("lance.valor"));
		Select cbUsuario = new Select(driver.findElement(By.name("lance.usuario.id")));
		
		cbUsuario.selectByVisibleText(usuario);
		txtValor.sendKeys(String.valueOf(valor));
		
		driver.findElement(By.id("btnDarLance")).click();
	
	}
	
	public boolean existeLance(String usuario, double valor) {
		return driver.getPageSource().contains(usuario) &&
			   driver.getPageSource().contains(String.valueOf(valor));
	}
}
