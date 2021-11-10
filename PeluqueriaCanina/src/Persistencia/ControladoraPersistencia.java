package Persistencia;

import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Perro;

public class ControladoraPersistencia {
    PerroJpaController perroJPA = new PerroJpaController();
    public void crearPerro(Perro p){
        try {
            perroJPA.create(p);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
