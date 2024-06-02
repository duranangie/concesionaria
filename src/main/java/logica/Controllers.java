
package logica;

import Persistencia.ControllerPersistencia;
import java.util.List;


public class Controllers {
    
        ControllerPersistencia controlPersistencia = new ControllerPersistencia();

    public void guardar(String modelo, String marca, String motor, String color, int patente, String cantidadPuerta) {
            
            Auto auto = new Auto();
          
            auto.setModelo(modelo);
            auto.setMarca(marca);
            auto.setMotor(motor);
            auto.setColor(color);
            auto.setPatente(patente);
            auto.setCantidadPuertas(cantidadPuerta);
            
            controlPersistencia.guardar(auto);
            
            
            
    }

    public List<Auto> traerAuto() {
     
            return controlPersistencia.traerTabla();
    }

    public void borrarAuto(int id) {
        controlPersistencia.borrarCorre( id);


    }

    public Auto mostrarDatos(int id) {
        return controlPersistencia.mostrarDato(id);

    }

    public void modificarAuto(Auto auto, String modelo, String marca, String motor, String color, int patente, String cantidadPuerta) {
            auto.setModelo(modelo);
            auto.setMarca(marca);
            auto.setMotor(motor);
            auto.setColor(color);
            auto.setPatente(patente);
            auto.setCantidadPuertas(cantidadPuerta);
            
            
            controlPersistencia.modificarAutomovil(auto);
        
        
        
        
        
        
        
        
        
    }
           
    
}
