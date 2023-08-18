package Pet.Controller;

import java.util.ArrayList;

import Pet.Repository.PetRepository;
import Pet.model.Produto;

public class PetController implements PetRepository {

	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	// ArrayList<Produto>

	@Override
	public void adicionarProduto(Produto produto) {
		int cod = 0;

		for (Produto prod : listaProdutos) {
			cod = prod.getCod();
		}
		produto.setCod(cod + 1);
		listaProdutos.add(produto);
	}

	@Override
	public void listarProdutos() {
		for (var produto : listaProdutos) {
			produto.visualizar();
		}
	}

	@Override
	public void atualizarProduto(Produto produtoAtualizado) {
		int id = produtoAtualizado.getCod();
		Produto produtoExistente = buscarNaCollection(id);
		if (produtoExistente != null) {
			int index = listaProdutos.indexOf(produtoExistente);
			listaProdutos.set(index, produtoAtualizado);
			System.out.println("\n O produto de ID " + id + " foi atualizado com sucesso");
		} else {
			System.out.println("\n O produto de ID " + id + " não foi encontrado para atualização");
		}
	}

	@Override
	public void deletarCompra(int id) {
		var produto = buscarNaCollection(id);
		int cod = 0;
		if (produto != null) {
			if (listaProdutos.remove(produto) == true)
				System.out.println("\n O produto :" + id + " foi deletado com sucesso");
		} else
			System.out.println("\n O produto numero " + id + " não foi encontrado!");
	}

	public Produto buscarNaCollection(int id) {
		for (var produto : listaProdutos) {
			if (produto.getCod() == id) {
				return produto;
			}
		}
		return null;
	}
}