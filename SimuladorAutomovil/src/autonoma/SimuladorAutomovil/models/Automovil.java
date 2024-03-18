package autonoma.SimuladorAutomovil.models;
/**
 * @author DOSSA0110
 * @author CRISTIAN
 * @version 1.0.0
 * @since 2024/03/14
 */
public class Automovil {
    // Atributos
    /**
     * Muestra nos da el estado del vehiculo (Encendido / Apagado)
     */
    private boolean estado;
    /**
     * Muestra la velocidad actual del vehiculo
     */
    private int velocidad;
    /**
     * Muestra el tipo de llanta que lleva el vehiculo
     */
    private Llanta llanta;
    // Metodo constructor
    /**
     * Inicializo cada uno de los atributos anteriores
     */
    public Automovil(boolean estado, int velocidad, Llanta llanta) {
        this.estado = estado;
        this.velocidad = velocidad;
        this.llanta = llanta;
    }
    // Metodos de acceso
}
