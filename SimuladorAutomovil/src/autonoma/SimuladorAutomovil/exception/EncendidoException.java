
package autonoma.SimuladorAutomovil.exception;

/**
 * @author DOSSA0110
 * @author Riven97
 * @version 1.0.0
 * @since 2024/03/122
 */
public class EncendidoException extends RuntimeException{
    
     public EncendidoException () {
        super("El vihuculo ya esta encendido");
    }
    
}
