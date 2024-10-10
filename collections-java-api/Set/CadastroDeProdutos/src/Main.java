//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        cadastroProduto.adicionarProduto(1, "feijao", 55.5, 10);
        cadastroProduto.adicionarProduto(2, "arroz", 45.5, 20);
        cadastroProduto.adicionarProduto(3, "acucar", 30.5, 15);
        cadastroProduto.adicionarProduto(4, "sal", 67.5, 15);
        cadastroProduto.adicionarProduto(5, "macarrao", 80.5, 5);

        System.out.println("Produtos por nome: " + cadastroProduto.exibirProdutosPorNome());
        System.out.println("Produtos por preço: " + cadastroProduto.exibirProdutosPorPreco());
    }
}