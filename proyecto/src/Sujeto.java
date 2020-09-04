/**
 * Interfaz para el sujeto. 
 */
public interface Sujeto {
    /**
     * Registra un comandante en la lista de comandantes del usuario.
     * @param comandante el comandante a registrar.
     */
    public void registrar(Comandante comandante);

    /**
     * Remueve a un comandante de la lista de comandantes del usuario.
     * @param comandante el comandante a remover de la lista de comandantes
     * del usuario.
     */
    public void remover(Comandante comandante);

    /**
     * Notifica a todos los comandantes la acción que quiere realizar el 
     * usuario.
     * @param accion la accion que quiere realizar el usuario.
     * @param enemigo el enemigo que será afectado por la acción.
     */
    public void notificar(int accion, Enemigo enemigo);
}
