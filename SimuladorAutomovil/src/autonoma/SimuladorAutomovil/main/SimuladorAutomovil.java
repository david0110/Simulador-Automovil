package autonoma.SimuladorAutomovil.main;
import autonoma.SimuladorAutomovil.models.Automovil;
import autonoma.SimuladorAutomovil.views.PaginaPrincipal;

/**
 * @author DOSSA0110
 * @author Riven97
 * @version 1.0.0
 * @since 2024/03/14
 */

public class SimuladorAutomovil {

    public static void main(String[] args) {
        Automovil automovil = new Automovil();
        PaginaPrincipal paginaPrincipal = new PaginaPrincipal(automovil);
        paginaPrincipal.setVisible(true);

    }
    
    
}
