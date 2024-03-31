
package autonoma.SimuladorAutomovil.models;

/**
 * @author DOSSA0110
 * @author Riven97
 * @version 1.0.0
 * @since 2024/03/14
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
