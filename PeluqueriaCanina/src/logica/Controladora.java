package logica;

import Persistencia.ControladoraPersistencia;

public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    public void crearPerro(Integer num_cliente,String nombre, String raza, String color, Boolean alergico, Boolean atencion, String nombre_duenio,String celular, String observaciones){
        Perro pe = new Perro();
        pe.setNombre(nombre);
        pe.setRaza(raza);
        pe.setColor(color);
        pe.setAlergico(alergico);
        pe.setAtencion(atencion);
        pe.setCelular(celular);
        pe.setObservaciones(observaciones);
        pe.setNombre_duenio(nombre_duenio);
        pe.setNum_cliente(num_cliente);
        controlPersis.crearPerro(pe);
    }
    
    public void crearPerro(Perro pe){
        controlPersis.crearPerro(pe);
    }
}
