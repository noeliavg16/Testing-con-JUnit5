package Gerard;

/**
 * Creamos una clase Jugador donde tenemos 3 variables privadas y 2 metodos
 * uno que nos dara el dorsal del jugador y otro metodo que dependiendo de las
 * tarjetas que tenga nos dira si esta explusado o no
 * 
 * @author Gerard_Perujo
 *
 */
public class Jugador {
	
	/**
	 * variables privadas de la clase
	 */
	private int dorsal;
	private int numeroTarjetasAmarillas;
	private int numeroTarjetasRojas;
	
	
	/**
	 * Constructor vacio
	 */
	public Jugador() {
		super();
	}

	/**
	 * Constructor con todas las variables de la Clase
	 * 
	 * @param dorsal variable int de dorsal que hace referencia al numero del dorsal  del jugador
	 * @param numeroTarjetasAmarillas variable de la cantidad de tarjetas amarillas que tiene
	 * @param numeroTarjetasRojas variable de la cantidad de las tarjertas rojas que tiene
	 */
	public Jugador(int dorsal, int numeroTarjetasAmarillas, int numeroTarjetasRojas) {
		super();
		this.dorsal = dorsal;
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}
	
	/**
	 * Creamos los getters and setters de la clase
	 */
	
	public int getDorsal() {
		return dorsal;
	}
	
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	
	public int getNumeroTarjetasAmarillas(){
		return numeroTarjetasAmarillas;
		}
	public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
	}
	public int getNumeroTargetasRojas() {
		return numeroTarjetasRojas;
	}
	public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}
	
	
	/**
	 * Creamos el metodo toString() donde nos devuelve todos los valores de cada
	 * una de las variables de la clase Soldado
	 */
	@Override
	public String toString() {
		return " Jugador [dorsal = " + dorsal + "numeroTarjetasAmarillas = " +
				numeroTarjetasAmarillas + "numeroTarjetasRojas = " + numeroTarjetasRojas + "]";
	}
	
	/**
	 * Creamos el metodo ponerDorsal 
	 * 
	 * @param dorsal entra un numero entero
	 * 
	 * @return si el numero del dorsal esta entre 1 y 30 nos pondra el numero
	 * del dorsal, sino el numero del dorsal sera -1
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
	 * Creamos el metodo estaExpulsado donde dependiendo del numero de tarjetas
	 * sera true o false
	 * @return nos devuelve true o false dependiendo del numero de tarjetas que entra
	 * si hay 2 amarillas devuelve true, si hay una roja devuelve true,
	 * sino explusado sera false
	 */
	public boolean estaExpulsado() {
		
		boolean explusado = false;
		
		if (numeroTarjetasAmarillas == 2) {
			explusado = true;
		}
		if (numeroTarjetasRojas == 1) {
			explusado = true;
		}
		return explusado;
	}
	
}
