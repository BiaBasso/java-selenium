package br.com.alura.maven.java_selenium;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeiloesSystemTest {

	private WebDriver driver;
	private LeiloesPage leiloes;
	
	@Before
	public void inicializa() {
		System.setProperty("webdriver.chrome.driver", "/opt/google/chrome/chromedriver");
		driver = new ChromeDriver();
		leiloes = new LeiloesPage(driver);
		
		driver.get("http://localhost:8080/apenas-teste/limpa");
		
		UsuariosPage usuarios = new UsuariosPage(driver);
		usuarios.visita();
		usuarios.novo().cadastra("Paulo Henrique", "paulo@henrique.com");
		usuarios.novo().cadastra("Jose Eduardo", "jose@eduardo.com");
		
		LeiloesPage leiloes = new LeiloesPage(driver);
		leiloes.visita();
		leiloes.novo().preenche("Geladeira", 100, "Paulo Henrique", false);
		
		
		
	}
	
	@Test
	public void deveCadastrarUmLeilao() {
		
		leiloes.visita();
		NovoLeilaoPage novoLeilao = leiloes.novo();
		novoLeilao.preenche("Geladeira", 123, "Paulo Henrique", true);
		
		assertTrue(leiloes.existe("Geladeira", 123, "Paulo Henrique", true));
	}
	
	@After
	public void finaliza(){
		driver.close();
	}
}
