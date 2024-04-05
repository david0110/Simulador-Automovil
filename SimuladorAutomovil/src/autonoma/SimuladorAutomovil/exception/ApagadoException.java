package autonoma.SimuladorAutomovil.exception;

import autonoma.SimuladorAutomovil.Enums.Acciones;
import static autonoma.SimuladorAutomovil.Enums.Acciones.ACELERAR;

/**
 * @author DOSSA0110
 * @author Riven97
 * @version 1.0.0
 * @since 2024/03/122
 */
public class ApagadoException extends RuntimeException {

    public ApagadoException(String mensaje) {
        super(mensaje);
    }

    public static String getMessage(Acciones accion) {
        return switch (accion) {
            case ACELERAR ->
                "El vehiculo no puede acelerar porque esta apagado";
            case APAGAR ->
                "El vehiculo no se puede apagar porque ya esta apagado";
            case FRENAR ->
                "El vehiculo no se puede frenar porque esta apagado";
            default ->
                "El vihuculo aun no esta encendido";
        };

    }

}
