/**
 * Clase abstracta que nos permite tratar a todas las fábricas como iguales.
 */
public abstract class AbstractFactory {
	/**
	 * Regresa el componente a fabricar. 
	 * @param tipoComponente el tipo de componente a fabricar. 
	 */
	abstract Object getComponente(String tipoComponente);
}
