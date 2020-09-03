import java.util.ArrayList;

/**
 * Clase para los comandantes.
 */
public class Comandante implements Soldado {
    /* El nombre del comandante. */
    private String nombre;
    /* El ID del comandante. */
    private long id;
    /* La lista de soldados al mando del comandante. */
    private ArrayList<Soldado> soldados = new ArrayList<Soldado>();

    /**
     * Construye un comandante con nombre y ID.
     * @param nombre el nombre del comandante.
     * @param id el ID del comandante.
     */
    public Comandante(String nombre, long id) {
        this.nombre = nombre;
        this.id = id;
    }

    /**
     * Regresa la lista con los soldados al mando del comandante.
     * @return la lista con los soldados al mando del comandante.
     */
    public ArrayList<Soldado> getSoldados() {
        return soldados;
    }

    /**
     * Agrega un soldado a la lista de subordinados del comandante.
     * @param soldado el soldado a agregar a la lista de subordinados del 
     * comandante.
     */
    public void agregarSoldado(Soldado soldado) {
        soldados.add(soldado);
    }

    /**
     * Elimina a un soldado de la lista de subordinados del comandante.
     * @param soldado el soldado a eliminar de la lista de subordinados del 
     * comandante.
     */
    public void eliminarSoldado(Soldado soldado) {
        soldados.remove(soldado);
    }

    /**
     * Regresa la distancia de todos los soldados subordinados del comandante 
     * con respecto al enemigo.
     * @return la distancia de todos los soldados subordinados del comandante 
     * con respecto al enemigo.
     */
    @Override
    public String getDistancia() {
        String cadena = "";
        for(Soldado soldado: soldados)
            cadena += soldado.getDistancia();

        return cadena;
    }

    /**
     * Los soldados subordinados del comandante atacan al enemigo. Si los 
     * soldados logran atacar, entonces regresa el daño ocasionado al enemigo;
     * en caso contrario, regresa 0.
     * @return el daño ocasionado por el ataque de los soldados subordinados 
     * del comandante.
     */
    @Override
    public int atacar() {
        int dañoTotal = 0;
        for(Soldado soldado: soldados)
            dañoTotal += soldado.atacar();

        return dañoTotal;
    }

    /**
     * Los soldados subordinados del comandante se mueven.
     */
    @Override
    public void mover() {
        for(Soldado soldado: soldados)
            soldado.mover();
    }

    /**
     * Regresa el reporte de cada uno de los soldados subordinados del 
     * comandante.
     * @return el reporte de cada uno de los soldados subordinados del 
     * comandante.
     */
    @Override
    public String reportar() {
        String cadena = "";
        for(Soldado soldado: soldados)
            cadena += soldado.reportar();

        return cadena;
    }
}
