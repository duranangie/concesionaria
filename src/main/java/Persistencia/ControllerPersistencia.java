
package Persistencia;

import java.util.List;
import logica.Auto;

public class ControllerPersistencia {
    
    AutoJpaController carropersistencia = new AutoJpaController();

    public void guardar(Auto auto) {
        
        carropersistencia.create(auto);
        
    }

    public List<Auto> traerTabla() {
     return carropersistencia.findAutoEntities();

    }
    
}
