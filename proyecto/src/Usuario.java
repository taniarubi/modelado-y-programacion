import java.util.ArrayList;

/**
 * Clase para los usuarios.
 */
public class Usuario implements Sujeto {
    /* El nombre del usuario. */
    private String nombre;
    /* La lista con los comandantes del usuario. */
    private ArrayList<Comandante> comandantes = new ArrayList<Comandante>();
    
    /**
     * Construye un usuario con nombre.
     * @param nombre el nombre del usuario.
     */
    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Regresa el nombre del usuario.
     * @return el nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Regresa la lista de comandantes que pertenecen al usuario.
     * @return la lista de comandantes que pertenecen al usuario.
     */
    public ArrayList<Comandante> getComandantes() {
        return comandantes;
    }

    /**
     * Registra un comandante en la lista de comandantes del usuario.
     * @param comandante el comandante a registrar.
     */
    @Override
    public void registrar(Comandante comandante) {
        comandantes.add(comandante);
    }

    /**
     * Remueve a un comandante de la lista de comandantes del usuario.
     * @param comandante el comandante a remover de la lista de comandantes
     * del usuario.
     */
    @Override
    public void remover(Comandante comandante) {
        comandantes.remove(comandante);
    }

    /**
     * Notifica a todos los comandantes la acción que quiere realizar el 
     * usuario.
     * @param accion la accion que quiere realizar el usuario.
     *  @param enemigo el enemigo sobre el cual recaerá una posible acción.
     */
    @Override
    public void notificar(int accion, Enemigo enemigo) {
        for(Comandante comandante: comandantes)
            comandante.actualizar(accion, enemigo);
    }
}
