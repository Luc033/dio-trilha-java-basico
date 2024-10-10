import java.util.HashSet;
import java.util.Set;

public class PalavrasUnicas {

    private Set<Palavra> palavraSet;

    public PalavrasUnicas(){
        this.palavraSet = new HashSet<>();
    }
    public void adicionarPalavra(String palavra){
        this.palavraSet.add(new Palavra(palavra));
    }
    public void removerPalavra(String palavra){
        Palavra palavrasRemover = null;
        if(!palavraSet.isEmpty()){
            for (Palavra p : palavraSet){
                if(p.getPalavra().equalsIgnoreCase(palavra)){
                    System.out.println("Palavra removida: " + palavra);
                    palavrasRemover = p;
                    break;
                }
            }
            palavraSet.remove(palavrasRemover);
        }else {
            System.out.println("Conjunto vazio");
        }
    }

    public void verificarPalavra(String palavra){
        Palavra palavraVerificada = null;
        boolean n = true;
        for (Palavra p : palavraSet){
            if (p.getPalavra().equalsIgnoreCase(palavra)){
                System.out.printf("A palavra %s já existe no conjunto.", palavra);
                n = false;
            }
        }
        if (n){
            System.out.printf("A palavra %s não existe no conjunto.", palavra);
        }
    }
    public void exibirPalavrasUnicas(){
        System.out.println("Mostrando todas as palavras: \n"+ palavraSet);
    }
}
