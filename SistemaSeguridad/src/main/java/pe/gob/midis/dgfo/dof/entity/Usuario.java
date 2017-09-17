package pe.gob.midis.dgfo.dof.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idUsuario;

	private String clave;

	//bi-directional many-to-one association to Perfil
	@OneToMany(mappedBy="usuario")
	private List<Perfil> perfils;

	//bi-directional many-to-one association to Personal
	@ManyToOne
	@JoinColumn(name="idPersonal")
	private Personal personal;

	public Usuario() {
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public List<Perfil> getPerfils() {
		return this.perfils;
	}

	public void setPerfils(List<Perfil> perfils) {
		this.perfils = perfils;
	}

	public Perfil addPerfil(Perfil perfil) {
		getPerfils().add(perfil);
		perfil.setUsuario(this);

		return perfil;
	}

	public Perfil removePerfil(Perfil perfil) {
		getPerfils().remove(perfil);
		perfil.setUsuario(null);

		return perfil;
	}

	public Personal getPersonal() {
		return this.personal;
	}

	public void setPersonal(Personal personal) {
		this.personal = personal;
	}

}