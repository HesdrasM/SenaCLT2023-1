package Model;

public class Fornecedor {
	private String CNPJ;
	private String Telefone;
	private String Nome;
	
	public Fornecedor() {
		super();
	}
		
	public Fornecedor(String CNPJ, String Telefone, String Nome) {
		super();
		this.CNPJ = CNPJ;
		this.Telefone = Telefone;
		this.Nome = Nome;
		
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCNPJ() {
		return CNPJ;
	}
	
}
