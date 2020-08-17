/**
 * Clase para fabricar llantas. 
 */
public class FabricaLLantas extends AbstractFactory {
	
	/**
	 * Regresa el tipo de componente.
	 * @param tipoComponente el tipo de componente que 
	 * @return el tipo de componente.
	 */
	@Override
	public Object getComponente(String tipoComponente) {
		return getLLanta(tipoComponente);
	}

	/**
	 * Regresa el tipo de llanta. 
	 * @param tipoLLanta
	 * @return el tipo de llanta
	 */
	public LLanta getLLanta(String tipoLLanta) {
		if(tipoLLanta == null)
			return null;
		else if(tipoLLanta.equalsIgnoreCase("simple"))
			return new LLantaSimple();
		else if(tipoLLanta.equalsIgnoreCase("deportiva"))
			return new LLantaDeportiva();
		else if(tipoLLanta.equalsIgnoreCase("offroad"))
			return new LLantaOffroad();
		else if(tipoLLanta.equalsIgnoreCase("oruga"))
			return new LLantaOruga();
		return null;
	}	
}
