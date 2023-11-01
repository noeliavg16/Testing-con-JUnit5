package MariaIsabel;

/**
 * Esta clase pretende mostrar la situacion de un jugador, tanto por su dorsal como si se encuentra expulsado.
 * @author MariaIsabel
 *
 */
public class Jugador {
	// Se crean los atributos privados de la clase
	
	
	/**
	 * dorsal es un numero entero que representa el numero de dorsal adjudicado al jugador.
	 */
    private int dorsal;
    /**
     * numeroTarjetasAmarillas es un numero entero que representa la cantidad de tarjetas amarillas que ha recibido el jugador.
     */
    private int numeroTarjetasAmarillas;
    /**
     * numeroTarjetasRojas tambien es un numero entero que muestra el numero de tarjetas rojas que han enseñado al jugador.
     */
    private int numeroTarjetasRojas;
    
    
    
    
    
    
    
    //Generamos los dos constructores
    
    /**
     * Se crean los constructores de clase. Uno que incluye todos los atributos y otro vacio. 
     * De esta manera, se inicializan los objetos de la clase previamente documentados.
     * @param dorsal
     * @param numeroTarjetasAmarillas
     * @param numeroTarjetasRojas
     */
   
    public Jugador(int dorsal, int numeroTarjetasAmarillas, int numeroTarjetasRojas) {
		super();
		this.dorsal = dorsal;
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}

	public Jugador() {
		super();
	}
	
	//Incluimos getters and setters para las pruebas unitarias
	
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
	
	
	
		 //Se redefine el metodo de Object

	

	@Override
	public String toString() {
		return "Jugador [dorsal=" + dorsal + ", numeroTarjetasAmarillas=" + numeroTarjetasAmarillas
				+ ", numeroTarjetasRojas=" + numeroTarjetasRojas + "]";
	}
	
	
	
	
	
	// Se crean los metodos propios de la clase
	
	/**
	 * Con este metodo se pretende incorporar un numero de dorsal a un jugador. 
	 * Para ello, dicho dorsal debe ser igual o mayor a 1, asi como igual o menor a 30.
	 * En caso contrario no se le adjudica ningun dorsal.
	 * 
	 * @param dorsal. Numero entero que simboliza el numero de dorsal que lleva el jugador.
	 */
	public void ponerDorsal(int dorsal) {
    	if(dorsal >= 1 && dorsal <= 30) {
    		this.dorsal = dorsal;
        }
    	else {
            this.dorsal = -1;
    	}
    }
	
	/**
	 * Con el metodo estaExpulsado se va a mostrar si el jugador ya no puede continuar jugando por acumulacion de
	 * tarjetas de distintos colores.
	 * 
	 * @return Si no ha recibido ninguna tarjeta o si solo ha sido apercibido con una tajeta amarilla, 
	 * el jugador no ha sido expulsado y, por tanto, el metodo devuelve false.
	 * Si el jugador recibe 2 tarjetas amarillas o una roja, el jugador es expulsado y, por tanto, devuelve true.
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

