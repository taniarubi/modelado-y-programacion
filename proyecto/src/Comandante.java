import java.util.ArrayList;

/**
 * Clase para los comandantes.
 */
public class Comandante implements Soldado, Observador {
    /* El nombre del comandante. */
    private String nombre;
    /* El ID del comandante. */
    private long id;
    /* La lista de soldados al mando del comandante. */
    private ArrayList<Soldado> soldados = new ArrayList<Soldado>();

    /**
     * Construye un comandante con nombre, ID y usuario.
     * @param nombre el nombre del comandante.
     * @param id el ID del comandante.
     * @param usuario el usuario al que corresponde el comandante.
     */
    public Comandante(String nombre, long id, Usuario usuario) {
        this.nombre = nombre;
        this.id = id;
        usuario.registrar(this);
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
     * El soldado ataca al enemigo. Si la distancia del soldado con 
     * respecto al enemigo es igual a 0 y el soldado está vivo, entonces
     * ataca. Además, el artillero se causa daño a sí mismo cada vez que éste
     * realiza un ataque exitosamente.
     * @param enemigo el enemigo a atacar.
     */
    @Override
    public void atacar(Enemigo enemigo) {
        for(Soldado soldado: soldados)
            soldado.atacar(enemigo);
    }

    /**
     * Los soldados subordinados del comandante se mueve en dirección al 
     * enemigo. Si la distancia con respecto al enemigo es mayor que cero, 
     * entonces el soldado se mueve; si la distancia con respecto al enemigo 
     * es igual a 0 entonces sólo se avisa que ya llegó el soldado junto al 
     * enemigo. En caso contrario, no hacemos nada.
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
    public void reportar() {
        for(Soldado soldado: soldados)
            soldado.reportar();
    }

    /**
     * Los comandantes envían a sus soldados subordinados la acción que deben 
     * realizar.
     * @param accion la acción que deben realizar los soldados subordinados del
     * comandante.
     *  @param enemigo el enemigo sobre el cual recaerá una posible acción.
     */
    @Override
    public void actualizar(int accion, Enemigo enemigo) {
        switch(accion) {
            case 1:
                atacar(enemigo);
                break;
            case 2:
                mover();
                break;
            case 3:
                reportar();
                break;
            case 4:
                System.out.println(getDistancia());
                break;
            default:
                System.out.println("Acción inválida.");
        }
    }
}
