package br.edu.ifrs.canoas.jee.jpaapp.pojo;

import br.edu.ifrs.canoas.jee.jpaapp.pojo.Pessoa;
import br.edu.ifrs.canoas.jee.jpaapp.pojo.enums.Sexo;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: PessoaFisica
 *
 */
@Entity
@DiscriminatorValue("PF")
@Data
public class PessoaFisica extends Pessoa implements Serializable {

	
	private static final long serialVersionUID = 1L;

	private String cpf; 
	private String rg;
	private Date dataNascimento; 
	
	@Enumerated(EnumType.STRING)
	private Sexo sexo;
	
	@ManyToMany
	private List<Diaria> diarias;
	 
	public PessoaFisica() {
		super();
	}
   
}
