package br.com.alura.maven.java_selenium;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsuariosSystemTest {

	private ChromeDriver driver;
	private UsuariosPage usuarios;

	@Before
	public void inicializa() {

		System.setProperty("webdriver.chrome.driver", "/opt/google/chrome/chromedriver");
		driver = new ChromeDriver();
		this.usuarios = new UsuariosPage(driver);
	}

	@Test
	public void deveAdicionarUmUsuario() {
		
		
		usuarios.visita();
		usuarios.novo().cadastra("Ronaldo Luiz de Albuquerque", "ronaldo2009@terra.com.br");

		assertTrue(usuarios.existeNaListagem("Ronaldo Luiz de Albuquerque", "ronaldo2009@terra.com.br"));

	}
	
//	@Test
//	public void deveDeletarUmUsuario(){
//		
//		usuarios.novo().cadastra("Ronaldo Luiz de Albuquerque", "ronaldo2009@terra.com.br");
//        assertTrue(usuarios.existeNaListagem ("Ronaldo Luiz de Albuquerque", "ronaldo2009@terra.com.br"));
//
//        usuarios.deletaUsuarioNaPosicao(1);
//
//        assertFalse(usuarios.existeNaListagem("Ronaldo Luiz de Albuquerque", "ronaldo2009@terra.com.br"));
//	}

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
