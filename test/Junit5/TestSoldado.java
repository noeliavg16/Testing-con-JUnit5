package Junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Noelia.Soldado;

	class TestSoldado {
		
	
	/* Se puede declarar una anotacion BeforeAll para crear un objeto y que se ejecute una vez siempre antes de comenzar todos los tests. 
		Este método debe definirse como static, pero yo crearé un objeto por cada metodo. 
		
	// PRUEBA PUEDE DISPARAR.
		
	/* Se comprueba que el soldado está vivo y con una bala puede disparar
	 * 
	 * En este caso compruebo introduciendo los parametros false (significa que no esta muerto) y numero de balas (le queda 1)
	 * para ver si estos datos esperados son iguales a los que se obtienen. 
	 */
		
	@Test 
	public void testPuedeDisparar() {
		
		Soldado soldado = new Soldado(); 
		
		soldado.setEstaMuerto(false);
		soldado.setNumeroBalas(1);
		
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = soldado.puedeDisparar();
		
		assertEquals(resultadoEsperado, resultadoObtenido);		
	}
	
	// Se comprueba que el soldado está vivo y como no tiene balas no puede disparar
	/*
	 * En este caso compruebo introduciendo los parametros false (significa que no esta muerto) y numero de balas (le quedan 0)
	 * para ver si estos datos esperados son iguales a los que se obtienen.
	 */
	
	@Test 
	public void testNoPuedeDisparar() {
		
		Soldado soldado = new Soldado(); 
		
		soldado.setEstaMuerto(false);
		soldado.setNumeroBalas(0);
		
		boolean resultadoEsperado = false;
		boolean resultadoObtenido = soldado.puedeDisparar();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	// Test que comprueba que si soldado tiene balas, soldado puede disparar a sol, y por lo tanto, sol muere, es decir,
	// sol.isEstaMuerto() es true.
	
	@Test 
	public void testSoldadoMuerto() {
		
		Soldado soldado = new Soldado();
		Soldado sol = new Soldado();
		
		soldado.setNumeroBalas(10);
		soldado.disparar(sol);
		
		boolean resultadoEsperado = soldado.puedeDisparar();
		boolean resultadoObtenido = sol.isEstaMuerto();
			
		assertEquals(resultadoEsperado, resultadoObtenido);	
	}
	
	// Test que comprueba que si el soldado no tiene balas, no puede disparar y por lo tanto, sol está vivo
	@Test 
	public void testSoldadoVivo() {
		
		Soldado soldado = new Soldado();
		Soldado sol = new Soldado();
		
		soldado.setNumeroBalas(0);
		//soldado.disparar(sol);  SOLDADO NO PUEDE disparar porque no tiene balas
		
		boolean resultadoEsperado = soldado.puedeDisparar(); //false Por lo tanto, soldado.puedeDisparar() retorna false NO PUEDE
		boolean resultadoObtenido = sol.isEstaMuerto(); //false Por lo tanto, sol no puede morir, isEstaMuerto es false, por lo que esta vivo
		
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	
}

