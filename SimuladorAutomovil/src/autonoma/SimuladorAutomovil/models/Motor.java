package autonoma.SimuladorAutomovil.models;
/**
 * @author DOSSA0110
 * @author CRISTIAN
 * @version 1.0.0
 * @since 2024/03/14
 */
public class Motor {
    // Atributos
    /**
     * Nos muestra el cilindraje del motor
     */
    private int cilindraje;
    // Metodo constructor
    /**
     * Inicializa en 0 el atributo
     */
    public Motor() {
        int cilindraje = 0;
    }
    public Motor(int cilindraje) {
        this.cilindraje = cilindraje;
    }
    // Metodos de acceso
    /**
     *
     */
    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    } 
}
