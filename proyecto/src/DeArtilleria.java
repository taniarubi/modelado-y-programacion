/**
 * Clase para los soldados de artillería.
 */
public class DeArtilleria implements Soldado {
    /* El nombre del soldado. */
    private String nombre;
    /* El ID del soldado. */
    private long id;
    /* Los puntos de vida del soldado. */
    private int puntos = 200;
    /* La distancia entre el enemigo y el soldado. */
    private int distancia = 50;
    /* El daño que inglige el soldado. */
    private int daño = 40; 

    /**
     * Construye un soldado de artillería con nombre, ID y puntos de vida.
     * @param nombre el nombre del soldado.
     * @param id el ID del soldado.
     */
    public DeArtilleria(String nombre, long id) {
        this.nombre = nombre;
        this.id = id;
    }

    /**
     * Regresa la distancia del soldado con respecto al enemigo.
     * @return la distancia del soldado con respecto al enemigo.
     */
    @Override
    public String getDistancia() {
        return this.nombre + " se encuentra a " + 
               this.distancia + "mts. del enemigo.\n";
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
        if(this.distancia == 0 && this.puntos > 0 && enemigo.getPuntos() >= 0) {
            System.out.println(this.nombre + " ataca al enemigo con un cañón!");
            enemigo.recibeAtaque(this.daño);
            this.puntos -= 10;
        } else {
            System.out.println(this.nombre + " aún no puede atacar al enemigo."); 
        }
    }

    /**
     * El soldado se mueve en dirección al enemigo. Si la distancia con 
     * respecto al enemigo es mayor que cero, entonces se mueve; si la distancia
     * con respecto al enemigo es igual a 0 entonces sólo se avisa que ya llegó
     * el soldado junto al enemigo. En caso contrario, no hacemos nada.
     */
    @Override
    public void mover() {
        if((this.distancia - 5) > 0) {
            this.distancia -= 5;
            System.out.println(this.nombre + " se ha movido junto con su cañón!");
            System.out.print(getDistancia());
        } else if(this.distancia == 0) {
            System.out.println(this.nombre + " ya se encuentra junto al enemigo.");
        } else {
            this.distancia = 0;
            System.out.println(this.nombre + " se ha movido junto con su cañón!");
            System.out.print(getDistancia());
        }
    }

    /**
     * El soldado se reporta. Nos indica cuál es su nombre, ID, puntos de vida, 
     * distancia con respecto al enemigo y el tipo de soldado que es.
     */
    @Override
    public void reportar() {
        String cadena = "Nombre: " + this.nombre + "\n" +
                        "- Tipo: Artillero\n" +
                        "- ID: " + this.id + "\n" +
                        "- HP: " + this.puntos + "\n" + 
                        "- Distancia: " + this.distancia + "\n";

        System.out.println(cadena);
    }
}
