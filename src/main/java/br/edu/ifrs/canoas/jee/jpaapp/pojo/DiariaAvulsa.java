package br.edu.ifrs.canoas.jee.jpaapp.pojo;

import br.edu.ifrs.canoas.jee.jpaapp.pojo.Diaria;
import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: DiariaAvulsa
 *
 */
@Entity
@DiscriminatorValue("A")
@Data
public class DiariaAvulsa extends Diaria implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name="pessoa_id")
	private Pessoa cliente;
	
	public DiariaAvulsa() {
		super();
	}
   
}
