/**
 * Clase para los usuarios. Un usuario tiene nombre, país y grupo de chat. 
 */
public class Usuario implements Observador {
    /* El nombre del usuario. */
    private final String nombre;
    /* El país al que pertenece el usuario. */
    private final String pais;
    /* El mensaje que manda el usuario. */
    private String mensaje;
    /* El mensaje personalizado de acuerdo al país. */
    private Mensaje m; 

    /**
     * Construye un usuario. Cada vez que un usuario es creado, éste es agregado
     * a la lista de usuarios del chat. 
     * @param nombre el nombre del usuario.
     * @param pais el país del usuario.
     * @param chat el grupo de chat al que pertenece el usuario.
     */
    public Usuario(String nombre, String pais, Sistema chat) {
        this.nombre = nombre;
        this.pais = pais;
        chat.registrar(this);
    }

    /**
     * Regresa el nombre del usuario.
     * @return el nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Regresa el país del usuario.
     * @return el país del usuario.
     */
    public String getPais() {
        return pais;
    }

    /**
     * Define el mensaje del usuario.
     * @param mensaje el mensaje del usuario.
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * Regresa el mensaje del usuario. 
     * @return el mensaje del usuario.
     */
    public String getMensaje() {
        return mensaje; 
    }

    /**
     * Envía de manera personalizada el mensaje del usuario.
     * @param usuario el usuario que envía el mensaje. 
     */
    public void enviarMensaje(Usuario usuario) {
        switch(pais) {
            case "MX":
                m = new MensajeMexico();
                m.nuevoMensaje(this, usuario);
                break;
            case "ES":
                m = new MensajeEspana();
                m.nuevoMensaje(this, usuario);
                break;
            case "ENG":
                m = new MensajeInglaterra();
                m.nuevoMensaje(this, usuario);
                break;
            default:
                m = new MensajeInglaterra();
                m.nuevoMensaje(this, usuario);
                break;
        }
    }
    
    /**
     * Envía el mensaje del usuario a los demás usuarios cuando se le notifica.
     * @param usuario el usuario que envía el mensaje. 
     */
    @Override
    public void actualizar(Usuario usuario) {
        enviarMensaje(usuario);
    }
}
