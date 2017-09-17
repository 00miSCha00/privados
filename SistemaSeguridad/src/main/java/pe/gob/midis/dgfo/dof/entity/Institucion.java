package pe.gob.midis.dgfo.dof.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the institucion database table.
 * 
 */
@Entity
@NamedQuery(name="Institucion.findAll", query="SELECT i FROM Institucion i")
public class Institucion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idInstitucion;

	private String descripcionInstitucion;

	//bi-directional many-to-one association to Direccion
	@OneToMany(mappedBy="institucion")
	private List<Direccion> direccions;

	//bi-directional many-to-one association to Unidadnegocio
	@OneToMany(mappedBy="institucion")
	private List<UnidadNegocio> unidadnegocios;

	//bi-directional many-to-one association to Viceministerio
	@OneToMany(mappedBy="institucion")
	private List<ViceMinisterio> viceministerios;

	public Institucion() {
	}

	public int getIdInstitucion() {
		return this.idInstitucion;
	}

	public void setIdInstitucion(int idInstitucion) {
		this.idInstitucion = idInstitucion;
	}

	public String getDescripcionInstitucion() {
		return this.descripcionInstitucion;
	}

	public void setDescripcionInstitucion(String descripcionInstitucion) {
		this.descripcionInstitucion = descripcionInstitucion;
	}

	public List<Direccion> getDireccions() {
		return this.direccions;
	}

	public void setDireccions(List<Direccion> direccions) {
		this.direccions = direccions;
	}

	public Direccion addDireccion(Direccion direccion) {
		getDireccions().add(direccion);
		direccion.setInstitucion(this);

		return direccion;
	}

	public Direccion removeDireccion(Direccion direccion) {
		getDireccions().remove(direccion);
		direccion.setInstitucion(null);

		return direccion;
	}

	public List<UnidadNegocio> getUnidadnegocios() {
		return this.unidadnegocios;
	}

	public void setUnidadnegocios(List<UnidadNegocio> unidadnegocios) {
		this.unidadnegocios = unidadnegocios;
	}

	public UnidadNegocio addUnidadnegocio(UnidadNegocio unidadnegocio) {
		getUnidadnegocios().add(unidadnegocio);
		unidadnegocio.setInstitucion(this);

		return unidadnegocio;
	}

	public UnidadNegocio removeUnidadnegocio(UnidadNegocio unidadnegocio) {
		getUnidadnegocios().remove(unidadnegocio);
		unidadnegocio.setInstitucion(null);

		return unidadnegocio;
	}

	public List<ViceMinisterio> getViceministerios() {
		return this.viceministerios;
	}

	public void setViceministerios(List<ViceMinisterio> viceministerios) {
		this.viceministerios = viceministerios;
	}

	public ViceMinisterio addViceministerio(ViceMinisterio viceministerio) {
		getViceministerios().add(viceministerio);
		viceministerio.setInstitucion(this);

		return viceministerio;
	}

	public ViceMinisterio removeViceministerio(ViceMinisterio viceministerio) {
		getViceministerios().remove(viceministerio);
		viceministerio.setInstitucion(null);

		return viceministerio;
	}

}