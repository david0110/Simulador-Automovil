package autonoma.SimuladorAutomovil.models;

import autonoma.SimuladorAutomovil.exception.ApagadoException;
import autonoma.SimuladorAutomovil.exception.CapacidadMotorException;
import autonoma.SimuladorAutomovil.exception.EncendidoException;

/**
 * @author DOSSA0110
 * @author Riven97
 * @version 1.0.0
 * @since 2024/03/14
 */
public class Motor {

    // Atributos
    /**
     * Nos muestra el cilindraje del motor
     */
    private int cilindraje;
    /**
     * Nos da el estado del vehiculo (Encendido / Apagado)
     */
    private boolean encendido;
    /**
     * Muestra la velocidad maxima de el motor
     */
    private double velocidadMaxima;

    // Metodo constructor
    /**
     *
     */
    public Motor(int cilindraje, boolean encendido, double velocidadMaxima) {
        this.cilindraje = cilindraje;
        this.encendido = encendido;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Metodos de acceso
    /**
     * Metodos de acceso
     */
    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    // Metodos
    public void encender() {

        this.encendido = true;
    }

    public void apagar() {

        this.encendido = false;
    }

    //Excepcion ocho
    public void validarVelocidad(double velocidad) throws CapacidadMotorException {
        if (velocidad > this.velocidadMaxima) {
            throw new CapacidadMotorException();
        }
    }

}
