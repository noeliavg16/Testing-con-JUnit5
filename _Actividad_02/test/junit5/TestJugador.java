package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import MariaIsabel.Jugador;

class TestJugador {

	/*
	 * Se van a realizar 5 test para comprobar que el metodo ponerDorsal funciona correctamente
	 */
	
	@Test
	void testConDorsalUno() {
		//Se crea un objeto de la clase Jugador y lo importo de mi rama.
		Jugador jugador = new Jugador();
		
		//A continuacion se le añade el dorsal 1 invocando al metodo de la clase.
		jugador.ponerDorsal(1);
		
		/*
		 * Ahora se especifica cual es el resultado esperado y cual es el realmente obtenido.
		 * Lo comprobamos con assertEquals
		 */
		int resultadoEsperado = 1;
		int resultadoObtenido = jugador.getDorsal();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testConDorsalTreinta() {
		//Ahora se va a probar con el otro valor extremo aceptado, que es el 30.
		Jugador jugador = new Jugador();
			jugador.ponerDorsal(30);
			int resultadoEsperado = 30;
			int resultadoObtenido = jugador.getDorsal();
			assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	@Test
	void testConDorsalMedio() {
		//A continuacion, se va a probar el metodo con un dorsal intermedio, en concreto el 10.
		Jugador jugador = new Jugador();
			jugador.ponerDorsal(10);
			int resultadoEsperado = 10;
			int resultadoObtenido = jugador.getDorsal();
			assertEquals(resultadoEsperado, resultadoObtenido);
	}	

	@Test
	void testConDorsalCero() {
		//En este momento se va a añadir un dorsal que no esta dentro del rango, por lo que el resultado esperado es -1.
		Jugador jugador = new Jugador();
			jugador.ponerDorsal(0);
			int resultadoEsperado = -1;
			int resultadoObtenido = jugador.getDorsal();
			assertEquals(resultadoEsperado, resultadoObtenido);
	}	
	
	@Test
	void testConDorsalTreintaYUno() {
		//Finalmente, comprobamos que añadiendo un dorsal por encima del rango el resultado esperado tambien es -1.
		Jugador jugador = new Jugador();
			jugador.ponerDorsal(31);
			int resultadoEsperado = -1;
			int resultadoObtenido = jugador.getDorsal();
			assertEquals(resultadoEsperado, resultadoObtenido);
	}	
	
	/*
	 * Ahora se van a realizar 5 pruebas para demostrar que el metodo estaExpulsado funciona adecuadamente.
	 */
	@Test
	void testSinTarjetasAmarillas() {
		//Comprobamos que el jugador no es expulsado al no haber recibido ninguna tarjeta amarilla.
		Jugador jugador = new Jugador();
			jugador.setNumeroTarjetasAmarillas(0);
			boolean resultadoEsperado = false;
			boolean resultadoObtenido = jugador.estaExpulsado();
			assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testSinTarjetasRojas() {
		//Ahora comprobamos que el jugador no es expulsado por roja directa.
		Jugador jugador = new Jugador();
			jugador.setNumeroTarjetasRojas(0);
			boolean resultadoEsperado = false;
			boolean resultadoObtenido = jugador.estaExpulsado();
			assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testUnaTarjetaAmarilla() {
		//Comprobamos que el jugador no es expulsado ya que solo ha sido apercibido con una tarjeta amarilla.
		Jugador jugador = new Jugador();
			jugador.setNumeroTarjetasAmarillas(1);
			boolean resultadoEsperado = false;
			boolean resultadoObtenido = jugador.estaExpulsado();
			assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testDobleAmarilla() {
		//Esta vez el jugador es expulsado por acumulacion de tarjetas amarillas.
		Jugador jugador = new Jugador();
			jugador.setNumeroTarjetasAmarillas(2);
			boolean resultadoEsperado = true;
			boolean resultadoObtenido = jugador.estaExpulsado();
			assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testRojaDirecta() {
		//Finalmente, el jugador es expulsado tras recibir una tarjeta roja.
		Jugador jugador = new Jugador();
			jugador.setNumeroTarjetasRojas(1);
			boolean resultadoEsperado = true;
			boolean resultadoObtenido = jugador.estaExpulsado();
			assertEquals(resultadoEsperado, resultadoObtenido);
	}

}
