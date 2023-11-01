package Gerard;

/**
 * Creamos una Clase de Soldado donde tenemos 2 variable una estaMuerto y
 * la otra el numeroBalas
 * En ella hay 2 metodos para ver si el Soldado esta muerto o puede disparar
 * dependiendo del numero de balas que tenga
 * 
 * @author Gerard_Perujo
 *
 */
public class Soldado {

	private boolean estaMuerto;
	private int numeroBalas;
	
	public Soldado() {
		super();
	}
	/**
	 * Creamos un constructor de la clase Soldado con todas las variables
	 * 
	 * @param estaMuerto es una variable boolean que nos dara el valor de true o false
	 * @param numeroBalas es una variable int que nos dara el numero de balas que hay
	 */
	public Soldado(boolean estaMuerto, int numeroBalas) {
		super();
		this.estaMuerto = estaMuerto;
		this.numeroBalas = numeroBalas;
	}
	
	/**
	 * Creamos los getters and setter de la clase Soldado
	 */
	
	 
	public boolean getEstaMuerto() {
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

	/**
	 * Creamos el metodo toString() donde nos devuelve todos los valores de cada
	 * una de las variables de la clase Soldado
	 */
	@Override
	public String toString() {
		return "Soldado [estaMuerto=" + estaMuerto + ", numeroBalas=" + numeroBalas + "]";
	}
	
	/**
	 * Creamos un metodo publico donde decimos si el soldado puede o no disparar
	 * dependiendo del numnero de balas que tiene
	 * 
	 * @return si el numero de balas es mayor a 0 devuelve verdad y si el numero 
	 * es 0 devuelve false ya que el soldado no podra disparar
	 */

	public boolean puedeDisparar() {
		if(this.numeroBalas > 0) {
			return true;
		}
		else
			return false;
	}
	
	
	/**
	 * Creamos el metodo disparar donde entra un objeto Soldado para ver si el
	 * soldado esta muerto o vivo
	 * 
	 * @param sol tendra los datos del objeto Soldado que entra
	 * 
	 * @return dependiendo del numero de balas sol esta muerto o no
	 */
	public void disparar(Soldado sol) {
		this.numeroBalas --;
		sol.estaMuerto = true;
	}

	
	
}
