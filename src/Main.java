import  java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n====== MENU ESTOQUE ======");
            System.out.println("1. Cadastrar produto");
            System.out.println("2. Listar produtos");
            System.out.println("3. Atualizar estoque");
            System.out.println("0. Sair...");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.println("Código do produto: ");
                    int codigo = scanner.nextInt();
                    System.out.println("Preço do Produto: ");
                    double preco = scanner.nextDouble();
                    System.out.println("Quantidade inicial: ");
                    int quantidade = scanner.nextInt();

                    Produto novoProduto = new Produto(nome, codigo, preco, quantidade);
                    listaProdutos.add(novoProduto);
                    System.out.println("Produto cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("\nLista de Produtos:");
                    for (Produto p : listaProdutos) {
                        System.out.println(p);
                    }
                    break;

                case 3:
                    System.out.println("Digite o código do produto: ");
                    int codigoBusca = scanner.nextInt();
                    Produto produtoEncontrado = null;

                    for (Produto p : listaProdutos) {
                        if (p.getCodigo() == codigoBusca) {
                            produtoEncontrado = p;
                            break;
                        }
                    }

                    if (produtoEncontrado != null) {
                        System.out.println("1. Adicionar estoque");
                        System.out.println("2. Remover estoque");
                        int acao = scanner.nextInt();
                        System.out.println("Quantidade: ");
                        int qtd = scanner.nextInt();

                        if (acao == 1) {
                            produtoEncontrado.adicionarEstoque(qtd);
                            System.out.println("Estoque atualizado!");
                        } else if (acao == 2) {
                            produtoEncontrado.removerEstoque(qtd);
                        } else {
                            System.out.println("Opção inválida.");
                        }
                    } else {
                        System.out.println(" Produto não encontrado");
                    }
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");

            }
        } while (opcao != 0);

        scanner.close();
    }
}