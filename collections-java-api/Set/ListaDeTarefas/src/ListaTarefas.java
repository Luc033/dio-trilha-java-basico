import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }
    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(true, descricao));
    }
    public void removerTarefa(String descricao){
        Tarefa tarefaApagar = null;
        if(!tarefaSet.isEmpty()){
            for(Tarefa t : tarefaSet){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaApagar = t;
                    System.out.println("Removendo tarefa: " + tarefaApagar);
                    break;
                }
            }
            tarefaSet.remove(tarefaApagar);
        }
    }
    public void exibirTarefas(){
        if(!tarefaSet.isEmpty()) {
            System.out.println(tarefaSet);
        }else{
            System.out.println("Lista de tarefas vazia.");
        }
    }
    public int contarTarefas(){
        return tarefaSet.size();
    }
    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefaConcluida = new HashSet<>();
        for(Tarefa t : tarefaSet){
            if(!t.isPendente()){
                tarefaConcluida.add(t);
            }
        }
        return tarefaConcluida;
    }
    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefaPendente = new HashSet<>();
        for(Tarefa t : tarefaSet){
            if(t.isPendente()){
                tarefaPendente.add(t);
            }
        }
        return tarefaPendente;
    }
    public void marcarTarefaConcluida(String descricao){
        boolean verificaPesquisa = false;
        Tarefa tarefa = null;
        for(Tarefa t : tarefaSet){
            if (t.getDescricao().equalsIgnoreCase(descricao) && t.isPendente()){
                t.setPendente(false);
                tarefa = t;
                System.out.println("Tarefa concluída: " + t.getDescricao());
                verificaPesquisa = true;
                break;
            }else if (t.getDescricao().equalsIgnoreCase(descricao) && !t.isPendente()) {
                System.out.println("Tarefa já foi concluída");
            }
        }
        if (!verificaPesquisa){
            System.out.println("Tarefa não encontrada.");
        }
    }
    public void marcarTarefaPendente(String descricao){
        boolean verificaPesquisa = false;
        Tarefa tarefa = null;
        for(Tarefa t : tarefaSet){
            if (t.getDescricao().equalsIgnoreCase(descricao) && !t.isPendente()){
                t.setPendente(true);
                tarefa = t;
                System.out.println("Tarefa pendente: " + t.getDescricao());
                verificaPesquisa = true;
                break;
            }else if (t.getDescricao().equalsIgnoreCase(descricao) && t.isPendente()) {
                System.out.println("Tarefa já está pendente.");
            }
        }
        if (!verificaPesquisa){
            System.out.println("Tarefa não encontrada.");
        }
    }

    public void limparListaTarefas(){
        Set<Tarefa> tarefasParaRemover = new HashSet<>();
        if(!tarefaSet.isEmpty()){
            for (Tarefa t : tarefaSet){
                tarefasParaRemover.add(t);
            }
            System.out.println("Todas as tarefas removidas.");
            tarefaSet.removeAll(tarefasParaRemover);
            exibirTarefas();
        }
    }
}
