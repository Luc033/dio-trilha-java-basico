//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando tarefas
        listaTarefas.adicionarTarefa("estudar");
        listaTarefas.adicionarTarefa("comer");
        listaTarefas.adicionarTarefa("jogar");
        listaTarefas.adicionarTarefa("treinar");
        listaTarefas.adicionarTarefa("viajar");
        listaTarefas.exibirTarefas();
        System.out.println("Total: " + listaTarefas.contarTarefas());

//        // Removendo tarefas específicas
//        listaTarefas.removerTarefa("estudar");
//        listaTarefas.exibirTarefas();
//
//        // Tarefa duplicada
//        listaTarefas.adicionarTarefa("viajar");
//        listaTarefas.exibirTarefas();
//
//
        // Tarefa concluída
        listaTarefas.marcarTarefaConcluida("comer");
        System.out.println("Tarefas concluídas: " + listaTarefas.obterTarefasConcluidas());
        System.out.println("Total: " + listaTarefas.contarTarefas());
//
//
        // Tarefa pendente
        listaTarefas.marcarTarefaPendente("comer");
        System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendentes());
        listaTarefas.exibirTarefas();
        System.out.println("Total: " + listaTarefas.contarTarefas());
//
//        // Retornando tarefas concluídas
//        System.out.println("Tarefas concluídas:\n" + listaTarefas.obterTarefasConcluidas());
//        System.out.println("Tarefas pendentes:\n" + listaTarefas.obterTarefasPendentes());
//
        listaTarefas.limparListaTarefas();



    }
}