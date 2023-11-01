package Junit.Gerard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Gerard.Jugador;

class TestJugador {
	/*
	 * creamos una variable de la clase jugador
	 */
	private Jugador player1;
	

	/*
	 * creamos un beforeEach para que al empezar cada test cree un nuevo objeto
	 * de esta forma evitamos que queden datos de prueba anteriores
	 */
	
	@BeforeEach
	public void crearObjeto() {
		player1 = new Jugador();
	}
	
	/*
	 * despues de cada prueba ponemos el objeto a nulo para quitar todos los valores que tenga
	 */
	
	@AfterEach
	public void eliminarObjeto() {
		player1 = null;
	}

	/*
	 * en el metodo PonerDorsal haremos 3 pruebas
	 * 
	 * una con el numero de dorsal entre 1 y 30 por lo tanto nos tendra que devolver el numero que
	 * le hemos dado
	 * otra con un numero mayor a 30 por lo tanto nos tendra que dar de resultado -1
	 * y otra con un numero menor a 1 por lo tanto nos tendra que dar resultado -1
	 */
	
	
	/*
	 * TestponerDorsal aqui le vamos a dar un numero entre 1 a 30 por lo tanto el resultado obtenido
	 * sera el numero que le hemos dado a dorsal
	 */
	
	
	@Test
	public void testPonerDosal() {
		
		player1.ponerDorsal(6);
		
		int resultadoEsperado = 6;
		int resultadoObtenido = player1.getDorsal();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	/*
	 * en PonerDosalMayor le daremos un numero superior a 30 en este caso como el numero de dorsal sera
	 * superior a 30 el resultado obtenido tendra que ser -1
	 */
	
	@Test
	public void testPonerDosalMayor() {
		
		player1.ponerDorsal(32);
		
		int resultadoEsperado = -1;
		int resultadoObtenido = player1.getDorsal();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	/*
	 * en PonerDosalMenor le daremos un numero menor a 1 en este caso como el numero de dorsal sera
	 * menor de 1 el resultado obtenido tendra que ser -1
	 */
	
	@Test
	public void testPonerDosalMenor() {
		
		player1.ponerDorsal(0);
		
		int resultadoEsperado = -1;
		int resultadoObtenido = player1.getDorsal();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	
	
	/*
	 * en el TestExpulsado haremos 3 pruebas
	 * 
	 * una con 1 sola tarjeta amarilla que nos tendra que dar falso ya que con una sola tarjeta amarilla 
	 * el jugador no esta expulsado
	 * otra con 2 tarjetas amarillas en esta si que nos tendra que salir true ya que con 2 tarjetas amarillas
	 * el juegador sera expulsado
	 * y una ultima con 1 tarjeta roja en este caso tambien tendra que salir true
	 */
	
	
	/*
	 * TestUnaTarjetaAmarilla que le vamos a dar el valor que tiene una sola tarjeta amarilla por lo tanto el
	 * resultado obtenido tendra que ser false ya sera explusado si tiene 2 targetas amarillas
	 */
	
	@Test
	public void testTarjetaUnaAmarilla() {
		
		player1.setNumeroTarjetasAmarillas(1);
		
		boolean resultadoEsperado = false;
		boolean resultadoObtenido = player1.estaExpulsado();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

	/*
	 * testDosTarjetasAmarillas le vamos a dar el valor de 2 tarjetas amarillas
	 *  por lo tanto el resultado obtenido tendra que ser true ya que con 2 
	 *  tarjetas amarillas eres expulsado
	 */
	
	@Test
	public void testTarjetaDosAmarilla() {
		
		player1.setNumeroTarjetasAmarillas(2);
		
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = player1.estaExpulsado();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	/*
	 * testUnaTarjetaRoja le vamos a dar el valor de 1 tarjetas roja por lo 
	 * tanto el resultado obtenido tendra que ser true ya que con 1 tarjetas 
	 * roja eres expulsado
	 */
	
	@Test
	public void testTarjetaUnaRoja() {
		
		player1.setNumeroTarjetasRojas(1);;
		
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = player1.estaExpulsado();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
}
