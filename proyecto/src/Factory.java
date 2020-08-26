/**
 * Clase para crear soldados.
 */
public class Factory {

    /**
     * Regresa un soldado, de acuerdo al tipo solicitado.
     * @param nombre el nombre del soldado.
     * @param id el ID del soldado.
     * @param tipo el tipo de soldado que vamos a crear.
     * @return un soldado, de acuerdo al tipo solicitado.
     */
    public static Soldado getSoldado(String nombre, int id, String tipo) {
        switch(tipo) {
            case "ARTILLERIA":
                Soldado soldadoA = new DeArtilleria(nombre, id);
                return soldadoA;
            case "CABALLERIA":
                Soldado soldadoB = new DeCaballeria(nombre, id);
                return soldadoB;
            case "INFANTERIA":
                Soldado soldadoC =  new DeInfanteria(nombre, id);
                return soldadoC;
            default:
                Soldado soldadoD = null;
                return soldadoD;
        }
    }
}
