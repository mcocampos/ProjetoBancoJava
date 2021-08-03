package ContaObj;

import PessoaObj.Pessoa;

public class Conta {
	private Pessoa Cliente;
	private int NumeroConta;
	private Double Saldo;
	
	public Pessoa getCliente() {
		return Cliente;
	}
	public void setCliente(Pessoa cliente) {
		Cliente = cliente;
	}
	public int getNumeroConta() {
		return NumeroConta;
	}
	public void NumeroConta(int numeroConta) {
		NumeroConta = numeroConta;
	}
	public Double getSaldo() {
		return Saldo;
	}
	public void setSaldo(Double saldo) {
		Saldo = saldo;
	}

}
