package model;

public class Comissionado extends Funcionario{
	protected double salarioBase;
	protected double comissao;
	
	public Comissionado(String nome, int numeroRegistro, double salarioBase, double comissao) {
		super(nome, numeroRegistro);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}

	public double getSalarioBase() {
		return salarioBase;
	}
	
	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public double getComissaoDouble() {
		return comissao;
	}
	public void setComissaoDouble(double comissaoDouble) {
		this.comissao = comissaoDouble;
	}

	@Override
	public double calcularSalario() {
		return salarioBase + (salarioBase * (comissao/100));		
	}
	
	
}
