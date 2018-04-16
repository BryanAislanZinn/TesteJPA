package br.edu.ifrs.canoas.jee.jpaapp.pojo;

import br.edu.ifrs.canoas.jee.jpaapp.pojo.Pessoa;
import lombok.Data;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: PessoaJuridica
 *
 */
@Entity
@DiscriminatorValue("PJ")
@Data
public class PessoaJuridica extends Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String razaoSocial;
	private String cnpj;
	private String inscricaoEstadual;
	private String inscricaoMunicipal;
	
	public PessoaJuridica() {
		super();
	}
   
}
