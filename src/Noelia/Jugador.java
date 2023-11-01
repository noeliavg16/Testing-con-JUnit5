package Noelia;


/**
 * La clase Jugador representa un jugador de un equipo de fútbol con sus propiedades y comportamientos. Contiene tres atributos: dorsal y 
 * y su historial de número de tarjetas amarillas y rojas que son acumuladas.
 * 
 * 
 * @author Noelia
 * @version 2.0
 *
 */


public class Jugador {
	
	// ATRIBUTOS 
	
	
	/** Variable de tipo integer, es el número del dorsal del jugador */
	private int dorsal;
	
	/** Variable de tipo integer, s el número de tarjetas amarillas acumuladas del jugador */
    private int numeroTarjetasAmarillas;
    
    /** Variable de tipo integer,es el número de tarjetas rojas acumuladas del jugador */
    private int numeroTarjetasRojas;
	
    // CONSTRUCTORES 
     
    /**
     * Constructor sin parametros. Crea un jugador con valores predeterminados para sus atributos.
     */
    public Jugador() {
		super();
	}
    
    /**
     * Constructor con parametros. Crea un jugador con los atributos indicados.
     * 
     * @param dorsal hace referencia al número del dorsal del jugador.
     * @param numeroTarjetasAmarillas hace referencia número de tarjetas amarillas acumuladas del jugador.
     * @param numeroTarjetasRojas hace referencia número de tarjetas rojas acumuladas del jugador.
     */

    
	public Jugador(int dorsal, int numeroTarjetasAmarillas, int numeroTarjetasRojas) {
		super();
		this.dorsal = dorsal;
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}

		// METODOS GETTERS AND SETTERS 
	
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public int getNumeroTarjetasAmarillas() {
		return numeroTarjetasAmarillas;
	}
	public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
	}
	public int getNumeroTarjetasRojas() {
		return numeroTarjetasRojas;
	}
	public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}

	// METODO TO STRING 
	@Override
	public String toString() {
		return "Jugador [dorsal=" + dorsal + ", numeroTarjetasAmarillas=" + numeroTarjetasAmarillas
				+ ", numeroTarjetasRojas=" + numeroTarjetasRojas + "]";
	}
    
    
    // METODOS PROPIOS 
	
	/**
	 * Metodo que asigna un nuevo numero de dorsal al jugador si está en el rango válido, de lo contrario establece el valor de dorsal a -1.
	 * 
	 * Este método recibe un número entero que representa el dorsal del jugador y lo asigna al atributo correspondiente (dorsal) si 
	 * este valor está entre 1 y 30, en caso contrario asigna un valor de -1
	 * @param dorsal representa el número de dorsal a asignar. Debe estar en el rango de 1 a 30.
	 * 
	 * La primera línea del método verifica si el valor del parámetro "dorsal" está entre 1 y 30 (inclusive) utilizando una 
	 * estructura condicional "if". Si el valor de "dorsal" está dentro de este rango, entonces el valor del atributo "dorsal" 
	 * del objeto actual se establecerá en el valor del parámetro "dorsal". Si el valor del parámetro "dorsal" está fuera de este rango,
	 *  la segunda línea establecerá el valor del atributo "dorsal" en -1.
	 */
	
	 public void ponerDorsal(int dorsal) {
		 
		 if(dorsal >= 1 && dorsal <= 30) {
			 this.dorsal = dorsal;
			 
         }else {
        	 this.dorsal = -1;
         }

	 }
	 /**
	  * Metodo que comprueba si un jugador está expulsado. Devuelve true si el jugador está expulsado y false en caso contrario
	  * @return true si el jugador está expulsado (tiene dos tarjetas amarillas o una tarjeta roja),
	  */



	 public boolean estaExpulsado() {

         boolean expulsado = false;
         if(numeroTarjetasAmarillas == 2) {
        	 expulsado = true;
         }                          
         if(numeroTarjetasRojas == 1) {
        	 expulsado = true;
         }
         return expulsado;

	 }            
    

}

	
