package org.model;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

@Data
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Embeddable
public class ReservasId implements Serializable {

    @Column(name = "habitacion")
    private int habitacion;

    @Column(name = "hotel")
    private int hotel;

    @Column(name = "usuario")
    private int usuario;

    public ReservasId() {
    }

    public ReservasId(int habitacion, int hotel, int usuario) {
        this.habitacion = habitacion;
        this.hotel = hotel;
        this.usuario = usuario;
    }
}
