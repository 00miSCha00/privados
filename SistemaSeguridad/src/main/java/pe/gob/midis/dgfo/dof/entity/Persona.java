package pe.gob.midis.dgfo.dof.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the persona database table.
 * 
 */
@Entity
@NamedQuery(name="Persona.findAll", query="SELECT p FROM Persona p")
public class Persona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idPersona;

	private String descripcionPersona;

	//bi-directional many-to-one association to Personal
	@OneToMany(mappedBy="persona")
	private List<Personal> personals;

	public Persona() {
	}

	public int getIdPersona() {
		return this.idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getDescripcionPersona() {
		return this.descripcionPersona;
	}

	public void setDescripcionPersona(String descripcionPersona) {
		this.descripcionPersona = descripcionPersona;
	}

	public List<Personal> getPersonals() {
		return this.personals;
	}

	public void setPersonals(List<Personal> personals) {
		this.personals = personals;
	}

	public Personal addPersonal(Personal personal) {
		getPersonals().add(personal);
		personal.setPersona(this);

		return personal;
	}

	public Personal removePersonal(Personal personal) {
		getPersonals().remove(personal);
		personal.setPersona(null);

		return personal;
	}

}