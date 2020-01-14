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

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity(name = "usuarios")
public class Usuarios implements Serializable {

	private static final long serialVersionUID = 1345926479775374504L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	private BigDecimal idUsuario;
	
	@Column(name = "cve_usuario", unique = true, length = 10, nullable = false)
	private String cveUsuario;
	
	@Column(nullable = false)
	private String password;
	
	@Column(length = 100, nullable = false)
	private String nombre;
	
	@Column(length = 100)
	private String email;
	
	@Column(length = 1, nullable = false)
	private String activo;
	
	@Column(length = 10, nullable = false)
	private String usuario; 
	
	@Column(name = "fecha_actualizacion", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(pattern="dd MMM YYYYY HH:mm:ss")
	private Date fechaActualizacion;

	public BigDecimal getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(BigDecimal idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getCveUsuario() {
		return cveUsuario;
	}

	public void setCveUsuario(String cveUsuario) {
		this.cveUsuario = cveUsuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
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
