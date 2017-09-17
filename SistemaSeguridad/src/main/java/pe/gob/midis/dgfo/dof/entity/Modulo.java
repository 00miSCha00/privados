package pe.gob.midis.dgfo.dof.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the modulo database table.
 * 
 */
@Entity
@NamedQuery(name="Modulo.findAll", query="SELECT m FROM Modulo m")
public class Modulo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idModulo;

	private String descripcionModulo;

	//bi-directional many-to-one association to Menu
	@OneToMany(mappedBy="modulo")
	private List<Menu> menus;

	//bi-directional many-to-one association to Sistema
	@ManyToOne
	@JoinColumn(name="idSistema")
	private Sistema sistema;

	public Modulo() {
	}

	public int getIdModulo() {
		return this.idModulo;
	}

	public void setIdModulo(int idModulo) {
		this.idModulo = idModulo;
	}

	public String getDescripcionModulo() {
		return this.descripcionModulo;
	}

	public void setDescripcionModulo(String descripcionModulo) {
		this.descripcionModulo = descripcionModulo;
	}

	public List<Menu> getMenus() {
		return this.menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

	public Menu addMenus(Menu menus) {
		getMenus().add(menus);
		menus.setModulo(this);

		return menus;
	}

	public Menu removeMenus(Menu menus) {
		getMenus().remove(menus);
		menus.setModulo(null);

		return menus;
	}

	public Sistema getSistema() {
		return this.sistema;
	}

	public void setSistema(Sistema sistema) {
		this.sistema = sistema;
	}

}