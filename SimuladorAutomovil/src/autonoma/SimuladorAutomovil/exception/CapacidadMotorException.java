package autonoma.SimuladorAutomovil.exception;

/**
 * @author DOSSA0110
 * @author Riven97
 * @version 1.0.0
 * @since 2024/03/122
 */
public class CapacidadMotorException extends RuntimeException {

    
    //Excepcion #8
    public CapacidadMotorException() {
        super("La velocidad excedio el limite permitido del motor");
    }
    
}
