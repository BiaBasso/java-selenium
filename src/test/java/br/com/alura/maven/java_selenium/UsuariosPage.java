package br.com.alura.maven.java_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UsuariosPage {
	
	private WebDriver driver;
	
	public UsuariosPage (WebDriver driver) {
		this.driver = driver;
	}

	public void visita(){
		driver.get("http://localhost:8080/usuarios");
		
	}
	
	public void novo() {
		driver.findElement(By.linkText("Novo Usuário")).click();
	}
	
	public boolean existeNaListagem(String nome, String email) {
		return driver.getPageSource().contains(nome) &&
				driver.getPageSource().contains(email);
	}
}
