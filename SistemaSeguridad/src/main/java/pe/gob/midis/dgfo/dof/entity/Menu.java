package pe.gob.midis.dgfo.dof.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="MENU")
public class Menu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idMenu;

	private String descripcionMenu;

	@ManyToOne
	@JoinColumn(name="idModulo")
	private Modulo modulo;

	@OneToMany(mappedBy="menu")
	private List<Opcion> opcions;

	public Menu() {
	}

	public int getIdMenu() {
		return this.idMenu;
	}

	public void setIdMenu(int idMenu) {
		this.idMenu = idMenu;
	}

	public String getDescripcionMenu() {
		return this.descripcionMenu;
	}

	public void setDescripcionMenu(String descripcionMenu) {
		this.descripcionMenu = descripcionMenu;
	}

	public Modulo getModulo() {
		return this.modulo;
	}

	public void setModulo(Modulo modulo) {
		this.modulo = modulo;
	}

	public List<Opcion> getOpcions() {
		return this.opcions;
	}

	public void setOpcions(List<Opcion> opcions) {
		this.opcions = opcions;
	}

	public Opcion addOpcion(Opcion opcion) {
		getOpcions().add(opcion);
		opcion.setMenu(this);

		return opcion;
	}

	public Opcion removeOpcion(Opcion opcion) {
		getOpcions().remove(opcion);
		opcion.setMenu(null);

		return opcion;
	}

}