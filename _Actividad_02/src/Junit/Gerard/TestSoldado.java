package Junit.Gerard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Gerard.Soldado;

class TestSoldado {
	/*
	 * creamos una variable del objeto soldado
	 */
	private Soldado soldado1;
	
	
	/*
	 * creamos un beforeEach para que al empezar cada test cree un nuevo objeto
	 * de esta forma evitamos que queden datos de prueba anteriores
	 */
	
	@BeforeEach
	public void crearObjeto() {
		
		soldado1 = new Soldado();
	}
	
	/*
	 * despues de cada prueba ponemos el objeto a nulo para quitar todos los valores que tenga
	 */
	
	
	@AfterEach
	public void eliminarObjeto() {
		soldado1 = null;
	}

	
	/*
	 * Para probar el metodo puedeDispararBalas haremos 2 pruebas
	 * una con balas
	 * otra sin balas
	 * 
	 */
	
	
	/*
	 * en el testPuedeDispararBalas aqui le daremos un numero de balas ques sea superior a 0,
	 * al ser un numero superior a 0 nos tendra que dar true
	 */
	
	@Test
	public void testPuedeDispararBalas() {
		
		soldado1.setNumeroBalas(2);
		
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = soldado1.puedeDisparar();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	
	/*
	 * En el metodo noPuedeDispararBalas le daremos el valor 0 en este caso el resultado tendra que ser false
	 * ya que el numero de balas es igual o inferior a 0
	 */
	
	
	@Test
	public void testNoPuedeDispararBalas() {
		
		soldado1.setNumeroBalas(0);
		
		boolean resultadoEsperado = false;
		boolean resultadoObtenido = soldado1.puedeDisparar();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	
	/*
	 * en el metodo disparar vamos hacer 2 pruebas:
	 * 
	 * una en la que tendra balas por lo tanto podra disparar y estara vivio
	 * y otra en la que no tendra balas por lo tanto no podra disparar y estara muerto
	 */
	
	
	/*
	 * en el TestEstaVivo le pasamos un numero de balas por lo tanto el resultado tendra que ser
	 * true ya que soldado podra disparar y estara vivo
	 */
	
	@Test
	public void testEstaVivo() {
		
		soldado1.setNumeroBalas(2);
		soldado1.disparar(soldado1);
		
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = soldado1.getEstaMuerto();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	/*
	 * en el testEstaMuerto aqui le pasaremos un numero de balas negativo el resultado sera false
	 * porque no podra disparar por lo tanto estara muerto
	 */
	
	@Test
	public void testEstaMuerto() {
		
		soldado1.setNumeroBalas(-1);

		
		boolean resultadoEsperado = false;
		boolean resultadoObtenido = soldado1.getEstaMuerto();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		
	}

}
