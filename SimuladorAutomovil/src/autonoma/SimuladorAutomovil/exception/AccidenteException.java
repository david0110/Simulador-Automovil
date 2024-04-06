package autonoma.SimuladorAutomovil.exception;

import autonoma.SimuladorAutomovil.Enums.Acciones;

/**
 * @author DOSSA0110
 * @author Riven97
 * @version 1.0.0
 * @since 2024/03/14
 */
public class AccidenteException extends RuntimeException {
    
    private  static String mensaje = "El vehiculo se accidento por apagarlo mientras va a mas de 60km/h";
    
    public AccidenteException( ) {
        
        super(AccidenteException.mensaje);
    }

        
}
