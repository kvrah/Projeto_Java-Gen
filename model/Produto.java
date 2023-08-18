package Pet.model;

public class Produto {

	private int cod;
	private String nome;
	private float preco;
	private int quantidade;

	public Produto(int cod, String nome, float preco, int quantidade) {
		this.cod = cod;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void visualizar() {
		System.out.println("\n O produto " + this.getCod() + " com valor: " + this.getPreco() + " foi adicioado com sucesso!"
				+ this.calcularTotal());
	}

	public float calcularTotal() {
		return preco * quantidade;
	}

}
