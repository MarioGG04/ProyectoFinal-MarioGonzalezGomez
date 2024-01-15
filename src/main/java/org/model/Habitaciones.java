package org.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;

@Data
@Getter
@Setter
@ToString
@Entity
@Table(name = "habitaciones")
public class Habitaciones implements java.io.Serializable {

    @Id
    @Column(name = "numero")
    private int numero;

    @Column(name = "banhos")
    private int banhos;

    @Column(name = "camas")
    private int camas;

    @Column(name = "precio")
    private int precio;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "habitaciones")
    private Set<Reservas> reservas = new HashSet<>(0);

    public Habitaciones() {
    }

    public Habitaciones(int numero, int banhos, int camas, int precio, Set<Reservas> reservas) {
        this.numero = numero;
        this.banhos = banhos;
        this.camas = camas;
        this.precio = precio;
        this.reservas = reservas;
    }

    // Getters and setters

}
