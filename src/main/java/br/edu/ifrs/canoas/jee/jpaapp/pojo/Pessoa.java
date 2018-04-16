
package br.edu.ifrs.canoas.jee.jpaapp.pojo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.Data;

/**
 * Entity implementation class for Entity: Pessoa
 *
 */

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Entity
@DiscriminatorColumn(name = "Tipo_Pessoa")
@Data
public abstract class Pessoa implements Serializable {


	private static final long serialVersionUID = 1L;
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long id;
	
	private String nome;
	private String telefone;
	private String email;
	
	@OneToMany(mappedBy="cliente")
	private List<Reserva> reservas;
	
	@OneToMany(mappedBy="cliente")
	private List<DiariaAvulsa> diariasAvulsas;
	
	@OneToOne
	@JoinColumn(name="endereco_id")
	private Endereco endereco;

	public Pessoa() {
		super();
	}
   
}
