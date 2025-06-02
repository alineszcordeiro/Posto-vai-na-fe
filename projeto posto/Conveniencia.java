package ProjetoPosto;

import java.util.ArrayList;
import java.util.List;

public class Conveniencia {
	
	private List<Produto> produtos = new ArrayList<>();
	
	public void adicionarProduto(Produto p) {
		produtos.add(p);
		
	}
	
	public List<Produto> getProdutos() {
        return produtos;
    }

    public Produto getProdutoPorIndice(int indice) {
        if (indice >= 0 && indice < produtos.size()) {
            return produtos.get(indice);
        }
        return null;
    }
}