/**
 * Clase para crear soldados.
 */
public class Factory extends AbstractFactory {
    /**
     * Regresa un soldado, de acuerdo al tipo solicitado.
     * @param nombre el nombre del soldado.
     * @param id el ID del soldado.
     * @param tipo el tipo de soldado que vamos a crear.
     * @return un soldado, de acuerdo al tipo solicitado.
     */
    @Override
    public Soldado getSoldado(String nombre, long id, int tipo) {
        Soldado soldado;
        
        switch(tipo) {
            case ARTILLERIA:
                soldado = new DeArtilleria(nombre, id);
                return soldado;
            case CABALLERIA:
                soldado = new DeCaballeria(nombre, id);
                return soldado;
            case INFANTERIA:
                soldado =  new DeInfanteria(nombre, id);
                return soldado;
            default:
                soldado = null;
                return soldado;
        }
    }
}
