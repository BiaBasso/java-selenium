package br.com.alura.maven.java_selenium;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeiloesSystemTest {

	private WebDriver driver;
	private LeiloesPage leiloes;
	
	
	public void inicializa() {
		System.setProperty("webdriver.chrome.driver", "/opt/google/chrome/chromedriver");
		driver = new ChromeDriver();
		leiloes = new LeiloesPage(driver);
	}
	
	@Test
	public void deveCadastrarUmLeilao() {
		
		leiloes.visita();
		NovoLeilaoPage novoLeilao = leiloes.novo();
		novoLeilao.preenche("Geladeira", 123, "Paulo Henrique", true);
		
		assertTrue(leiloes.existe("Geladeira", 123, "Paulo Henrique", true));
	}
}
