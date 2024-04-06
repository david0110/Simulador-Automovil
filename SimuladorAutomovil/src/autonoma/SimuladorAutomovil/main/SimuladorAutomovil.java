package autonoma.SimuladorAutomovil.main;

import autonoma.SimuladorAutomovil.exception.CapacidadMotorException;
import autonoma.SimuladorAutomovil.models.Automovil;
import autonoma.SimuladorAutomovil.models.Motor;
import autonoma.SimuladorAutomovil.models.Simulador;
import autonoma.SimuladorAutomovil.views.PaginaPrincipal;

/**
 * @author DOSSA0110
 * @author Riven97
 * @version 1.0.0
 * @since 2024/03/14
 */
public class SimuladorAutomovil {

    public static void main(String[] args) {
        Motor motor = new Motor(200, false, 150);
        Automovil automovil = new Automovil(motor);
        Simulador simulador = new Simulador(automovil);

        PaginaPrincipal paginaPrincipal = new PaginaPrincipal(simulador);
        paginaPrincipal.setVisible(true);

    }
}
