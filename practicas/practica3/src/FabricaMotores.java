/**
 * Clase para fabricar motores.
 */
public class FabricaMotores extends AbstractFactory {
    /**
     * Regresa el componente a fabricar.
     * @param tipoComponente el tipo de componente a fabricar.
     * @return el componente a fabricar.
     */
    @Override
    public Object getComponente(String tipoComponente) {
	return getMotor(tipoComponente);
    }

    /**
     * Regresa el motor a fabricar.
     * @param tipoMotor el tipo de motor a fabricar.
     * @return el motor a fabricar. 
     */
    public Motor getMotor(String tipoMotor) {
        if(tipoMotor == null)
	    return null;
	else if(tipoMotor.equalsIgnoreCase("deportivo"))
	    return new MotorDeportivo();
	else if(tipoMotor.equalsIgnoreCase("diesel"))
	    return new MotorDiesel();
	else if(tipoMotor.equalsIgnoreCase("turbo"))
	    return new MotorTurbo();
	
	return null;
    }	
}
