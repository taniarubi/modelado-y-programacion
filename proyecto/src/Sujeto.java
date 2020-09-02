/**
 * Interfaz para el sujeto.
 */
public interface Sujeto {
    /**
     * Registra un usuario en el sistema de juego.
     * @param usuario el usuario que vamos a registrar en el juego.
     */
    public void registrar(Usuario usuario);

    /**
     * Elimina a un usuario del sistema de juego,
     * @param usuario el usuario que vamos a eliminar del juego.
     */
    public void eliminar(Usuario usuario);

    /**
     * Notifica a todos los usuarios las notificaciones del juego.
     * @param usuario el usuario sobre el cual vamos a notificar a los demás usuarios.
     */
}
