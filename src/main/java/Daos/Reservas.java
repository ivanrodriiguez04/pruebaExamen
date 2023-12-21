package Daos;

import java.util.Calendar;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "reservas", schema="esqExaDos")
public class Reservas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Reserva", nullable = false)
	private long id_Reserva;
	
	@Column(name = "fch_Reserva")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fchReserva;

	@OneToMany(mappedBy="reserva")
	List<Prestamos> listaReserva;
	
	//Getters & Setters
	public long getId_Reserva() {
		return id_Reserva;
	}

	public void setId_Reserva(long id_Reserva) {
		this.id_Reserva = id_Reserva;
	}

	public Calendar getFchReserva() {
		return fchReserva;
	}

	public void setFchReserva(Calendar fchReserva) {
		this.fchReserva = fchReserva;
	}

	//Constructores
	public Reservas(long id_Reserva, Calendar fchReserva) {
		super();
		this.id_Reserva = id_Reserva;
		this.fchReserva = fchReserva;
	}

	public Reservas() {
		super();
		// TODO Auto-generated constructor stub
	}
}
