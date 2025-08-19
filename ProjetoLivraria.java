public class ProjetoLivraria {
    private String titulo;
    private String autor;
    private double preco;
    private int quantidadeEstoque;
    
    public ProjetoLivraria(String titulo, String autor, double preco, int quantidadeEstoque) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }
    public void exibirDetalhes() {
        System.out.println("Detalhes do Livro:");
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Preço: R$" + this.preco);
        System.out.println("Estoque: " + this.quantidadeEstoque + " unidades");
    }

    public void atualizarPreco(double novoPreco) {
        this.preco = novoPreco;
        System.out.println("Preço atualizado para R$" + this.preco);
    }

    public void reporEstoque(int quantidade) {
        this.quantidadeEstoque += quantidade;
        System.out.println("Estoque atualizado: " + this.quantidadeEstoque + " unidades");
    }

    public void vender(int quantidade) {
        if (quantidade <= this.quantidadeEstoque) {
            this.quantidadeEstoque -= quantidade;
            double total = quantidade * this.preco;
            System.out.println("Venda realizada: " + quantidade + " unidades");
            System.out.println("Total: R$" + total);
        } else {
            System.out.println("Estoque insuficiente para essa venda");
        }
    }

    public static void main(String[] args) {
        ProjetoLivraria livro1 = new ProjetoLivraria("Dom Casmurro", "Machado de Assis", 49.90, 30);
        ProjetoLivraria livro2 = new ProjetoLivraria("O Cortiço", "Aluísio Azevedo", 39.50, 15);

        System.out.println("\n--- Alterando atributos ---");
        livro1.atualizarPreco(54.90);
        livro2.reporEstoque(10);

        System.out.println("\n--- Exibindo detalhes ---");
        livro1.exibirDetalhes();
        System.out.println();
        livro2.exibirDetalhes();

        System.out.println("\n--- Realizando vendas ---");
        livro1.vender(3);
        livro2.vender(20);
    }
}
