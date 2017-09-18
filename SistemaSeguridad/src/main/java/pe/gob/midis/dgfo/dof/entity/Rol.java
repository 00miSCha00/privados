package pe.gob.midis.dgfo.dof.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the rol database table.
 * 
 */
@Entity
@Table(name="ROL")
public class Rol implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idRol;

	private String descripcionRol;

	//bi-directional many-to-one association to Permiso
	@OneToMany(mappedBy="rol")
	private List<Permiso> permisos;

	//bi-directional many-to-one association to Sistema
	@ManyToOne
	@JoinColumn(name="idSistema")
	private Sistema sistema;

	//bi-directional many-to-one association to Rolperfil
	@OneToMany(mappedBy="rol")
	private List<RolPerfil> rolperfils;

	public Rol() {
	}

	public int getIdRol() {
		return this.idRol;
	}

	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}

	public String getDescripcionRol() {
		return this.descripcionRol;
	}

	public void setDescripcionRol(String descripcionRol) {
		this.descripcionRol = descripcionRol;
	}

	public List<Permiso> getPermisos() {
		return this.permisos;
	}

	public void setPermisos(List<Permiso> permisos) {
		this.permisos = permisos;
	}

	public Permiso addPermiso(Permiso permiso) {
		getPermisos().add(permiso);
		permiso.setRol(this);

		return permiso;
	}

	public Permiso removePermiso(Permiso permiso) {
		getPermisos().remove(permiso);
		permiso.setRol(null);

		return permiso;
	}

	public Sistema getSistema() {
		return this.sistema;
	}

	public void setSistema(Sistema sistema) {
		this.sistema = sistema;
	}

	public List<RolPerfil> getRolperfils() {
		return this.rolperfils;
	}

	public void setRolperfils(List<RolPerfil> rolperfils) {
		this.rolperfils = rolperfils;
	}

	public RolPerfil addRolperfil(RolPerfil rolperfil) {
		getRolperfils().add(rolperfil);
		rolperfil.setRol(this);

		return rolperfil;
	}

	public RolPerfil removeRolperfil(RolPerfil rolperfil) {
		getRolperfils().remove(rolperfil);
		rolperfil.setRol(null);

		return rolperfil;
	}

}