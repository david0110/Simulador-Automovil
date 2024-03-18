package autonoma.SimuladorAutomovil.models;
import autonoma.SimuladorAutomovil.models.Llanta;
import autonoma.SimuladorAutomovil.models.Motor;
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
    public Automovil() {
        boolean estado = false;
        int velocidad = 0;
        Llanta llanta;
    }
    public Automovil(boolean estado, int velocidad, Llanta llanta) {
        this.estado = estado;
        this.velocidad = velocidad;
        this.llanta = new Llanta();
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public Llanta getLlanta() {
        return llanta;
    }

    public void setLlanta(Llanta llanta) {
        this.llanta = llanta;
    }
    // Metodos de acceso
    /**
     * 
     */
    
}
