/**
 * Clase abstracta para Factory.
 */
public abstract class AbstractFactory {
    /* El soldado de artillería. */
    public static final int ARTILLERIA = 1;
    /* El soldado de caballería. */
    public static final int CABALLERIA = 2;
    /* El soldado de infantería. */
    public static final int INFANTERIA = 3;

    /**
     * Regresa un soldado, de acuerdo al tipo solicitado.
     * @param nombre el nombre del soldado.
     * @param id el ID del soldado.
     * @param tipo el tipo de soldado que vamos a crear.
     * @return un soldado, de acuerdo al tipo solicitado.
     */
    public abstract Soldado getSoldado(String nombre, long id, int tipo);
}
