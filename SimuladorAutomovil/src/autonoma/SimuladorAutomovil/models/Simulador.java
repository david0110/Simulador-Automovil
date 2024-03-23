/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.SimuladorAutomovil.models;

/**
 *
 * @author DOSSA0110
 */
public class Simulador {
    //Atributos
    private Automovil automovil;
    // Metodo constructor
    public Simulador(Automovil automovil) {
        this.automovil = automovil;
    }
    // Metodos 
    public void encenderVehiculo(){
        this.automovil.encender();
    }
    public void apagarVehiculo(){
        this.automovil.apagar();
    }
    public void acelerarVehiculo(double velocidad){
        
    }
}
