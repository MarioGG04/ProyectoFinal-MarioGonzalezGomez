package model;
// Generated 13 ene 2024, 20:22:33 by Hibernate Tools 6.3.1.Final

import java.sql.Date;

/**
 * Reservas generated by hbm2java
 */
public class Reservas implements java.io.Serializable {

	private ReservasId id;
	private Hoteles hoteles;
	private Usuario usuario;
	private Habitaciones habitaciones;
	private Date fechaEntrada;
	private Date fechaSalida;
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

	public ReservasId getId() {
		return this.id;
	}

	public void setId(ReservasId id) {
		this.id = id;
	}

	public Hoteles getHoteles() {
		return this.hoteles;
	}

	public void setHoteles(Hoteles hoteles) {
		this.hoteles = hoteles;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Habitaciones getHabitaciones() {
		return this.habitaciones;
	}

	public void setHabitaciones(Habitaciones habitaciones) {
		this.habitaciones = habitaciones;
	}

	public Date getFechaEntrada() {
		return this.fechaEntrada;
	}

	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public Date getFechaSalida() {
		return this.fechaSalida;
	}

	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
