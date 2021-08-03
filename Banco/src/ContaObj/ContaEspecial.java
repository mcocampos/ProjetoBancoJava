package ContaObj;

public class ContaEspecial extends Conta {
	private Double Limite;

	public Double getLimite() {
		return Limite;
	}

	public void setLimite(Double limite) {
		Limite = limite;
	}
	
	protected Boolean TemSaldo() 
	{
		return false;
	}
	
	public void AbrirConta() {
		
	}

}
