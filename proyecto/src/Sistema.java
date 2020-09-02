import java.util.ArrayList;
import java.util.List;

/**
 * Clase para el sistema que será el juego.
 */
public class Sistema implements Sujeto {
    /* Los usuarios que están dentro del juego. */
    private List<Usuario> usuarios = new ArrayList<>();
    /* El nombre (de la partida) del juego. */
    private String nombre;

    /**
     * Construye un sistema de juego.
     * @param nombre el nombre de la partida.
     */
    public Sistema(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Regresa los usuarios que están en el juego.
     * @return los usuarios que están en el juego.
     */
    public List<Usuario> getUsuario() {
        return usuarios;
    }

    /**
     * Registra un usuario en el sistema del juego.
     * @param usuario el usuario que vamos a registrar en el juego.
     */
    public void registrar(Usuario usuario) {
        usuarios.add(usuario);
    }

    /**
     * Elimina a un usuario del sistema de juego.
     * @param usuario el usuario que vamos a eliminar del juego.
     */
    public void eliminar(Usuario usuario) {
        usuarios.remove(usuario);
    }

    /**
     * Notifica a todos los usuarios las actualizaciones de mensajes del usuario.
     * @param usuario el usuario sobre el cual vamos a notificar a los demás 
     * usuarios. 
     */
    public void notificar(Usuario usuario) {
        //for(Usuario u: usuarios) {
        //    u.actualizar(usuario);
        //}
        System.out.println("");
    }
}
