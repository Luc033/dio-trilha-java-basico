package model;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasRemover = new ArrayList<>();
        if (!tarefaList.isEmpty()){

            for(Tarefa t : tarefaList){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefasRemover.add(t);
                }
            }
            System.out.println("Apagando tarefa: " + tarefasRemover);
            tarefaList.removeAll(tarefasRemover);
        }else {
            System.out.println("A lista está vazia.");
        }
    }

    public int obterTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        if (!tarefaList.isEmpty()){
            System.out.println("Tarefas da lista: "
                    + tarefaList +"\n"+
                    "Total: " + obterTotalTarefas());
        }else {
            System.out.println("A lista está vazia.");
        }
    }
}