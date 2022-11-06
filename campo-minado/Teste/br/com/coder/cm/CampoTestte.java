package br.com.coder.cm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.cod3er.cm.excecao.copy.ExplosaoException;
import br.com.cod3er.cm.modelo.Campo;

public class CampoTestte {
	
	Campo campo;
	
	@BeforeEach
	void iniciaCampo() {
		campo = new Campo(3, 3);
	}
	
	@Test
	void testeVizinhoVertical1() {
		Campo vizinho = new Campo(2, 3);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
	}
	@Test
	void testeVizinhoVertical2() {
		Campo vizinho = new Campo(4, 3);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
	}
	@Test
	void testeVizinhoHorizontal1() {
		Campo vizinho = new Campo(3, 4);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
	}
	@Test
	void testeVizinhoHorizontal2() {
		Campo vizinho = new Campo(3, 2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
	}

	
	
	
	
	
	
	@Test
	void testeVizinhoDiagonal1() {
		Campo vizinho = new Campo(2, 2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
	}
	@Test
	void testeVizinhoDiagonal2() {
		Campo vizinho = new Campo(4, 2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
	}
	@Test
	void testeVizinhoDiagonal3() {
		Campo vizinho = new Campo(2, 4);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
	}
	@Test
	void testeVizinhoDiagonal4() {
		Campo vizinho = new Campo(4, 4);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
	}

	
	@Test
	void testeNaoVizinho(){
		Campo vizinho = new Campo(3, 5);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertFalse(resultado);
	}
	
	
	
	@Test
	void testeValorPadraoMarcado() {
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void testeAlternarMarcacao() {
		campo.alternarMarca();
		assertTrue(campo.isMarcado());
	}
	
	
	@Test
	void testeAlternarMarcacaoDuasVezes() {
		campo.alternarMarca();
		campo.alternarMarca();
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void testeAbrirCampo_NaoMinado_NaoMarcado() {
		assertTrue(campo.abrir());
	}

	
	@Test
	void testeAbrirCampo_NaoMinado_Marcado() {
		campo.alternarMarca();
		assertFalse(campo.abrir());
	}
	
	
	
	@Test
	void testeAbrirCampo_Minado_Marcado() {
		campo.minar();
		campo.alternarMarca();
		assertFalse(campo.abrir());
	}
	
	@Test
	void testeAbrirCampo_Minado_NaoMarcado() {
		campo.minar();
		assertThrows(ExplosaoException.class, () -> {
			campo.abrir();
		});
	}
	
	@Test
	void testeAbrirComVizinhos() {
		Campo campo22 = new Campo(2, 2);
		Campo campo11 = new Campo(1, 1);

		campo22.adicionarVizinho(campo11);
		campo.adicionarVizinho(campo22);
		
		campo.abrir();
	    
		assertTrue(campo22.isAberto() && campo11.isAberto() && campo.isAberto());
	}
	
	@Test
	void testeAbrirComVizinhos2() {
		Campo campo11 = new Campo(1, 1);
		Campo campo12 = new Campo(1, 2);
		Campo campo22 = new Campo(2, 2);
		campo12.minar();
		
		campo22.adicionarVizinho(campo11);
		campo22.adicionarVizinho(campo12);
		campo.adicionarVizinho(campo22);
		
		campo.abrir();
		
		assertTrue(campo22.isAberto() && campo11.isFechado() && campo.isAberto());
	}
	
	@Test
	void testeNumeroDeMinas() {
		Campo campo11 = new Campo(1, 1);
		Campo campo12 = new Campo(1, 2);
		Campo campo22 = new Campo(2, 2);
		campo12.minar();
		
		campo22.adicionarVizinho(campo11);
		campo22.adicionarVizinho(campo12);
		campo.adicionarVizinho(campo22);
		
		long a = campo22.minasNaVizinhanca();
		
		assertEquals(1, a);
	}
	
	
	@Test
	void testeReiniciar() {
		campo.setAberto(true);
		campo.setMarcado(true);
		campo.setMinado(true);
		campo.reiniciar();
		
		assertTrue(!(campo.isMinado() && campo.isAberto() && campo.isMarcado()));
	}
	
	@Test
	void testeObjetivoAlcancadoDesvendado() {
		campo.setAberto(true);
		campo.setMinado(false);
		assertTrue(campo.objetivoAlcancado());
	}

	@Test
	void testeObjetivoAlcancadoDesvendadoFalse1() {
		campo.setAberto(false);
		campo.setMinado(false);
		assertFalse(campo.objetivoAlcancado());
	}

	@Test
	void testeObjetivoAlcancadoDesvendadoFalse2() {
		campo.setAberto(false);
		campo.setMinado(true);
		assertFalse(campo.objetivoAlcancado());
	}
	
	@Test
	void testeObjetivoAlcancadoDesvendadoFalse3() {
		campo.setAberto(false);
		campo.setMinado(true);
		assertFalse(campo.objetivoAlcancado());
	}

	@Test
	void testeObjetivoAlcancadoDesvendadoFalse4() {
		campo.setAberto(false);
		campo.setMinado(true);
		assertFalse(campo.objetivoAlcancado());
	}
	@Test
	void testeObjetivoAlcancadoDesvendadoFalse5() {
		campo.setAberto(true);
		campo.setMinado(true);
		assertFalse(campo.objetivoAlcancado());
	}

	
	
	
	
	@Test
	void testeObjetivoAlcancadoProtegido() {
		campo.setMarcado(true);
		campo.setMinado(true);
		assertTrue(campo.objetivoAlcancado());
	}

	@Test
	void testeObjetivoAlcancadoProtegidoFalse1() {
		campo.setMarcado(false);
		campo.setMinado(true);
		assertFalse(campo.objetivoAlcancado());
	}

	@Test
	void testeObjetivoAlcancadoProtegidoFalse2() {
		campo.setMarcado(true);
		campo.setMinado(false);
		assertFalse(campo.objetivoAlcancado());
	}
	

	
	
	@Test
	void testeToString_Marcado() {
		campo.setMarcado(true);
		String t = campo.toString();
		assertEquals("x", t);
	}
	
	@Test
	void testeToString_AbertoEMinado() {
		campo.setAberto(true);
		campo.setMinado(true);
		String t = campo.toString();
		assertEquals("*", t);
	}

	@Test
	void testeToString_AbertoComMinaNaVizinhaca() {
		Campo campo22 = new Campo(2, 2);
		campo22.minar();
		Campo campo23 = new Campo(2, 3);
		campo23.minar();
		
		campo.adicionarVizinho(campo22);
		campo.adicionarVizinho(campo23);
		campo.abrir();
		
		String t = campo.toString();
		assertEquals("2", t);
	}

	@Test
	void testeToString_Aberto() {
		campo.setAberto(true);
		String t = campo.toString();
		assertEquals(" ", t);
	}

	@Test
	void testeToString_Fechado() {
		String t = campo.toString();
		assertEquals("?", t);
	}
	



}





















