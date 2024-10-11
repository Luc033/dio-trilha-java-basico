import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutos;

    public EstoqueProdutos() {
        this.estoqueProdutos = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutos.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutos);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if (!estoqueProdutos.isEmpty()) {
            for (Produto p : estoqueProdutos.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorValor = Double.MIN_VALUE;
        if (!estoqueProdutos.isEmpty()) {
            for (Produto p : estoqueProdutos.values()) {
                if (p.getPreco() > maiorValor) {
                    produtoMaisCaro = p;
                    maiorValor = p.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorValor = Double.MAX_VALUE;
        if (!estoqueProdutos.isEmpty()) {
            for (Produto p : estoqueProdutos.values()) {
                if (p.getPreco() < menorValor) {
                    produtoMaisBarato = p;
                    menorValor = p.getPreco();
                }
            }
            return produtoMaisBarato;
        } else {
            throw new RuntimeException("Map vazio");
        }
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaisMais = null;
        double estoqueMaisMais = Double.MIN_VALUE;
        if (!estoqueProdutos.isEmpty()) {
            for (Produto p : estoqueProdutos.values()) {
                if ((p.getPreco() * p.getQuantidade()) > estoqueMaisMais) {
                    produtoMaisMais = p;
                    estoqueMaisMais = p.getPreco() * p.getQuantidade();
                }
            }
            return produtoMaisMais;
        } else {
            throw new RuntimeException("Map vazio");
        }
    }
}