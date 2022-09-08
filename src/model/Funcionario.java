package model;

public abstract class Funcionario {
	protected String nome;

	// as classes abstratas me permitem criar as cláusulas contratuais para
	// as subclasses se comprometam a implementar

	public Funcionario(String nome, int numeroRegistro) {
		super();
		this.nome = nome;
		this.numeroRegistro = numeroRegistro;
	}

	protected int numeroRegistro;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	public abstract double calcularSalario();
}
