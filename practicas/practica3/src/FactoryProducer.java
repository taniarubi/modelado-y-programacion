/**
 * Clase para fabricar fábricas.
 */
public class FactoryProducer {
	
	/**
	 * Regresa la fábrica a fabricar.
	 * @param opcion la opción a fabricar. 
	 * @return la fábrica a fabricar.
	 */
	public static AbstractFactory getFactory(String opcion) {
		if(opcion.equalsIgnoreCase("llanta")) 
			return new FabricaLLantas();
		else if(opcion.equalsIgnoreCase("motor"))
			return new FabricaMotores();
		else if(opcion.equalsIgnoreCase("carroceria"))
			return new FabricaCarrocerias();
		else if(opcion.equalsIgnoreCase("blindaje"))
			return new FabricaBlindaje();
		else if(opcion.equalsIgnoreCase("arma"))
			return new FabricaArmas();
		
		return null;
	}
}
