package userinterface;

import model.Funcionario;
import model.Chefe;
import model.Horista;
import model.Comissionado;
import model.Empreiteiro;

public class FolhaDePagamento {
	public static void main(String[] args) {
		Funcionario f1, f2, f3, f4;

		f1 = new Chefe("Daniela Cabrera", 12345, 5000.00, 10, 150.00);
		f2 = new Comissionado("Doris Cabrera", 54321, 2500.00, 10);
		f3 = new Horista("Rafale Cabrera", 55441, 100.00, 60);
		f4 = new Empreiteiro("Carlos Cabrera", 44552, 15000.00);

		System.out.println(
				"Nome: " + f1.getNome() + " - Registro: " + f1.getNumeroRegistro() + " - Salario : " + f1.calcularSalario());
		System.out.println(
				"Nome: " + f2.getNome() + " - Registro: " + f2.getNumeroRegistro() + " - Salario : " + f2.calcularSalario());
		System.out.println(
				"Nome: " + f3.getNome() + " - Registro: " + f3.getNumeroRegistro() + " - Salario : " + f3.calcularSalario());
		System.out.println(
				"Nome: " + f4.getNome() + " - Registro: " + f4.getNumeroRegistro() + " - Salario : " + f4.calcularSalario());

	}

}
