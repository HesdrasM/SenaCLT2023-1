package Main;

import Model.ConjuntoProdutos;
import Model.Fornecedor;
import Model.Produto;

public class TesteProduto {

	public static void main(String[] args) {
		
		Fornecedor forn1 = new Fornecedor("1234321", "(81) 00000-0000", "Zé Maria");
		
		Fornecedor forn2 = new Fornecedor("543212345", "(81) 00000-0000", "Cláudio");
		
		Produto produto1 = new Produto(1, "TV LCD", 3500.00f, forn1);
		
		Produto produto2 = new Produto(2, "notebook", 2000.00f ,forn2);
		
		Produto produto3 = new Produto(3, "impressora", 232.00f, forn2);
		
		ConjuntoProdutos conjuntoProdutos = new ConjuntoProdutos();
		
		conjuntoProdutos.inserir(produto1);
		conjuntoProdutos.inserir(produto2);
		conjuntoProdutos.inserir(produto3);
		
		conjuntoProdutos.atualizarPreco(10);
		
		conjuntoProdutos.mostrar();
	}

}