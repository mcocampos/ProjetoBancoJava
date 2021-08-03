package PessoaObj;

public class PessoaJuridica extends Pessoa{
	
	private int Cnpj;
	private String Atividade;
	
	public int getCnpj() {
		return Cnpj;
	}
	public void setCnpj(int cnpj) {
		Cnpj = cnpj;
	}
	public String getAtividade() {
		return Atividade;
	}
	public void setAtividade(String atividade) {
		Atividade = atividade;
	}
	
	

}
