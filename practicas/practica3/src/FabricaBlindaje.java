/**
 * Clase para fabricar blindaje. 
 */
public class FabricaBlindaje extends AbstractFactory {
    /**
     * Regresa el componente a fabricar.
     * @param tipoComponente el tipo de componente a fabricar.
     * @return el componente a fabricar.
     */
    @Override
    public Object getComponente(String tipoComponente) {
	return getBlindaje(tipoComponente);
    }

    /**
     * Regresa el blindaje a fabricar.
     * @param tipoBlindaje el tipo de blindaje a fabricar.
     * @return el blindaje a fabricar. 
     */
    public Blindaje getBlindaje(String tipoBlindaje) {
        if(tipoBlindaje == null)
	    return null;
	else if(tipoBlindaje.equalsIgnoreCase("simple"))
	    return new BlindajeSimple();
	else if(tipoBlindaje.equalsIgnoreCase("reforzado"))
	    return new BlindajeReforzado();
	else if(tipoBlindaje.equalsIgnoreCase("tanque"))
	    return new BlindajeDeTanque();
	    
	return null;
    }	
}
