package autonoma.SimuladorAutomovil.models;
/**
 * @author DOSSA0110
 * @author CRISTIAN
 * @version 1.0.0
 * @since 2024/03/14
 */
public class Llanta {
    // Atributos
    /**
     * Nos muestra EL tipo de la llanata que tioene el vehiculo
     */
    private String tipoLlanta;
    /**
     * Nos muestra la velocidad maxima permitida a la que se 
     * puede llegar utilizando ese tipo de llanta
     */
    private int velocidadPermitida;
    // Metodo constructor
    /**
     * Inicializa las los atributos anteriores
     */
    public Llanta() {
        String tipoLlanta = "";
        int velocidadPermitida = 0;
    }
    public Llanta(String tipoLlanta, int velocidadPermitida) {
        this.tipoLlanta = tipoLlanta;
        this.velocidadPermitida = velocidadPermitida;
    }  
    // Metodos de acceso
    /**
     * 
     */
    public String getTipoLlanta() {
        return tipoLlanta;
    }

    public void setTipoLlanta(String tipoLlanta) {
        this.tipoLlanta = tipoLlanta;
    }

    public int getVelocidadPermitida() {
        return velocidadPermitida;
    }

    public void setVelocidadPermitida(int velocidadPermitida) {
        this.velocidadPermitida = velocidadPermitida;
    }
    
}
