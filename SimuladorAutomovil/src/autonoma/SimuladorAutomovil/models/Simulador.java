package autonoma.SimuladorAutomovil.models;

import autonoma.SimuladorAutomovil.Enums.Acciones;
import autonoma.SimuladorAutomovil.exception.AccidenteException;
import autonoma.SimuladorAutomovil.exception.ApagadoException;
import autonoma.SimuladorAutomovil.exception.CapacidadMotorException;
import autonoma.SimuladorAutomovil.exception.EncendidoException;
import autonoma.SimuladorAutomovil.exception.PatinariaException;
import autonoma.SimuladorAutomovil.exception.QuietoException;

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
    public String encender() {
        try {
            this.automovil.encender();
        } catch (EncendidoException e) {
            return e.getMessage();
        }
        return "El vehiculo se encendio";
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
        try {
            this.automovil.acelerar(120);
        } catch (ApagadoException |CapacidadMotorException e) {
            return e.getMessage();
        }
        return " Aceleraste " + automovil.getVelocidad() + " Km/h ";
    }

    public String frenar() {
        try {
            this.automovil.frenar(10);
        } catch (ApagadoException | QuietoException e) {
            return e.getMessage();
        }
        return " Frenaste hasta llegar a " + automovil.getVelocidad() + " Km/h ";
    }

    public String frenarBruscamenteSimu() {
        try {
            this.automovil.frenarBruscamente(31);
        } catch (ApagadoException | PatinariaException e) {
            return e.getMessage();
        }
        return " Frenaste bruscamente 31Km/h hasta ir a " + automovil.getVelocidad() + " Km/h ";
    }
}
