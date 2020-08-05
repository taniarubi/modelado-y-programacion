/**
 * Interfaz para el sujeto. 
 */
public interface Sujeto {
    /**
     * Registra un usuario en el sistema de chat. 
     * @param usuario el usuario que vamos a registrar en el chat. 
     */
    public void registrar(Usuario usuario);

    /**
     * Remueve a un usuario del sistema de chat. 
     * @param usuario el usuario que vamos a remover del chat. 
     */
    public void remover(Usuario usuario);

    /**
     * Notifica a todos los usuarios las actualizaciones de mensajes del usuario.
     * @param usuario el usuario sobre el cual vamos a notificar a los demás usuarios. 
     */
    public void notificar(Usuario usuario);
}