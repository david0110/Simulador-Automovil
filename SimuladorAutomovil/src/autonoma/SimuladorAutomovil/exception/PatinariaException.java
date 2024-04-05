package autonoma.SimuladorAutomovil.exception;

/**
 * @author DOSSA0110
 * @author Riven97
 * @version 1.0.0
 * @since 2024/03/122
 */
public class PatinariaException extends RuntimeException {

    public PatinariaException() {
        System.out.println("El vehiculo patina, por frenar bruscamente");
    }

}
