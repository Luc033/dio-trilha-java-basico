//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.adicionarProduto(1L, "Aço", 45, 5.90);
        estoqueProdutos.adicionarProduto(2L, "Madeira", 40, 80.65);
        estoqueProdutos.adicionarProduto(3L, "Areia", 1, 100.50);
        estoqueProdutos.adicionarProduto(4L, "Cimento", 50, 22.35);
        estoqueProdutos.adicionarProduto(5L, "Tijolo", 55, 11.00);

        estoqueProdutos.exibirProdutos();
        System.out.println("Valor total do estoque: " + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Produto mais barato: "+ estoqueProdutos.obterProdutoMaisBarato());
        System.out.println("Produto mais caro: "+ estoqueProdutos.obterProdutoMaisCaro());
        System.out.println("Produto mais mais: "+ estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());

    }
}