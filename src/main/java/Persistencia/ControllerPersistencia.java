
package Persistencia;

import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Auto;

public class ControllerPersistencia {
    
    AutoJpaController carropersistencia = new AutoJpaController();

    public void guardar(Auto auto) {
        
        carropersistencia.create(auto);
        
    }

    public List<Auto> traerTabla() {
     return carropersistencia.findAutoEntities();

    }

    public void borrarCorre(int id) {
        try {
            carropersistencia.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControllerPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Auto mostrarDato(int id) {
        return carropersistencia.findAuto(id);
    }

    public void modificarAutomovil(Auto auto) {
        
        try {
            carropersistencia.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControllerPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    
}
