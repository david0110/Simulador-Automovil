package autonoma.SimuladorAutomovil.main;
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
        Motor motor = new Motor(100);
        Automovil automovil = new Automovil(motor);
        Simulador simulador = new Simulador(automovil);
        
        simulador.encenderVehiculo();
        try {
            simulador.acelerarVehiculo(0);
        } catch (CapacidadMotorException e) {
            System.out.println("Sobrepasaste la velocidad maxima");
            System.exit(0)
        }
        System.out.println("Has acelerado exitosamente");
        
        PaginaPrincipal paginaPrincipal = new PaginaPrincipal(automovil);
        paginaPrincipal.setVisible(true);

    }
    
    
}
