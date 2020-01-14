package mx.com.lobos.msc.bincoServices.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "funciones")
public class Funciones implements Serializable{

	private static final long serialVersionUID = -7797565004542382538L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_funcion")
	private BigDecimal idFuncion;
	
	@Column(name = "cve_funcion", unique = true, length = 10, nullable = false)
	private String cveFuncion;
	
	@Column(length = 100, nullable = false)
	private String descripcion;
	
	@Column(nullable = false)
	private int orden;
	
	@Column(length = 10, nullable = false)
	private String usuario; 
	
	@Column(name="fecha_actualizacion", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaActualizacion;

	public BigDecimal getIdFuncion() {
		return idFuncion;
	}

	public void setIdFuncion(BigDecimal idFuncion) {
		this.idFuncion = idFuncion;
	}

	public String getCveFuncion() {
		return cveFuncion;
	}

	public void setCveFuncion(String cveFuncion) {
		this.cveFuncion = cveFuncion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getOrden() {
		return orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Date getFechaActualizacion() {
		return fechaActualizacion;
	}

	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}
}
