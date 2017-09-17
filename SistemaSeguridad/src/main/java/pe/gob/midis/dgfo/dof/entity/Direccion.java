package pe.gob.midis.dgfo.dof.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the direccion database table.
 * 
 */
@Entity
@NamedQuery(name="Direccion.findAll", query="SELECT d FROM Direccion d")
public class Direccion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idDireccion;

	private String descripcionDireccion;

	//bi-directional many-to-one association to Institucion
	@ManyToOne
	@JoinColumn(name="idInstitucion")
	private Institucion institucion;

	//bi-directional many-to-one association to Viceministerio
	@ManyToOne
	@JoinColumn(name="idViceMinisterio")
	private Viceministerio viceministerio;

	//bi-directional many-to-one association to Unidadnegocio
	@OneToMany(mappedBy="direccion")
	private List<Unidadnegocio> unidadnegocios;

	public Direccion() {
	}

	public int getIdDireccion() {
		return this.idDireccion;
	}

	public void setIdDireccion(int idDireccion) {
		this.idDireccion = idDireccion;
	}

	public String getDescripcionDireccion() {
		return this.descripcionDireccion;
	}

	public void setDescripcionDireccion(String descripcionDireccion) {
		this.descripcionDireccion = descripcionDireccion;
	}

	public Institucion getInstitucion() {
		return this.institucion;
	}

	public void setInstitucion(Institucion institucion) {
		this.institucion = institucion;
	}

	public Viceministerio getViceministerio() {
		return this.viceministerio;
	}

	public void setViceministerio(Viceministerio viceministerio) {
		this.viceministerio = viceministerio;
	}

	public List<Unidadnegocio> getUnidadnegocios() {
		return this.unidadnegocios;
	}

	public void setUnidadnegocios(List<Unidadnegocio> unidadnegocios) {
		this.unidadnegocios = unidadnegocios;
	}

	public Unidadnegocio addUnidadnegocio(Unidadnegocio unidadnegocio) {
		getUnidadnegocios().add(unidadnegocio);
		unidadnegocio.setDireccion(this);

		return unidadnegocio;
	}

	public Unidadnegocio removeUnidadnegocio(Unidadnegocio unidadnegocio) {
		getUnidadnegocios().remove(unidadnegocio);
		unidadnegocio.setDireccion(null);

		return unidadnegocio;
	}

}