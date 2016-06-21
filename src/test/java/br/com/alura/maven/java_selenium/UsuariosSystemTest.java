package br.com.alura.maven.java_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsuariosSystemTest {
	
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://localhost:8080/usuarios/new");
		
		WebElement nome = driver.findElement(By.name("usuario.nome"));
		WebElement email = driver.findElement(By.name("usuario.email"));
		
		nome.sendKeys("Ronaldo Luiz de Albuquerque");
		email.sendKeys("ronaldo2009@terra.com.br");
		
		WebElement botaoSalvar = driver.findElement(By.id("btnSalvar"));
		botaoSalvar.click();
	}
}
