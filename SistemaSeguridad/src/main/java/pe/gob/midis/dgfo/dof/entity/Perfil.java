package pe.gob.midis.dgfo.dof.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the perfil database table.
 * 
 */
@Entity
@Table(name="Perfil")
public class Perfil implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idPerfil;

	private String descripcionPerfil;

	@ManyToOne
	@JoinColumn(name="idSistema")
	private Sistema sistema;

	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario usuario;

	//bi-directional many-to-one association to Rolperfil
	@OneToMany(mappedBy="perfil")
	private List<RolPerfil> rolperfils;

	public Perfil() {
	}

	public int getIdPerfil() {
		return this.idPerfil;
	}

	public void setIdPerfil(int idPerfil) {
		this.idPerfil = idPerfil;
	}

	public String getDescripcionPerfil() {
		return this.descripcionPerfil;
	}

	public void setDescripcionPerfil(String descripcionPerfil) {
		this.descripcionPerfil = descripcionPerfil;
	}

	public Sistema getSistema() {
		return this.sistema;
	}

	public void setSistema(Sistema sistema) {
		this.sistema = sistema;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<RolPerfil> getRolperfils() {
		return this.rolperfils;
	}

	public void setRolperfils(List<RolPerfil> rolperfils) {
		this.rolperfils = rolperfils;
	}

	public RolPerfil addRolperfil(RolPerfil rolperfil) {
		getRolperfils().add(rolperfil);
		rolperfil.setPerfil(this);

		return rolperfil;
	}

	public RolPerfil removeRolperfil(RolPerfil rolperfil) {
		getRolperfils().remove(rolperfil);
		rolperfil.setPerfil(null);

		return rolperfil;
	}

}