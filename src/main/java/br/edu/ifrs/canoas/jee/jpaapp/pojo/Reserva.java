package br.edu.ifrs.canoas.jee.jpaapp.pojo;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;
import java.util.Date;
import java.util.List;

/**
 * Entity implementation class for Entity: Reserva
 *
 */
@Entity
@Data
public class Reserva implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private Date data;
	private Double valor;
	
	@ManyToOne
	@JoinColumn(name="pessoa_id")
	private Pessoa cliente;
	
	@OneToMany(mappedBy="reserva")
	private List<DiariaReservada> diarias;
	
	public Reserva() {
		super();
	}
   
}
