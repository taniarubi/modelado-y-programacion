/**
 * Interfaz para los motores. 
 */
public interface Motor {
    /* Crea un motor con tipo, costo y velocidad. */
    public void crearMotor();
	
    /**
     * Regresa el tipo de motor. 
     * @return el tipo de motor.
     */
    public String getTipo();

    /**
     * Regresa el costo del motor. 
     * @return el costo del motor.
     */
    public int getCosto();

    /**
     * Regresa la velocidad del motor.
     * @return la velocidad del motor.
     */
    public int getVelocidad();
}
