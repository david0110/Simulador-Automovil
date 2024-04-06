package autonoma.SimuladorAutomovil.exception;

/**
 * @author DOSSA0110
 * @author Riven97
 * @version 1.0.0
 * @since 2024/03/14
 */
public class AccidenteException extends RuntimeException {

    public AccidenteException() {
        super("El vehiculo se accidento por apagarlo mientras va a mas de 60km/h");
    }

}
