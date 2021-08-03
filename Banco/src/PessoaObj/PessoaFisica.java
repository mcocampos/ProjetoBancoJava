package PessoaObj;

import java.util.Date;

public class PessoaFisica extends Pessoa {
	
	private int Cpf;
	private Date DataDeNascimento;
	private String Genero;
	
	public int getCpf() {
		return Cpf;
	}
	public void setCpf(int cpf) {
		Cpf = cpf;
	}
	public Date getDataDeNascimento() {
		return DataDeNascimento;
	}
	public void setDataDeNascimento(Date dataDeNascimento) {
		DataDeNascimento = dataDeNascimento;
	}
	public String getGenero() {
		return Genero;
	}
	public void setGenero(String genero) {
		Genero = genero;
	}
	
	public int getIdade(Date dataDeNascimento) 
	{
		return 1;
	}
	

}
