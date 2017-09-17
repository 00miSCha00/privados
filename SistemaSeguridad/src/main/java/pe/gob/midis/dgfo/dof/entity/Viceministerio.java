package pe.gob.midis.dgfo.dof.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the viceministerio database table.
 * 
 */
@Entity
@NamedQuery(name="Viceministerio.findAll", query="SELECT v FROM Viceministerio v")
public class Viceministerio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idViceMinisterio;

	private String descripcionViceMinisterio;

	//bi-directional many-to-one association to Direccion
	@OneToMany(mappedBy="viceministerio")
	private List<Direccion> direccions;

	//bi-directional many-to-one association to Institucion
	@ManyToOne
	@JoinColumn(name="idInstitucion")
	private Institucion institucion;

	public Viceministerio() {
	}

	public int getIdViceMinisterio() {
		return this.idViceMinisterio;
	}

	public void setIdViceMinisterio(int idViceMinisterio) {
		this.idViceMinisterio = idViceMinisterio;
	}

	public String getDescripcionViceMinisterio() {
		return this.descripcionViceMinisterio;
	}

	public void setDescripcionViceMinisterio(String descripcionViceMinisterio) {
		this.descripcionViceMinisterio = descripcionViceMinisterio;
	}

	public List<Direccion> getDireccions() {
		return this.direccions;
	}

	public void setDireccions(List<Direccion> direccions) {
		this.direccions = direccions;
	}

	public Direccion addDireccion(Direccion direccion) {
		getDireccions().add(direccion);
		direccion.setViceministerio(this);

		return direccion;
	}

	public Direccion removeDireccion(Direccion direccion) {
		getDireccions().remove(direccion);
		direccion.setViceministerio(null);

		return direccion;
	}

	public Institucion getInstitucion() {
		return this.institucion;
	}

	public void setInstitucion(Institucion institucion) {
		this.institucion = institucion;
	}

}