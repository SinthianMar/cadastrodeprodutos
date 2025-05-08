public class Produto {
    private String nome;
    private int codigo;
    private double preco;
    private int quantidade;

    public Produto(String nome, int codigo, double preco, int quantidade){
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void adicionarEstoque(int quantidade){
        this.quantidade += quantidade;
    }

    public void removerEstoque(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Quantidade insuficiente em estoque.");
        }
    }

    public String toString() {
        return "Código: " + codigo + " | Nome: " + nome + " | Preço: R$ " + preco + " | Quantidade: " + quantidade;
    }
}
