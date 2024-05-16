package org.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Data
@Getter
@Setter
@ToString
@Entity
@Table(name = "hoteles")
public class Hoteles implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "localidad")
    private String localidad;

    @Column(name = "provincia")
    private String provincia;

    @Column(name = "calificacion")
    private int calificacion;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "hoteles")
    private Set<Reservas> reservas = new HashSet<>(0);

    public Hoteles() {
    }

    public Hoteles(int id, String nombre, String localidad, String provincia, int calificacion, Set<Reservas> reservas) {
        this.id = id;
        this.nombre = nombre;
        this.localidad = localidad;
        this.provincia = provincia;
        this.calificacion = calificacion;
        this.reservas = reservas;
    }

      // Setter y Getter para el campo "id"
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Setter y Getter para el campo "nombre"
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Setter y Getter para el campo "localidad"
    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    // Setter y Getter para el campo "provincia"
    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    // Setter y Getter para el campo "calificacion"
    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}
