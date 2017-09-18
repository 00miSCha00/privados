package pe.gob.midis.dgfo.dof.entity;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name="ROLPERFIL")
public class RolPerfil implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idRolPerfil;

	@ManyToOne
	@JoinColumn(name="idPerfil")
	private Perfil perfil;

	@ManyToOne
	@JoinColumn(name="idRolSistema")
	private Rol rol;

	public RolPerfil() {
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