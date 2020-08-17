/**
 * Clase para los motores turbo.
 */
public class MotorTurbo implements Motor {
	/* El tipo de motor. */
	private String tipo;
	/* El costo del motor. */
	private int costo;
	/* La velocidad del motor. */
	private int velocidad;

	/* Crea un motor con tipo, costo y velocidad. */
	@Override
	public void crearMotor() {
		this.tipo = "Motor Turbo";
		this.costo = 120125;
		this.velocidad = 275;
	}

	/**
	 * Regresa el tipo de motor. 
	 * @return el tipo de motor.
	 */
	@Override
	public String getTipo() {
		return tipo;
	}

	/**
	 * Regresa el costo del motor. 
	 * @return el costo del motor.
	 */
	@Override
	public int getCosto() {
		return costo;
	}

	/**
	 * Regresa la velocidad del motor.
	 * @return la velocidad del motor.
	 */
	@Override
	public int getVelocidad() {
		return velocidad;
	}
}
