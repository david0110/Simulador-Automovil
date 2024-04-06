package autonoma.SimuladorAutomovil.models;

import autonoma.SimuladorAutomovil.Enums.Acciones;
import autonoma.SimuladorAutomovil.exception.AccidenteException;
import autonoma.SimuladorAutomovil.exception.ApagadoException;

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
    public void encender() {
        this.automovil.encender();
    }

    public String apagarVehiculo() {
        try {
            this.automovil.apagar();
        } catch (ApagadoException | AccidenteException e) {
            return e.getMessage();
        }
        return "El vehiculo se apago ";
    }

    public String acelerar() {
        try{
            this.automovil.acelerar(10);
        }catch( ApagadoException e){
            return e.getMessage();
        }
        return " Aceleraste " + automovil.getVelocidad() + " Km/h ";
    }

    public void frenar() {
        this.automovil.frenar(10);
    }

    public void frenarBruscamente() {
        this.automovil.frenarBruscamente(31);
    }
}
