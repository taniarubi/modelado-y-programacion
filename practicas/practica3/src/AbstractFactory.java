/**
 * Clase abstracta para Abstract Factory.
 */
public abstract class AbstractFactory {
	/**
	 * Regresa el componente 
	 * @param tipoComponente el componente 
	 */
	abstract Object getComponente(String tipoComponente);
}
