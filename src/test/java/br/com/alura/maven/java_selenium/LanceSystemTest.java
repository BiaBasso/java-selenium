package br.com.alura.maven.java_selenium;

import org.junit.Test;

public class LanceSystemTest {

	@Test
	public void deveFazerUmLance(){
		leiloes.detalhes(1);
		
		lances.lance("Jose Eduardo", 150);
		
		assertTrue(lances.existeLance("Jose Eduardo", 150));
	}
}
