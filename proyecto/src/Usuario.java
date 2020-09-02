import java.util.ArrayList;
import java.util.List;

/**
 * Clase para los usuarios.
 */
public class Usuario {
    /* El nombre del usuario. */
    private String nombre;
    /* Los soldados pertenecientes al ejército. */
    private List<Soldado> soldados = new ArrayList<Soldado>();
    
    /**
     * Construye un usuario con nombre.
     * @param nombre el nombre del usuario.
     * @param sistema el juego al que pertenece.
     */
    public Usuario(String nombre, Sistema juego) {
        this.nombre = nombre;
        juego.registrar(this);
    }

    /**
     * Regresa el nombre del usuario. 
     * @return el nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Regresa los soldados del usuario.
     * @return los soldados del usuario.
     */
    public List<Soldado> getSoldados() {
        return soldados;
    }
}
