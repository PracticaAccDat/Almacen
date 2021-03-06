package Almacen;

// Generated 24-feb-2015 16:55:43 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Descargas generated by hbm2java
 */
public class Descargas implements java.io.Serializable {

	private Integer idDescarga;
	private String empresa;
	private String matricula;
	private String nombreConductor;
	private Date hora;
	private Date fecha;

	public Descargas() {
	}

	public Descargas(String empresa, String matricula, String nombreConductor,
			Date hora, Date fecha) {
		this.empresa = empresa;
		this.matricula = matricula;
		this.nombreConductor = nombreConductor;
		this.hora = hora;
		this.fecha = fecha;
	}

	public Integer getIdDescarga() {
		return this.idDescarga;
	}

	public void setIdDescarga(Integer idDescarga) {
		this.idDescarga = idDescarga;
	}

	public String getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getMatricula() {
		return this.matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNombreConductor() {
		return this.nombreConductor;
	}

	public void setNombreConductor(String nombreConductor) {
		this.nombreConductor = nombreConductor;
	}

	public Date getHora() {
		return this.hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}
