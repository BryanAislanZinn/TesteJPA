package br.edu.ifrs.canoas.jee.jpaapp.pojo;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;

/**
 * Entity implementation class for Entity: Endereco
 *
 */
@Entity
@Data
public class Endereco implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String logradouro;
	private Integer numero;
	private String complemento;
	private String cep;
	
	@OneToOne(mappedBy="endereco")
	private Pessoa pessoa;
	
}
