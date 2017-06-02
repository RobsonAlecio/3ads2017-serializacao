package minha.serializacao.legal;

import java.io.Serializable;
import java.util.Date;

public class ClasseSerializavel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	private Date momentoCriacao;
	private Long tempoDeVida;
	
	public ClasseSerializavel(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
		momentoCriacao = new Date();
		tempoDeVida = 30L;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Date getMomentoCriacao() {
		return momentoCriacao;
	}

	public long getTempoDeVida() {
		return tempoDeVida;
	}

	@Override
	public String toString() {
		return "ClasseSerializavel [id=" + id + ", nome=" + nome
				+ ", momentoCriacao=" + momentoCriacao + ", tempoDeVida="
				+ tempoDeVida + "]";
	}
	
}
