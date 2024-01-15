package org.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "usuario")
public class Usuario implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "username")
    private String username;

    @Column(name = "password", length = 500)
    private String password;

    @Column(name = "email")
    private String email;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
    private Set<Reservas> reservas = new HashSet<>(0);

    public Usuario() {
    }

    public Usuario(int id, String nombre, String apellido, String username, String password, String email,
            Set<Reservas> reservas) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.username = username;
        this.password = password;
        this.email = email;
        this.reservas = reservas;
    }

    // Getters and setters

}
