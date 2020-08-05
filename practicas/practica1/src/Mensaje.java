/**
 * Interfaz para el envío de Mensajes. 
 */
public interface Mensaje {
    /**
     * Envía un mensaje al usuario para notificarle que un usuario nuevo a 
     * ingresado al chat. 
     * @param usuario el usuario al que le vamos a notificar.
     * @param nuevo el usuario que ha ingresado al chat.
     */
    public void usuarioAgregado(Usuario usuario, Usuario nuevo);

    /**
     * Envía al usuario receptor el mensaje que escribió el ususario transmisor.
     * @param receptor el usuario que va a recibir el mensaje.
     * @param transmisor el usuario que escribió el mensaje. 
     */
    public void nuevoMensaje(Usuario receptor, Usuario transmisor);

    /**
     * Envía un mensaje al usuario para notificarle que un usuario ha salido
     * del chat. 
     * @param usuario el usuario al que le vamos a notificar.
     * @param fuera el usuario que ha salido del chat.
     */
    public void usuarioSalio(Usuario usuario, Usuario fuera);
}
