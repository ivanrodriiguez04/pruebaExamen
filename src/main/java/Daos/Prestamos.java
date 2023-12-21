package Daos;

import jakarta.persistence.*;

@Entity
@Table(name = "prestamos", schema="esqExaDos")
public class Prestamos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Prestamo", nullable = false)
	private long id_Prestamo;
	
	@Column(name="cantidadVajilla")
	private int cantidadVajilla;
	
	@ManyToMany
	@JoinColumn(name = "id_Vajilla")
	Vajillas vajilla;
	
	@ManyToOne
	@JoinColumn(name = "id_Reserva")
	Reservas reserva;

	//Constructores
	public Prestamos(long id_Prestamo, int cantidadVajilla, Vajillas vajilla, Reservas reserva) {
		super();
		this.id_Prestamo = id_Prestamo;
		this.cantidadVajilla = cantidadVajilla;
		this.vajilla = vajilla;
		this.reserva = reserva;
	}

	
}
