import java.util.ArrayList;
import java.util.List;

/**
 * Clase para el sistema que será el chat. 
 */
public class Sistema implements Sujeto {
    /* Los usuarios que están dentro del chat. */
    private List<Usuario> usuarios = new ArrayList<>();
    /* El mensaje personalizado de acuerdo al país. */
    private Mensaje mensaje;
    /* El nombre (del grupo) del chat. */
    private String nombre;

    /**
     * Construye un sistema de chat. 
     * @param nombre el nombre del chat. 
     */
    public Sistema(String nombre) {
        this.nombre = nombre; 
    }

    /**
     * Regresa los usuarios que están en el chat. 
     * @return los usuarios que están en el chat. 
     */
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    /**
     * Registra un usuario en el sistema de chat. 
     * @param usuario el usuario que vamos a registrar en el chat. 
     */
    public void registrar(Usuario usuario) {
        usuarios.add(usuario);

        for(Usuario u: usuarios) { 
            switch(u.getPais()) {
                case "MX":
                    mensaje = new MensajeMexico();
                    mensaje.usuarioAgregado(u, usuario);
                    break; 
                case "ES":
                    mensaje = new MensajeEspana();
                    mensaje.usuarioAgregado(u, usuario);
                    break; 
                case "ENG":
                    mensaje = new MensajeInglaterra();
                    mensaje.usuarioAgregado(u, usuario);
                    break;
                default:
                    mensaje = new MensajeInglaterra();
                    mensaje.usuarioAgregado(u, usuario);
                    break;
            } 
        }
    }

    /**
     * Remueve a un usuario del sistema de chat. 
     * @param usuario el usuario que vamos a remover del chat. 
     */
    public void remover(Usuario usuario) {
        usuarios.remove(usuario);

        for(Usuario u: usuarios) { 
            switch(u.getPais()) {
                case "MX":
                    mensaje = new MensajeMexico();
                    mensaje.usuarioSalio(u, usuario);
                    break;
                case "ES": 
                    mensaje = new MensajeEspana();
                    mensaje.usuarioSalio(u, usuario);
                    break; 
                case "ENG":
                    mensaje = new MensajeInglaterra();
                    mensaje.usuarioSalio(u, usuario);
                    break;
                default:
                    mensaje = new MensajeInglaterra();
                    mensaje.usuarioSalio(u, usuario);
                    break;
            }
        }
    }

    /**
     * Notifica a todos los usuarios las actualizaciones de mensajes del usuario.
     * @param usuario el usuario sobre el cual vamos a notificar a los demás 
     * usuarios. 
     */
    public void notificar(Usuario usuario) {
        for(Usuario us: usuarios)
            us.actualizar(usuario);
    }
}
