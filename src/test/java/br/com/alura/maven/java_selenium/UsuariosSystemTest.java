package br.com.alura.maven.java_selenium;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsuariosSystemTest {

	private ChromeDriver driver;

	@Before
	public void inicializa() {

		System.setProperty("webdriver.chrome.driver", "/opt/google/chrome/chromedriver");
		driver = new ChromeDriver();

	}

	@Test
	public void deveAdicionarUmUsuario() {
		
		UsuariosPage usuarios = new UsuariosPage(driver); 
		usuarios.novo().cadastra("Ronaldo Luiz de Albuquerque", "ronaldo2009@terra.com.br");

		assertTrue(usuarios.existeNaListagem("Ronaldo Luiz de Albuquerque", "ronaldo2009@terra.com.br"));

		// System.setProperty("webdriver.chrome.driver",
		// "/opt/google/chrome/chromedriver");
		// WebDriver driver = new ChromeDriver();
		//
		// driver.get("http://localhost:8080/usuarios");
		// driver.findElement(By.linkText("Novo Usuário")).click();
		//
		// WebElement nome = driver.findElement(By.name("usuario.nome"));
		// WebElement email = driver.findElement(By.name("usuario.email"));
		//
		// nome.sendKeys("Ronaldo Luiz de Albuquerque");
		// email.sendKeys("ronaldo2009@terra.com.br");
		//
		// WebElement botaoSalvar = driver.findElement(By.id("btnSalvar"));
		// botaoSalvar.click();
		//
		// // Usando JUnit para trazer os dados de nome e email quando for
		// // adicionado
		// boolean achouNome = driver.getPageSource().contains("Ronaldo Luiz de
		// Alburquerque");
		// boolean achouEmail =
		// driver.getPageSource().contains("ronaldo2009@terra.com.br");
		// 
		// assertTrue(achouNome);
		// assertTrue(achouEmail);

	}

	// Obs: Para cadastro sem nome de usuário.
	// @Test
	// public void naoDeveAdicionarUmUsuarioSemNome() {
	//
	// System.setProperty("webdriver.chrome.driver",
	// "/opt/google/chrome/chromedriver");
	// WebDriver driver = new ChromeDriver();
	// driver.get("http://localhost:8080/usuarios/new");
	//
	// WebElement email = driver.findElement(By.name("usuario.email"));
	//
	// email.sendKeys("ronaldo2009@terra.com.br");
	// email.submit();
	//
	// assertTrue(driver.getPageSource().contains("Nome obrigatorio!"));
	//
	// driver.close();
	//
	// }
	//
	//
	// Obs: Para cadastro sem nome e email.
	// @Test
	// public void naoDeveAdicionarUmUsuarioSemNomeOuEmail() {
	//
	// System.setProperty("webdriver.chrome.driver",
	// "/opt/google/chrome/chromedriver");
	// WebDriver driver = new ChromeDriver();
	// driver.get("http://localhost:8080/usuarios/new");
	//
	// WebElement email = driver.findElement(By.name("usuario.email"));
	// email.submit();
	//
	// assertTrue(driver.getPageSource().contains("Nome obrigatorio!"));
	// assertTrue(driver.getPageSource().contains("E-mail obrigatorio!"));
	//
	// driver.close();
	//
	// }

	@After
	public void finaliza() {
		driver.close();
	}

}
