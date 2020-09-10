/**
 * Clase para los autos.
 */
public class Auto {
    /* La llanta del auto. */
    private LLanta llanta;
    /* El motor del auto. */
    private Motor motor;
    /* La carrocería del auto. */
    private Carroceria carroceria;
    /* El blindaje del auto. */
    private Blindaje blindaje;
    /* El arma del auto. */
    private Arma arma;
    /* El costo del auto. */
    private int costo;
	
    /**
     * Construye un auto con llantas, motor, carrocería, blindaje y arma. 
     * @param llanta la llanta del auto.
     * @param motor el motor del auto.
     * @param carroceria la carrocería del auto.
     * @param blindaje el blindaje del auto.
     * @param arma el arma del auto.
     */
    public Auto(LLanta llanta, Motor motor, Carroceria carroceria, 
	        Blindaje blindaje, Arma arma) {
        this.llanta = llanta;
	this.motor = motor;
	this.carroceria = carroceria;
	this.blindaje = blindaje;
	this.arma = arma;
    }
	
    /**
     * Regresa el costo total del auto.
     * @return el costo total del auto.
     */
    public int getCostoAuto() {
	this.osto = llanta.getCosto() + motor.getCosto() + carroceria.getCosto() + 
		    blindaje.getCosto() + arma.getCosto();
	return costo;
    }
	
    /* Muestra los componentes del auto. */
    public void muestraAuto() {
	System.out.println("\nEl auto fue construido con los siguientes " + 
			   "componentes: \n" + llanta.getTipo() + "\n" +
			   motor.getTipo() + "\n" + carroceria.getTipo() + "\n" +
			   blindaje.getTipo() + "\n" + arma.getTipo());

	System.out.println("\nPor lo que, tiene las siguientes características:\n" +
			   "Ataque: " + arma.getAtaque() + "\n" +
			   "Defensa: " + blindaje.getDefensa() + "\n" +
			   "Velocidad: " + motor.getVelocidad() + "km/h \n" +
			   "Costo: $" + getCostoAuto());
	}
}
