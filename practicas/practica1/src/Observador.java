/**
 * Interfaz para el observador. 
 */
public interface Observador {
    /**
     * Envía el mensaje del usuario a los demás usuarios cuando se le notifica.
     * @param usuario el usuario que envía el mensaje.
     */
    public void actualizar(Usuario usuario);
}