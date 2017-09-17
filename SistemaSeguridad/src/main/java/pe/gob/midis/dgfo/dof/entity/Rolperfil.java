package pe.gob.midis.dgfo.dof.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the rolperfil database table.
 * 
 */
@Entity
@NamedQuery(name="Rolperfil.findAll", query="SELECT r FROM Rolperfil r")
public class Rolperfil implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idRolPerfil;

	//bi-directional many-to-one association to Perfil
	@ManyToOne
	@JoinColumn(name="idPerfil")
	private Perfil perfil;

	//bi-directional many-to-one association to Rol
	@ManyToOne
	@JoinColumn(name="idRolSistema")
	private Rol rol;

	public Rolperfil() {
	}

	public int getIdRolPerfil() {
		return this.idRolPerfil;
	}

	public void setIdRolPerfil(int idRolPerfil) {
		this.idRolPerfil = idRolPerfil;
	}

	public Perfil getPerfil() {
		return this.perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public Rol getRol() {
		return this.rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

}