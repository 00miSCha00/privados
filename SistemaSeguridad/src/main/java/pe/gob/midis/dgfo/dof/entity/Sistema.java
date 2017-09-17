package pe.gob.midis.dgfo.dof.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the sistema database table.
 * 
 */
@Entity
@NamedQuery(name="Sistema.findAll", query="SELECT s FROM Sistema s")
public class Sistema implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idSistema;

	private String descripcion;

	//bi-directional many-to-one association to Modulo
	@OneToMany(mappedBy="sistema")
	private List<Modulo> modulos;

	//bi-directional many-to-one association to Perfil
	@OneToMany(mappedBy="sistema")
	private List<Perfil> perfils;

	//bi-directional many-to-one association to Rol
	@OneToMany(mappedBy="sistema")
	private List<Rol> rols;

	public Sistema() {
	}

	public int getIdSistema() {
		return this.idSistema;
	}

	public void setIdSistema(int idSistema) {
		this.idSistema = idSistema;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Modulo> getModulos() {
		return this.modulos;
	}

	public void setModulos(List<Modulo> modulos) {
		this.modulos = modulos;
	}

	public Modulo addModulo(Modulo modulo) {
		getModulos().add(modulo);
		modulo.setSistema(this);

		return modulo;
	}

	public Modulo removeModulo(Modulo modulo) {
		getModulos().remove(modulo);
		modulo.setSistema(null);

		return modulo;
	}

	public List<Perfil> getPerfils() {
		return this.perfils;
	}

	public void setPerfils(List<Perfil> perfils) {
		this.perfils = perfils;
	}

	public Perfil addPerfil(Perfil perfil) {
		getPerfils().add(perfil);
		perfil.setSistema(this);

		return perfil;
	}

	public Perfil removePerfil(Perfil perfil) {
		getPerfils().remove(perfil);
		perfil.setSistema(null);

		return perfil;
	}

	public List<Rol> getRols() {
		return this.rols;
	}

	public void setRols(List<Rol> rols) {
		this.rols = rols;
	}

	public Rol addRol(Rol rol) {
		getRols().add(rol);
		rol.setSistema(this);

		return rol;
	}

	public Rol removeRol(Rol rol) {
		getRols().remove(rol);
		rol.setSistema(null);

		return rol;
	}

}