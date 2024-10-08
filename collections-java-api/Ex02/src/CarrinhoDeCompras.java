import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> itemList;

    public CarrinhoDeCompras(){
        itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemsDeletar = new ArrayList<>();
        if(!itemList.isEmpty()){
            for(Item i : itemList){
                if (i.getNome().equalsIgnoreCase(nome)){
                    itemsDeletar.add(i);
                }
            }
            System.out.println("Itens removidos:");
            itemsDeletar.forEach(System.out::println);
            itemList.removeAll(itemsDeletar);
        }else{
            System.out.println("Carrinho vazio.");
        }
    }
    public double calcularValorTotal(){
        System.out.println("Valor total do carrinho:");
        double valorTotal = 0;
        double valorItem = 0;
        if(!itemList.isEmpty()) {
            for (Item i : itemList) {
                valorItem = i.getPreco() * i.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        }else{
            throw new RuntimeException("Lista vazia");
        }
    }

    public void exibirItens(){
        if(!itemList.isEmpty()) {
            System.out.println(this.itemList);
        }else{
            System.out.println("Lista vazia");
        }
    }

    public void tamanho(){
        System.out.println(itemList.size());
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itens=" + itemList +
                '}';
    }
}