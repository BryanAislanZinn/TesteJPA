package br.edu.ifrs.canoas.jee.jpaapp.pojo;

import br.edu.ifrs.canoas.jee.jpaapp.pojo.Diaria;
import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: DiariaReservada
 *
 */
@Entity
@DiscriminatorValue("R")
@Data
public class DiariaReservada extends Diaria implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name="reserva_id")
	private Reserva reserva;
	
	public DiariaReservada() {
		super();
	}
   
}
