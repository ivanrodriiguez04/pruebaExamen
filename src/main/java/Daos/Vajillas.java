package Daos;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "vajillas", schema="esqExaDos")
public class Vajillas {
	
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Vajilla", nullable = false)
	private long id_Vajilla;
	
	@Column(name = "codigo_Vajilla")
	private String codigo_Vajilla="aaaaa";
	
	@Column(name = "nombre_Vajilla")
	private String nombre_Vajilla="aaaaa";
	
	@Column(name = "descripcion_Vajilla")
	private String descripcion_Vajilla="aaaaa";
	
	@Column(name = "cantidad_Vajilla")
	private int cantidad_Vajilla=0;
	
	@OneToMany(mappedBy="vajilla")
	List<Prestamos> listaPrestamos;
	

	//Getters & Setters
	public long getId_Vajilla() {
		return id_Vajilla;
	}

	public void setId_Vajilla(long id_Vajilla) {
		this.id_Vajilla = id_Vajilla;
	}

	public String getCodigo_Vajilla() {
		return codigo_Vajilla;
	}

	public void setCodigo_Vajilla(String codigo_Vajilla) {
		this.codigo_Vajilla = codigo_Vajilla;
	}

	public String getNombre_Vajilla() {
		return nombre_Vajilla;
	}

	public void setNombre_Vajilla(String nombre_Vajilla) {
		this.nombre_Vajilla = nombre_Vajilla;
	}

	public String getDescripcion_Vajilla() {
		return descripcion_Vajilla;
	}

	public void setDescripcion_Vajilla(String descripcion_Vajilla) {
		this.descripcion_Vajilla = descripcion_Vajilla;
	}

	public int getCantidad_Vajilla() {
		return cantidad_Vajilla;
	}

	public void setCantidad_Vajilla(int cantidad_Vajilla) {
		this.cantidad_Vajilla = cantidad_Vajilla;
	}
	
	//Constructores
	public Vajillas(long id_Vajilla, String codigo_Vajilla, String nombre_Vajilla, String descripcion_Vajilla,
			int cantidad_Vajilla, List<Prestamos> listaPrestamos) {
		super();
		this.id_Vajilla = id_Vajilla;
		this.codigo_Vajilla = codigo_Vajilla;
		this.nombre_Vajilla = nombre_Vajilla;
		this.descripcion_Vajilla = descripcion_Vajilla;
		this.cantidad_Vajilla = cantidad_Vajilla;
		this.listaPrestamos = listaPrestamos;
	}
}
