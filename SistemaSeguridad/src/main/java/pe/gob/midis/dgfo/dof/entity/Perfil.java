package pe.gob.midis.dgfo.dof.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the perfil database table.
 * 
 */
@Entity
@NamedQuery(name="Perfil.findAll", query="SELECT p FROM Perfil p")
public class Perfil implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idPerfil;

	private String descripcionPerfil;

	//bi-directional many-to-one association to Sistema
	@ManyToOne
	@JoinColumn(name="idSistema")
	private Sistema sistema;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario usuario;

	//bi-directional many-to-one association to Rolperfil
	@OneToMany(mappedBy="perfil")
	private List<Rolperfil> rolperfils;

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

	public List<Rolperfil> getRolperfils() {
		return this.rolperfils;
	}

	public void setRolperfils(List<Rolperfil> rolperfils) {
		this.rolperfils = rolperfils;
	}

	public Rolperfil addRolperfil(Rolperfil rolperfil) {
		getRolperfils().add(rolperfil);
		rolperfil.setPerfil(this);

		return rolperfil;
	}

	public Rolperfil removeRolperfil(Rolperfil rolperfil) {
		getRolperfils().remove(rolperfil);
		rolperfil.setPerfil(null);

		return rolperfil;
	}

}