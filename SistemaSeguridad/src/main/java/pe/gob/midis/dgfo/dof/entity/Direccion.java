package pe.gob.midis.dgfo.dof.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


@Entity(name="direccion")
@Table(name="DIRECCION")
public class Direccion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idDireccion;

	private String descripcionDireccion;

	@ManyToOne
	@JoinColumn(name="idInstitucion")
	private Institucion institucion;

	@ManyToOne
	@JoinColumn(name="idViceMinisterio")
	private ViceMinisterio viceministerio;

	@OneToMany(mappedBy="direccion")
	private List<UnidadNegocio> unidadnegocios;

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

	public ViceMinisterio getViceministerio() {
		return this.viceministerio;
	}

	public void setViceministerio(ViceMinisterio viceministerio) {
		this.viceministerio = viceministerio;
	}

	public List<UnidadNegocio> getUnidadnegocios() {
		return this.unidadnegocios;
	}

	public void setUnidadnegocios(List<UnidadNegocio> unidadnegocios) {
		this.unidadnegocios = unidadnegocios;
	}

	public UnidadNegocio addUnidadnegocio(UnidadNegocio unidadnegocio) {
		getUnidadnegocios().add(unidadnegocio);
		unidadnegocio.setDireccion(this);

		return unidadnegocio;
	}

	public UnidadNegocio removeUnidadnegocio(UnidadNegocio unidadnegocio) {
		getUnidadnegocios().remove(unidadnegocio);
		unidadnegocio.setDireccion(null);

		return unidadnegocio;
	}

}