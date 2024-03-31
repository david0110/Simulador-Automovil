package autonoma.SimuladorAutomovil.models;

import autonoma.SimuladorAutomovil.exception.CapacidadMotorException;
import autonoma.SimuladorAutomovil.models.Llanta;
import autonoma.SimuladorAutomovil.models.Motor;

/**
 * @author DOSSA0110
 * @author Riven97
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
    private double velocidad;
    /**
     * Muestra
     */
    private Motor motor;
    /**
     * Muestra el tipo de llanta que lleva el vehiculo
     */
    private Llanta llanta;

    // Metodo constructor
    /**
     * Inicializo cada uno de los atributos anteriores
     */
    public Automovil(Motor motor) {
        this.estado = false; // Inicializa el estado como apagado
        this.velocidad = 0;  // Inicializa la velocidad como cero
        this.llanta = new Llanta();
        this.motor = motor;
    }

    public Automovil(boolean estado, double velocidad, Llanta llanta) {
        this.estado = estado;
        this.velocidad = velocidad;
        this.llanta = new Llanta();
    }

    public Motor getMotor() {
        return motor;
    }

    /**
     * Metodos de acceso
     */
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public boolean getEstado(boolean estado) {
        return estado;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public Llanta getLlanta() {
        return llanta;
    }

    public void setLlanta(Llanta llanta) {
        this.llanta = llanta;
    }

    /**
     * Metodo para encender
     */
    public void encender() {
        this.motor.encender();
    }

    
    public void accidentarVehiculo(){
        this.setVelocidad(0);
        this.apagar();
    }
    
    /**
     * Metodo para acelerar
     */
    public void acelerar(double velocidad)throws CapacidadMotorException {
        
        double nVelocidad = this.velocidad + velocidad;
        this.motor.validarVelocidad(nVelocidad);
        this.setVelocidad(nVelocidad);
        
    }

     /**
     * Metodo para acelerar
     */
    public void apagar(){
    this.motor.apagar();
    }
    
}
