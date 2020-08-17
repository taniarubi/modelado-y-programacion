/**
 * Clase para fabricar carrocerías. 
 */
public class FabricaCarrocerias extends AbstractFactory {
	
	/**
	 * Regresa el componente a fabricar.
	 * @param tipoComponente el tipo de componente a fabricar.
	 * @return el componente a fabricar.
	 */
	@Override
	public Object getComponente(String tipoComponente) {
		return getCarroceria(tipoComponente);
	}

	/**
	 * Regresa la carrocería a fabricar.
	 * @param tipoCarroceria el tipo de carrocería a fabricar.
	 * @return la carrocería a fabricar.
	 */
	public Carroceria getCarroceria(String tipoCarroceria) {
		if(tipoCarroceria == null)
			return null;
		else if(tipoCarroceria.equalsIgnoreCase("casual"))
			return new CarroceriaCasual();
		else if(tipoCarroceria.equalsIgnoreCase("camion"))
			return new CarroceriaDeCamion();
		else if(tipoCarroceria.equalsIgnoreCase("deportiva"))
			return new CarroceriaDeportiva();

		return null;
	}	
}
