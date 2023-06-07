package Model;

import java.util.List;
import java.util.ArrayList;

public class ConjuntoProdutos {
	private List<Produto> produtos;
	
	
	public ConjuntoProdutos() {
		super();
		this.produtos = new ArrayList<Produto>();
	}
	
	public void inserir(Produto produto) {
		if(!produtos.contains(produto)) {
			this.produtos.add(produto);
		}
	}
	
	public void remover(Produto produto) {
		produtos.remove(produto);
	}
	
	public void atualizar(Produto produto) {
		int index = produtos.indexOf(produto);
		
		if(index != -1) {
			produtos.set(index, produto);
		}
	}
	
	public void atualizarPreco(float percentual) {
		for(Produto produto : produtos) {
			produto.atualizarPreco(percentual);
		}
	}
	
	public void mostrar() {
		for(Produto produto : produtos) {
			System.out.println(produto.getCodigo() + " - "  + produto.getNome() + " - " + produto.getValor());
		}
	}
	
	public List<Produto> getProdutos(){
		return produtos;
	}
}