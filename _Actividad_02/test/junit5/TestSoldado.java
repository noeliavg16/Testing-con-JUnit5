package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import MariaIsabel.Jugador;
import MariaIsabel.Soldado;

class TestSoldado {
	
	/*
	 * Comenzamos probando el metodo puedeDisparar, para el que se analizaran 3 casos: si tiene balas, si tiene 0 balas 
	 * y si las balas son negativas. 
	 */
	@Test
	void testTieneBalas() {
		/*
		 * Creamos un objeto de la clase Soldado con new. Soldado de importa de la clase de mi rama.
		 * Comprobamos que con una bala el soldado puede disparar.
		 */
		Soldado soldado = new Soldado();
			soldado.setNumeroBalas(1);
			boolean resultadoEsperado = true;
			boolean resultadoObtenido = soldado.puedeDisparar();
			assertEquals(resultadoEsperado, resultadoObtenido);
		}
	
	@Test
	void testNoTieneBalas() {
		//El soldado ahora tiene 0 balas, por lo que no puede disparar.
		Soldado soldado = new Soldado();
			soldado.setNumeroBalas(0);
			boolean resultadoEsperado = false;
			boolean resultadoObtenido = soldado.puedeDisparar();
			assertEquals(resultadoEsperado, resultadoObtenido);
		}
	
	@Test
	void testBalasNegativas() {
		//Vamos a hacer un supuesto irreal con balas negativas, por lo que no podría disparar.
		Soldado soldado = new Soldado();
			soldado.setNumeroBalas(-10);
			boolean resultadoEsperado = false;
			boolean resultadoObtenido = soldado.puedeDisparar();
			assertEquals(resultadoEsperado, resultadoObtenido);
		}
	
	/*
	 * A continuacion se van a realizar las pruebas unitarias del metodo disparar.
	 * En concreto, 
	 */
	@Test
	void testQuedanDosBalas() {
		//Comprobamos que el soldado esta vivo porque tiene dos balas. 
		Soldado soldado = new Soldado();
		soldado.setNumeroBalas(2);
			soldado.disparar(soldado);
			int resultadoEsperado = 1;
			int resultadoObtenido = soldado.getNumeroBalas();
			assertEquals(resultadoEsperado, resultadoObtenido);
	}	
	
	@Test
	void testQuedaUnaBala() {
		//El soldado sigue vivo ya que le queda una bala.
		Soldado soldado = new Soldado();
		soldado.setNumeroBalas(1);
			soldado.disparar(soldado);
			int resultadoEsperado = 0;
			int resultadoObtenido = soldado.getNumeroBalas();
			assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testSinBalas() {
		//Finalmente, el soldado muere porque se ha quedado sin municion.
		Soldado soldado = new Soldado();
		soldado.setNumeroBalas(0);
			soldado.disparar(soldado);
			int resultadoEsperado = -1;
			int resultadoObtenido = soldado.getNumeroBalas();
			assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	
	}


