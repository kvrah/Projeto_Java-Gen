package PetShop;

import java.io.IOException;
import java.util.Scanner;

import Pet.Controller.PetController;
import Pet.model.Produto;
import Pet.util.cores;

public class Menu {

	private static String preco = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PetController petController = new PetController();
		Scanner leia = new Scanner(System.in);

		int opcao, quantidade, produto, pedido = 0, numero;
		float total;

		while (true) {

			System.out.println(cores.TEXT_YELLOW + cores.ANSI_BLACK_BACKGROUND
					+ "*********************************************************");
			System.out.println("                                                         ");
			System.out.println(" #  $$$$$$$\\  $$$$$$\\        $$$$$$$\\ $$$$$$$$\\$$$$$$$$\\ \r\n"
					+ " #  $$  __$$\\$$  __$$\\       $$  __$$\\$$  _____\\__$$  __|\r\n"
					+ " #  $$ |  $$ $$ /  \\__|      $$ |  $$ $$ |        $$ |   \r\n"
					+ " #  $$$$$$$  $$ |            $$$$$$$  $$$$$\\      $$ |   \r\n"
					+ " #  $$  __$$<$$ |            $$  ____/$$  __|     $$ |   \r\n"
					+ " #  $$ |  $$ $$ |  $$\\       $$ |     $$ |        $$ |   \r\n"
					+ " #  $$ |  $$ \\$$$$$$  |      $$ |     $$$$$$$$\\   $$ |   \r\n"
					+ " #  \\__|  \\__|\\______/       \\__|     \\________|  \\__|   \r\n"
					+ " #                                                       \r\n"
					+ " #                                                       \r\n"
					+ " #                                                       ");
			System.out.println("                                                         ");
			System.out.println("*********************************************************");
			System.out.println("                                                         ");
			System.out.println("            1 - Comprar produtos                         ");
			System.out.println("            2 - Consultar carrinho                       ");
			System.out.println("            3 - Alterar produto                          ");
			System.out.println("            4 - Excluir produto                          ");
			System.out.println("            5 - contato                                  ");
			System.out.println("            9 - Sair                                     ");
			System.out.println("                                                         ");
			System.out.println("*********************************************************");
			System.out.println("Entre com a opção desejada:                              ");
			System.out.println("                                                         ");

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println("\nRC Pet Shop Agradece, Volte Sempre!!" + "\r\n" + "    ___\r\n"
						+ " __/_  `.  .-\"\"\"-.\r\n" + " \\_,` | \\-'  /   )`-')\r\n"
						+ "  \"\") `\"`    \\  ((`\"`\r\n" + " ___Y  ,    .'7 /|\r\n" + "(_,___/...-` (_/_/ \r\n" + "");
				leia.close();
				System.exit(0);
			}
			switch (opcao) {
			case 1:
				System.out.println("\n***********************************************");
				System.out.println("Produtos:                                        ");
				System.out.println("\n1 - Arranhador de gato            R$ 40,00     ");
				System.out.println("\n2 - Coleira de gato               R$ 25,00     ");
				System.out.println("\n3 - Cama para cachorro            R$ 45,00     ");
				System.out.println("\n4 - Casinha de madeira            R$ 100,00    ");
				System.out.println("\n5 - Shampoo anti pulga            R$ 30,00     ");
				System.out.println("\n6 - Vermífugo                     R$ 50,00     ");
				System.out.println("\n***********************************************");

				System.out.println("\n Digite o produto: ");
				produto = leia.nextInt();
				System.out.println("\n Digite a quantidade: ");
				quantidade = leia.nextInt();

				switch (produto) {
				case 1:
					preco += quantidade * 40.0f;

					
					petController.adicionarProduto(new Produto(1, " Arranhador de gato ", 40.0f, quantidade));

					System.out.println("\n Arranhador de gato adicionado ");
					break;
				case 2:
					preco += quantidade * 25.0f;

					petController.adicionarProduto(new Produto(2, " coleira de gato ", 25.0f, quantidade));
					System.out.println("\n Coleira de gato adicionada ");
					break;
				case 3:
					preco += quantidade * 45.0f;

					petController.adicionarProduto(new Produto(3, " Cama para cachorro ", 45.0f, quantidade));
					System.out.println("\n Cama para cachorro adicionada ");
					break;
				case 4:
					preco += quantidade * 100.0f;

					petController.adicionarProduto(new Produto(4, " casinha de madeira ", 100.0f, quantidade));
					System.out.println("\n Casinha de Madeira adicionada ");
					break;
				case 5:
					preco += quantidade * 30.0f;

					petController.adicionarProduto(new Produto(5, " Shampoo anti pulga ", 30.0f, quantidade));
					System.out.println("\n Shampoo anti pulga adicionada ");
					break;
				case 6:
					preco += quantidade * 50.0f;

					petController.adicionarProduto(new Produto(6, " Vermifugo ", 50.0f, quantidade));
					System.out.println("\n Vermifugo adicionado ");
					
					break;
				default:

					System.out.println("\n Opção inválida!");
					keyPress();
					break;
				}
			case 2:
				System.out.println("\n Consultar carrinho: ");
				petController.listarProdutos();

				keyPress();
				break;
			case 3:
				System.out.println("\nAlterar Produto: ");

				petController.listarProdutos();

				System.out.println("\n Digite o produto: ");
				produto = leia.nextInt();
				System.out.println("\n Digite a nova quantidade: ");
				quantidade = leia.nextInt();

				var item = petController.buscarNaCollection(produto);


				petController.atualizarProduto(new Produto(item.getCod(), item.getNome(), item.getPreco(), quantidade));

				keyPress();
				break;
			case 4:
				System.out.println("\n Excluir produto: ");
				petController.listarProdutos();
				System.out.println("\n Digite o numero do produto: ");
				numero = leia.nextInt();

				petController.deletarCompra(numero);

				keyPress();
				break;
			case 5:
				System.out.println("\nContato");
				System.out.println("\nCriado por : Richard Campos");
				System.out.println("\n (11)97031-0711");
				System.out.println("\n Linkedin: https://www.linkedin.com/in/richard-campos-b1462b262/");
				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				keyPress();
				break;
			}
		}
	}

	private static void keyPress() {
		try {

			System.out.println(cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}

	private static String nfMoeda(String preco2) {
		// TODO Auto-generated method stub
		return null;
	}
}
