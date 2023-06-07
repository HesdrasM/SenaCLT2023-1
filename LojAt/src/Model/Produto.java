package Model;

public class Produto {
	private int codigo;
	private String nome;
	private float valor;
	private Fornecedor fornecedor;
	
	public Produto() {
		super();
	}
	
	public Produto(int codigo, String nome, float valor, Fornecedor fornecedor) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
		this.fornecedor = fornecedor;
	}

	public boolean atualizarPreco(float aumento) {
		if(aumento >= 0 ) {
			this.valor = ((aumento*valor) / 100 ) + this.valor;
			return  true;
		}else {
		return false;
		}
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public int getCodigo() {
		return codigo;
	}
}


