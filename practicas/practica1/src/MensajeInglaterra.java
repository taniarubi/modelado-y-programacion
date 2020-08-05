/**
 * Clase para el envío de mensajes de usuarios que son de Inglaterra.
 */
public class MensajeInglaterra implements Mensaje {
    /**
     * Envía un mensaje al usuario para notificarle que un usuario nuevo a 
     * ingresado al chat. 
     * @param usuario el usuario al que le vamos a notificar.
     * @param nuevo el usuario que ha ingresado al chat.
     */
    @Override
    public void usuarioAgregado(Usuario usuario, Usuario nuevo) {
        System.out.println(usuario.getNombre() + ", the user " + 
                           nuevo.getNombre() + " has joined the chat room. " + 
                           "Say hi!");
    }

    /**
     * Envía al usuario receptor el mensaje que escribió el ususario transmisor.
     * @param receptor el usuario que va a recibir el mensaje.
     * @param transmisor el usuario que escribió el mensaje. 
     */
    @Override
    public void nuevoMensaje(Usuario receptor, Usuario transmisor) {
        System.out.println(receptor.getNombre() + ", the user " + 
                           transmisor.getNombre() + " sent you the message: " + 
                           transmisor.getMensaje());
    }

    /**
     * Envía un mensaje al usuario para notificarle que un usuario ha salido
     * del chat. 
     * @param usuario el usuario al que le vamos a notificar.
     * @param fuera el usuario que ha salido del chat.
     */
    @Override
    public void usuarioSalio(Usuario usuario, Usuario fuera) {
        System.out.println(usuario.getNombre() + ", the user " + 
                           fuera.getNombre() + " is out of the chat. Goodbye!");
    }
}
