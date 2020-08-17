/**
 * Clase para fabricar armas. 
 */
public class FabricaArmas extends AbstractFactory {

	/**
	 * Regresa el componente a fabricar.
	 * @param tipoComponente el tipo de componente a fabricar.
	 * @return el componente a fabricar.
	 */
	@Override
	public Object getComponente(String tipoComponente) {
		return getArma(tipoComponente);
	}

	/**
	 * Regresa el arma a fabricar.
	 * @param tipoArma el tipo de arma a fabricar.
	 * @return el arma a fabricar.
	 */
	public Arma getArma(String tipoArma) {
		if(tipoArma == null)
			return null;
		else if(tipoArma.equalsIgnoreCase("arpones"))
			return new ArmaArpon();
		else if(tipoArma.equalsIgnoreCase("lanza llamas"))
			return new ArmaLanzaLlamas();
		else if(tipoArma.equalsIgnoreCase("cañones"))
			return new ArmaCanones();
		else if(tipoArma.equalsIgnoreCase("sierra"))
			return new ArmaSierra();
		else if(tipoArma.equalsIgnoreCase("metralleta"))
			return new ArmaMetralleta();
		
		return null;
	}

}
