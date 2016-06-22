package br.com.alura.maven.java_selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class LanceSystemTest {

	private ChromeDriver driver;
	private LeiloesPage leiloes;


	@Before
	public void inicializa(){
		System.setProperty("webdriver.chrome.driver", "/opt/google/chrome/chromedriver");
		driver = new ChromeDriver();
		leiloes = new LeiloesPage(driver);
		
	}
	
	
	@Test
	public void deveFazerUmLance(){
		DetalhesDoLeilaoPage lances = leiloes.detalhes(1);
		
		lances.lance("Jose Eduardo", 150);
		
		assertTrue(lances.existeLance("Jose Eduardo", 150));
	}
}
