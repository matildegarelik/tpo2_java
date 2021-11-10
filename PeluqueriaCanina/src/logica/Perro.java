package logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Perro implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Basic
    private Integer num_cliente;
    private String nombre;
    private String raza;
    private String color;
    private Boolean alergico;
    private Boolean atencion;
    private String nombre_duenio;
    private String celular;
    private String observaciones;

    public Perro() {
    }

    public Perro(Integer num_cliente, String nombre, String raza, String color, Boolean alergico, Boolean atencion, String celular, String observaciones) {
        this.num_cliente = num_cliente;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atencion = atencion;
        this.celular = celular;
        this.observaciones = observaciones;
    }

    public void setNum_cliente(Integer num_cliente) {
        this.num_cliente = num_cliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAlergico(Boolean alergico) {
        this.alergico = alergico;
    }

    public void setAtencion(Boolean atencion) {
        this.atencion = atencion;
    }

    public void setNombre_duenio(String nombre_duenio) {
        this.nombre_duenio = nombre_duenio;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Integer getNum_cliente() {
        return num_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }

    public Boolean getAlergico() {
        return alergico;
    }

    public Boolean getAtencion() {
        return atencion;
    }

    public String getNombre_duenio() {
        return nombre_duenio;
    }

    public String getCelular() {
        return celular;
    }

    public String getObservaciones() {
        return observaciones;
    }
    
    
}
