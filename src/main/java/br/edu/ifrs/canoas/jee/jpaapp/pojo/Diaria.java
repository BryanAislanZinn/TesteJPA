package br.edu.ifrs.canoas.jee.jpaapp.pojo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.Data;
import java.util.Date;

/**
 * Entity implementation class for Entity: Diaria
 *
 */
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Entity
@DiscriminatorColumn(name = "Tipo_Diaria")
@Data
public class Diaria implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Date data;
	
	@ManyToMany(mappedBy="diarias")
	private List<PessoaFisica> hospedes;
	
	@ManyToOne
	@JoinColumn(name="quarto_id")
	private Quarto quarto;
	
	public Diaria() {
		super();
	}
   
}
