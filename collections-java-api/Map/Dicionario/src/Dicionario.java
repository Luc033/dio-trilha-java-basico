import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> palavraMap;
    public Dicionario(){
        this.palavraMap = new HashMap<>();
    }
    public void adicionarPalavra(String palavra, String definicao){
        palavraMap.put(palavra, definicao);

    }
    public void removerPalavra(String palavraMap){
        boolean a = false;
        if(!palavraMap.isEmpty()){
            System.out.println("Palavra removida: " + palavraMap);
            this.palavraMap.remove(palavraMap);
            a = true;
        }else if(palavraMap.isEmpty()){
            System.out.println("Map vazio.");
        } else if (!palavraMap.isEmpty() && !a) {
            System.out.println("Palavra não encontrado");
        }
    }
    public void exibirPalavras(){
        System.out.println("Palavras registradas: \n" + palavraMap);
    }
    public void pesquisarPorPalavra(String palavraMap){
        String palavraEncontrada = null;
        if(!palavraMap.isEmpty()){
            palavraEncontrada = this.palavraMap.get(palavraMap);
            System.out.println("Pesquisando por: " + palavraMap);
            System.out.println("Palavra encontrada: " + palavraEncontrada);
        }else if(!palavraMap.isEmpty() && palavraEncontrada == null){
            System.out.println("Palavra não encontrada.");
        }else{
            System.out.println("Map vazio");

        }
    }





//    pesquisarPorPalavra(String palavraMap): Pesquisa uma palavraMap no dicionário e retorna sua definição correspondente.

}
