package br.edu.ifrs.canoas.jee.jpaapp.pojo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import br.edu.ifrs.canoas.jee.jpaapp.pojo.enums.TipoDeQuarto;
import lombok.Data;

/**
 * Entity implementation class for Entity: Quarto
 *
 */
@Entity
@Data
public class Quarto implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String numero;
	
	@Enumerated(EnumType.STRING)
	private TipoDeQuarto tipoDeQuarto;
	
	
	@OneToMany(mappedBy="quarto")	
	private List<Diaria> diarias;
	
	public Quarto() {
		super();
	}
   
}
