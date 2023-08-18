package Pet.Repository;

import Pet.model.Produto;

public interface PetRepository {

	// CREATE - INCLUIR PRODUTO NO CARRINHO
	public void adicionarProduto(Produto produto);

	// READ - LER UM/MUITOS PRODUTO DO CARRINHO
	public void listarProdutos();

	// UPDATE ATUALIZAR O ITEM DO CARRINHO
	public void atualizarProduto(Produto produto);

	// DELETE APAGAR O ITEM DO CARRINHO
	public void deletarCompra(int id);

}
