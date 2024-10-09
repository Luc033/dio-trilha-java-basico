import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaTarefas{
    private List<Tarefa> tarefaList;

    public ListaTarefas(){
        this.tarefaList = new ArrayList<>();
    }
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao, tarefaList.size() + 1));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> tarefaRemover = new ArrayList<>();
        if(!tarefaList.isEmpty()) {
            for (Tarefa t : tarefaList) {
                if(t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaRemover.add(t);
                }
            }
            System.out.println("> Tarefa removida: " + tarefaRemover);
            tarefaList.removeAll(tarefaRemover);
        }else{
            throw new RuntimeException("> Lista vazia");
        }
    }
    public void exibirTarefa(){
        System.out.println("""
________________
 T-A-R-E-F-A-S
""");
        System.out.println(tarefaList);
        System.out.println("________________");
    }

    public List<Tarefa> ordenarLista(){
        List<Tarefa> listaOrdernar = new ArrayList<>(tarefaList);
        listaOrdernar.sort(Collections.reverseOrder());
        return listaOrdernar;
    }
}
