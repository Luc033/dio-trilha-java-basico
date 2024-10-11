import java.util.HashMap;
import java.util.Map;


public class ContagemPalavras {
    private Map<String, Integer> contagemPalavras;

    public ContagemPalavras() {
        this.contagemPalavras = new HashMap<>();
    }
    public void adicionarPalavra(String palavra, Integer contagem){
        this.contagemPalavras.put(palavra, contagem);
    }
    public void removerPalavra(String palavra){
        if(!contagemPalavras.isEmpty()){
            contagemPalavras.remove(palavra);
        }
    }
    public void exibirContagemPalavras(){
        System.out.println(contagemPalavras);
    }
    public String encontrarPalavraMaisFrequente() {
        String linguagemMaisFrequente = null;
        int maiorContagem = 0;
        if (!contagemPalavras.isEmpty()) {
            for (Map.Entry<String, Integer> entry : contagemPalavras.entrySet()) {
                if (entry.getValue() > maiorContagem) {
                    maiorContagem = entry.getValue();
                    linguagemMaisFrequente = entry.getKey();
                }
            }
            return linguagemMaisFrequente;
        } else {
            throw new RuntimeException("Map vazio");
        }
    }
}
