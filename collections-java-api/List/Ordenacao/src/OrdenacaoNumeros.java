import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros {
    List<Integer> integers;

    public OrdenacaoNumeros() {
        this.integers = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.integers.add(numero);
    }
    public List<Integer> ordenarAscendente(){
        List<Integer> listaAscendente = new ArrayList<>(integers);
        if (!integers.isEmpty()) {
            Collections.sort(listaAscendente);
            return listaAscendente;
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public List<Integer> ordenarDescendente(){
        List<Integer> listaAscendente = new ArrayList<>(integers);
        if (!integers.isEmpty()) {
            listaAscendente.sort(Collections.reverseOrder());
            return listaAscendente;
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
}
