package org.model;

import java.sql.Date;
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
@Table(name = "reservas")
public class Reservas implements java.io.Serializable {

    @EmbeddedId
    private ReservasId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hotel",referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    private Hoteles hoteles;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario",referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "habitacion",referencedColumnName = "numero", nullable = false, insertable = false, updatable = false)
    private Habitaciones habitaciones;

    @Column(name = "fechaEntrada", nullable = false)
    private Date fechaEntrada;

    @Column(name = "fechaSalida", nullable = false)
    private Date fechaSalida;

    @Column(name = "precio", nullable = false)
    private double precio;

    public Reservas() {
    }

    public Reservas(ReservasId id, Hoteles hoteles, Usuario usuario, Habitaciones habitaciones, Date fechaEntrada,
            Date fechaSalida, double precio) {
        this.id = id;
        this.hoteles = hoteles;
        this.usuario = usuario;
        this.habitaciones = habitaciones;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.precio = precio;
    }

    // Getters and setters

}
