package model;
// Generated 13 ene 2024, 20:22:33 by Hibernate Tools 6.3.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Hoteles generated by hbm2java
 */
public class Hoteles implements java.io.Serializable {

	private int id;
	private String nombre;
	private String localidad;
	private String provincia;
	private int calificacion;
	private Set reservases = new HashSet(0);

	public Hoteles() {
	}

	public Hoteles(int id, String nombre, String localidad, String provincia, int calificacion, Set reservases) {
		this.id = id;
		this.nombre = nombre;
		this.localidad = localidad;
		this.provincia = provincia;
		this.calificacion = calificacion;
		this.reservases = reservases;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLocalidad() {
		return this.localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return this.provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public int getCalificacion() {
		return this.calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	public Set getReservases() {
		return this.reservases;
	}

	public void setReservases(Set reservases) {
		this.reservases = reservases;
	}

}
