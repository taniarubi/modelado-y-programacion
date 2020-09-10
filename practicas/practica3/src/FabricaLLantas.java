/**
 * Clase para fabricar llantas. 
 */
public class FabricaLLantas extends AbstractFactory {
    /**
     * Regresa el componente a fabricar.
     * @param tipoComponente el tipo de componente a fabricar. 
     * @return el tipo de componente a fabricar.
     */
    @Override
    public Object getComponente(String tipoComponente) {
	return getLLanta(tipoComponente);
    }

    /**
     * Regresa la llanta a fabricar. 
     * @param tipoLLanta el tipo de llanta a fabricar.
     * @return la llanta a fabricar.
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
