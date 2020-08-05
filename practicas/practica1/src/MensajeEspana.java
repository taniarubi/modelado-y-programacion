/**
 * Clase para el envío de mensajes de usuarios que son de España.
 */
public class MensajeEspana implements Mensaje {
    /**
     * Envía un mensaje al usuario para notificarle que un usuario nuevo a 
     * ingresado al chat. 
     * @param usuario el usuario al que le vamos a notificar.
     * @param nuevo el usuario que ha ingresado al chat.
     */
    @Override
    public void usuarioAgregado(Usuario usuario, Usuario nuevo) {
        System.out.println(usuario.getNombre() + ", el usuario " + 
                           nuevo.getNombre() + " se ha unido al chat. " + 
                           "!Saludadle!");
    }

    /**
     * Envía al usuario receptor el mensaje que escribió el ususario transmisor.
     * @param receptor el usuario que va a recibir el mensaje.
     * @param transmisor el usuario que escribió el mensaje. 
     */
    @Override
    public void nuevoMensaje(Usuario receptor, Usuario transmisor) {
        System.out.println(receptor.getNombre() + ", el usuario " + 
                           transmisor.getNombre() + " ha envíado el mensaje: " +
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
        System.out.println(usuario.getNombre() + ", el usuario " + 
                           fuera.getNombre() + " ha salido del chat. " + 
                           "!Extrañaremos al máquina!");
    }
}
