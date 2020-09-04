/**
 * Interfaz para los soldados.
 */
public interface Soldado {
    /**
     * Regresa la distancia del soldado con respecto a la del enemigo.
     * @return ls distancia del soldado con respecto a la del enemigo.
     */
    public String getDistancia();

    /**
     * El soldado ataca al enemigo. Si la distancia del soldado con 
     * respecto al enemigo es igual a 0 y el soldado está vivo, entonces
     * ataca. 
     * @param enemigo el enemigo a atacar.
     */
    public void atacar(Enemigo enemigo);

    /**
     * El soldado se mueve en dirección al enemigo. Si la distancia con 
     * respecto al enemigo es mayor que cero, entonces se mueve; si la distancia
     * con respecto al enemigo es igual a 0 entonces sólo se avisa que ya llegó
     * el soldado junto al enemigo. En caso contrario, no hacemos nada.
     */
    public void mover();

    /**
     * El soldado se reporta. Nos indica cuál es su nombre, ID, puntos de vida, 
     * distancia con respecto al enemigo y el tipo de soldado que es.
     */
    public void reportar();
}
