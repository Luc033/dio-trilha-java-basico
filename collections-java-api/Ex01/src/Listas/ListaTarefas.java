package Listas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefaList;

    public ListaTarefas(){
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        this.tarefaList.add( new Tarefa(descricao));
    }
    public void removerTarefas(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        if(!tarefaList.isEmpty()){
            for(Tarefa t : tarefaList){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefasParaRemover.add(t);
                }
            }
        }else {
            System.out.println("A lista está vazia!");
        }
        tarefaList.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }
    public void obterDescricoesTarefas(){
        if(!tarefaList.isEmpty()){
            System.out.println(tarefaList);
        }else {
            System.out.println("A lista está vazia!");
        }
    }
}
