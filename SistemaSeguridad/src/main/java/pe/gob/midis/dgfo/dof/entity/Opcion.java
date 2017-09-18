package pe.gob.midis.dgfo.dof.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="OPCION")
public class Opcion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idOpcion;

	private String descripcionOpcion;

	//bi-directional many-to-one association to Menu
	@ManyToOne
	@JoinColumn(name="idMenu")
	private Menu menu;

	//bi-directional many-to-one association to Permiso
	@OneToMany(mappedBy="opcion")
	private List<Permiso> permisos;

	public Opcion() {
	}

	public int getIdOpcion() {
		return this.idOpcion;
	}

	public void setIdOpcion(int idOpcion) {
		this.idOpcion = idOpcion;
	}

	public String getDescripcionOpcion() {
		return this.descripcionOpcion;
	}

	public void setDescripcionOpcion(String descripcionOpcion) {
		this.descripcionOpcion = descripcionOpcion;
	}

	public Menu getMenu() {
		return this.menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public List<Permiso> getPermisos() {
		return this.permisos;
	}

	public void setPermisos(List<Permiso> permisos) {
		this.permisos = permisos;
	}

	public Permiso addPermiso(Permiso permiso) {
		getPermisos().add(permiso);
		permiso.setOpcion(this);

		return permiso;
	}

	public Permiso removePermiso(Permiso permiso) {
		getPermisos().remove(permiso);
		permiso.setOpcion(null);

		return permiso;
	}

}