/**
 * 
 */
package br.com.dbserve.teste.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author douglasfs
 *
 */

@Entity
@Table(name="TB_CLASSIFICACAO")
public class Classificacao implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	@Column(name="RESTUARANTE", nullable=false)
	private String restuarante;
	
	@Column(name="NOTA", nullable=false)
	private Integer nota;
	
	@Column(name="USUARIO", nullable=false)
	private String usuario;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRestuarante() {
		return restuarante;
	}

	public void setRestuarante(String restuarante) {
		this.restuarante = restuarante;
	}

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}
