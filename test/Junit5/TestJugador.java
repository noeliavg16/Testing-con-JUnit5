
package Junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Noelia.Jugador;
import Noelia.Soldado;

class TestJugador {

	/*
	 * En esta prueba si el numero del jugador es menor que 1, el metodo me cambia el valor de dorsal a -1 puesto 
	 * que no esta entre el rango válido que es de 1 a 30
	 */
	
	@Test
	public void testDorsalMenorDeUno() {
		
		Jugador jugador = new Jugador();
		
		jugador.ponerDorsal(0);
		
		int resultadoEsperado = -1; 
		int resultadoObtenido = jugador.getDorsal();
		
		assertEquals(resultadoEsperado, resultadoObtenido); 

	}
	
	/* En esta prueba si el numero del jugador esta entre el 1 y el 30 el metodo me cambia el valor de dorsal a 
	 * dicho numero.
	 * 
	 */

	@Test
	public void testDorsalDentroRangoValido() {
		
		Jugador jugador = new Jugador();
		
		jugador.ponerDorsal(16);
		
		int resultadoEsperado = 16; 
		int resultadoObtenido = jugador.getDorsal();
		
		assertEquals(resultadoEsperado, resultadoObtenido); 

	}
	
	/*
	 * En esta prueba si el numero del jugador es mayor que 30, el metodo me cambia el valor de dorsal a -1 puesto que no esta 
	 * entre el rango válido que es de 1 a 30
	 */
	
	@Test
	public void testDorsalMayorDeTreinta() {
		
		Jugador jugador = new Jugador();
		
		jugador.ponerDorsal(32);
		
		int resultadoEsperado = -1; 
		int resultadoObtenido = jugador.getDorsal();
		
		assertEquals(resultadoEsperado, resultadoObtenido); 

	}
	
	// Tes que comprueba si está expulsado con dos tarjetas amarillas 
	
	@Test
	public void estaExpulsadoTarjetaAmarilla() {
		
		Jugador jugador = new Jugador(); 
		
		jugador.setNumeroTarjetasAmarillas(2);
        boolean resultadoEsperado = true;
        boolean resultadoObtenido = jugador.estaExpulsado(); 
        
        assertEquals(resultadoEsperado, resultadoObtenido);
	
	
	}
	
	// Tes que comprueba si está expulsado con una tarjeta roja 
	
	@Test
	public void estaExpulsadoTarjetaRoja() {
		
		Jugador jugador = new Jugador(); 
		
		jugador.setNumeroTarjetasRojas(1);
        boolean resultadoEsperado = true;
        boolean resultadoObtenido = jugador.estaExpulsado(); 
        
        assertEquals(resultadoEsperado, resultadoObtenido);
	
	}
	
	// Tes que comprueba si está expulsado con una tarjeta amarilla, lo cual no estaria expulsado.  
	
	@Test
	public void noExpulsado() {
		
		Jugador jugador = new Jugador();
		
		jugador.setNumeroTarjetasAmarillas(1);
		boolean resultadoEsperado = false;
		boolean resultadoObtenido = jugador.estaExpulsado(); 
        
        assertEquals(resultadoEsperado, resultadoObtenido);
		
		
	}
	
	// Tes que comprueba si está expulsado con cero tarjetas amarillas y cero tarjetas rojas lo cual no estaria expulsado.  
	
	@Test
	public void noExpulsado1() {
		
		Jugador jugador = new Jugador();
		
		jugador.setNumeroTarjetasRojas(0);
		jugador.setNumeroTarjetasAmarillas(0);
		boolean resultadoEsperado = false;
		boolean resultadoObtenido = jugador.estaExpulsado(); 
        
        assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
}
