package Noelia;

// ACTIVIDAD 2 ENTORNOS DE DESARROLLO. DOCUMENTRAR Y HACER PRUEBAS UNITARIAS DE LAS CLASES SOLDADO Y JUGADOR APLICANDO LOS CONCEPTOS DE: JavaDoc y JUnit.

/**
 * 
 * Entidad que representa un Soldado que tiene un atributo privado de tipo booleano que devuelve true o false en funcion del estado
 * en el que se encuentra el soldao y un atributo de tipo integer que indica el número de balas que ha recibido el soldado.
 * 
 * @author Noelia
 * @version 1.0
 *
 */

public class Soldado {
	
	// ATRIBUTOS DE LA CLASE 
	
	/**
	 * Indica si el soldado está muerto o no 
	 * 
	 */

	private boolean estaMuerto;
	
	/** 
	 * El número de balas que tiene el soldado
	 */
	
    private int numeroBalas;
    
    
    // CONSTRUCTORES
	
    /**
     * Constructor sin parametros. Crea un nuevo objeto Soldado con los valores por defecto de los atributos.
     */
    
    public Soldado() {
		super();
	}
    
    /**
     * Constructor con parametros. Crea un nuevo objeto Soldado con los valores especificados para los atributos creados en la clase. 
     * 
     * @param estaMuerto representa el estado del soldado
     * @param numeroBalas representa el numero de balas que posee el soldado
     */

	public Soldado(boolean estaMuerto, int numeroBalas) {
		super();
		this.estaMuerto = estaMuerto;
		this.numeroBalas = numeroBalas;
	}
	
	
	/* METODOS GETTER AND SETTERS 
	 * En estos metodos no hace falta crear Javadoc. SON LOS METODOS ACCESORES MODIFICADORES DE CADA ATRIBUTO PRIVADO DE LA CLASE.
	 * En caso de cambiar la funcionalidad de alguno de ellos entonces si deberia de documentarse. 
	 */
	

	public boolean isEstaMuerto() {
		return estaMuerto;
	}


	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	}


	public int getNumeroBalas() {
		return numeroBalas;
	}


	public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	}
	
	
	// METODO TO STRING
	
	/**
	 * Devuelve una representación en cadena de caracteres del objeto Soldado.
     * 
     * @return una cadena que representa el objeto Soldado
	 */
	
	@Override
	public String toString() {
		return "Soldado [estaMuerto=" + estaMuerto + ", numeroBalas=" + numeroBalas + "]";
	}

     
     // METODOS PROPIOS 
	
	/**
	 * Este metodo se utiliza para comprobar si un soldado tiene balas disponibles para disparar. 
	 * Retorna un valor booleano que indica si el soldado puede disparar o no.
	 * Si el valor del atributo numeroBalas es mayor que cero, entonces el soldado tiene balas disponibles y puede disparar, 
	 * por lo que el método retorna true. En caso contrario, es decir, si el valor del atributo numeroBalas es cero, 
	 * el soldado no tiene balas disponibles y no puede disparar, por lo que el método retorna false.

     * @return true si el soldado tiene balas para disparar, false en caso contrario
     */
	 
	
	public boolean puedeDisparar() {
		
		if(this.numeroBalas > 0) {
			return true;
        }                          
		return false;

	}
	
	/**
	 * Soldado dispara al soldado (sol) pasado como parámetro y reduce en uno el número de balas del soldado que dispara.
	 * 
	 * @param sol es un objeto Soldado que representa al soldado que será atacado por el soldado que dispara.
	 */

	public void disparar(Soldado sol) {
		
		this.numeroBalas--;
		sol.estaMuerto = true;
		
	}
     
}
