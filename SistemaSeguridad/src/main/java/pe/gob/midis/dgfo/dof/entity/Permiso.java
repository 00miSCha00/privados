package pe.gob.midis.dgfo.dof.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the permiso database table.
 * 
 */
@Entity
@NamedQuery(name="Permiso.findAll", query="SELECT p FROM Permiso p")
public class Permiso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idPermiso;

	private int activo;

	//bi-directional many-to-one association to Opcion
	@ManyToOne
	@JoinColumn(name="idOpcion")
	private Opcion opcion;

	//bi-directional many-to-one association to Rol
	@ManyToOne
	@JoinColumn(name="idRol")
	private Rol rol;

	public Permiso() {
	}

	public int getIdPermiso() {
		return this.idPermiso;
	}

	public void setIdPermiso(int idPermiso) {
		this.idPermiso = idPermiso;
	}

	public int getActivo() {
		return this.activo;
	}

	public void setActivo(int activo) {
		this.activo = activo;
	}

	public Opcion getOpcion() {
		return this.opcion;
	}

	public void setOpcion(Opcion opcion) {
		this.opcion = opcion;
	}

	public Rol getRol() {
		return this.rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

}