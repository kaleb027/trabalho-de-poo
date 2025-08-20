public class Livro {
    String titulo;
    String autor;
    double preco;
    void exibirInfo() {
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", Preço: R$" + preco);
    }

    void aplicarDesconto(double percentual) {
        preco = preco - (preco * percentual / 100);
        System.out.println("Novo preço com desconto: R$" + preco);
    }
}
