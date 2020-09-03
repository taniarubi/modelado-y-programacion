/**
 * Clase para los soldados de infantería.
 */
public class DeInfanteria implements Soldado {
    /* El nombre del soldado. */
    private String nombre;
    /* El ID del soldado. */
    private long id;
    /* Los puntos de vida del soldado. */
    private int puntos = 150;
    /* La distancia entre el enemigo y el soldado. */
    private int distancia = 35;
    /* El daño que inflige al enemigo. */
    private int daño = 7;

    /**
     * Construye un soldado de infantería con nombre, ID y puntos de vida.
     * @param nombre el nombre del soldado.
     * @param id el ID del soldado.
     */
    public DeInfanteria(String nombre, long id) {
        this.nombre = nombre;
        this.id = id;
    }

    /**
     * Regresa la distancia del soldado con respecto al enemigo.
     * @return la distancia del soldado con respecto al enemigo.
     */
    @Override
    public String getDistancia() {
        return "El soldado " + this.nombre + " se encuentra a " + 
               this.distancia + "m. del enemigo.\n";
    }

    /**
     * El soldado ataca al enemigo. Si el soldado logra atacar, regresa el daño
     * ocasionado al enemigo; en caso contrario, regresa 0. 
     * @return el daño causado al enemigo.
     */
    @Override
    public int atacar() {
        if(this.distancia == 0) {
            System.out.println(nombre + " ataca al enemigo!");
            this.puntos -= 10;
            return daño;
        } else {
            System.out.println(nombre + " aún no puede atacar al enemigo."); 
            return 0;
        }
    }

    /**
     * El soldado se mueve en dirección al enemigo.
     */
    @Override
    public void mover() {
        System.out.println(nombre + " se ha movido " + distancia + "m.");
        this.distancia -= 5;
    }

    /**
     * Regresa un mensaje con el reporte del soldado.
     */
    @Override
    public String reportar() {
        return "Nombre: " + this.nombre + "\n" +
               "- ID: " + this.id + "\n" +
               "- HP: " + this.puntos + "\n" + 
               "- Distancia: " + this.distancia + "\n" + 
               "- Daño: " + this.daño + "\n" + 
               "- Tipo: Infantería" + "\n";
    }
}
