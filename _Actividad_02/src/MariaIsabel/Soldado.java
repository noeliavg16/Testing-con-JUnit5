package MariaIsabel;

/**
 * Esta clase pretende mostrar las condiciones de un soldado en el momento de disparar.
 * 
 * @author MariaIsabel
 */
public class Soldado {
	// Añadimos los atributos privados de la clase
	
	/**
	 * El atributo estaMuerto es un boolean que devuelve true si esta muerto y false si esta vivo.
	 */
    private boolean estaMuerto;
    /**
     * numeroBalas es un numero entero de las balas de las que dispone el soldado.
     */
    private int numeroBalas;
    
    
    
    
    
    
    //Se generan los 2 constructores
    
    /**
     * Se crean los constructores de clase. Uno que incluye todos los atributos y otro vacio. 
     * De esta manera, se inicializan los objetos de la clase.
     * @param estaMuerto
     * @param numeroBalas
     */
    public Soldado(boolean estaMuerto, int numeroBalas) {
		super();
		this.estaMuerto = estaMuerto;
		this.numeroBalas = numeroBalas;
	}

	public Soldado() {
		super();
	}
	
	
	//Se añaden los getter and setter para poder realizar las pruebas unitarias.
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
	
	

	//Se redefine el metodo de Object
	   @Override
		public String toString() {
			return "Soldado [estaMuerto=" + estaMuerto + ", numeroBalas=" + numeroBalas + "]";
		}

	   
	   
	   
	 // Se crean los metodos propios de la clase
	    
	/**
     * Este metodo pretende mostrar si el soldado puede disparar en funcion del numero de balas que porte. 
     * 
     * @return boolean. Si el numero de balas es mayor que 0 entonces puede ejecutar el disparo, siendo el resultado true.
     * Si el numero de balas no es mayor que 0 no puede disparar y devuelve false.
     */
    public boolean puedeDisparar() {
    	if(this.numeroBalas > 0) {
    		return true;
    		}                          
    	return false;
    }
    
    /**
     * Mediante este metodo se pretende descubrir si el soldado ha sido alcanzado por alguna bala y, por tanto, si esta muerto o no.
     * Ademas, se decrementa el numero de balas con cada disparo.
     * @param sol. Al metodo disparar se le pasa un parametro sol de tipo Soldado con las caracteristicas de ese soldado.
     */
	public void disparar(Soldado sol) {
    	this.numeroBalas--;
    	sol.estaMuerto = true;
    }
}


