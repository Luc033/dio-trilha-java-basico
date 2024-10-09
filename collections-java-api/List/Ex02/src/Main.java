public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // ADICIONANDO ITENS NO CARRINHO
        carrinhoDeCompras.adicionarItem("arroz",59.90, 10);
        carrinhoDeCompras.tamanho();

        // CALCULANDO ITENS DO CARRINHO
        System.out.println(carrinhoDeCompras.calcularValorTotal());

        // REMOVENDO ITENS DO CARRINHO
        carrinhoDeCompras.removerItem("arroz");
        carrinhoDeCompras.tamanho();
    }
}
