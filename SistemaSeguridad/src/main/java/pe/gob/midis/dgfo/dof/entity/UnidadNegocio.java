package pe.gob.midis.dgfo.dof.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the unidadnegocio database table.
 * 
 */
@Entity
@NamedQuery(name="Unidadnegocio.findAll", query="SELECT u FROM Unidadnegocio u")
public class UnidadNegocio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idUnidadNegocio;

	private String descripcionUnidadNegocio;

	//bi-directional many-to-one association to Personal
	@OneToMany(mappedBy="unidadnegocio")
	private List<Personal> personals;

	//bi-directional many-to-one association to Direccion
	@ManyToOne
	@JoinColumn(name="idDireccion")
	private Direccion direccion;

	//bi-directional many-to-one association to Institucion
	@ManyToOne
	@JoinColumn(name="idInstitucion")
	private Institucion institucion;

	public UnidadNegocio() {
	}

	public int getIdUnidadNegocio() {
		return this.idUnidadNegocio;
	}

	public void setIdUnidadNegocio(int idUnidadNegocio) {
		this.idUnidadNegocio = idUnidadNegocio;
	}

	public String getDescripcionUnidadNegocio() {
		return this.descripcionUnidadNegocio;
	}

	public void setDescripcionUnidadNegocio(String descripcionUnidadNegocio) {
		this.descripcionUnidadNegocio = descripcionUnidadNegocio;
	}

	public List<Personal> getPersonals() {
		return this.personals;
	}

	public void setPersonals(List<Personal> personals) {
		this.personals = personals;
	}

	public Personal addPersonal(Personal personal) {
		getPersonals().add(personal);
		personal.setUnidadnegocio(this);

		return personal;
	}

	public Personal removePersonal(Personal personal) {
		getPersonals().remove(personal);
		personal.setUnidadnegocio(null);

		return personal;
	}

	public Direccion getDireccion() {
		return this.direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public Institucion getInstitucion() {
		return this.institucion;
	}

	public void setInstitucion(Institucion institucion) {
		this.institucion = institucion;
	}

}