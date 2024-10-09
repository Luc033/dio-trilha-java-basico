import Listas.ListaTarefas;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefa
        ListaTarefas listaTarefa = new ListaTarefas();

        // Adicionando tarefas à lista
        listaTarefa.adicionarTarefa("1");
        listaTarefa.adicionarTarefa("2");
        listaTarefa.adicionarTarefa("3");
        listaTarefa.adicionarTarefa("4");

        // Exibindo o número total de tarefas na lista
        System.out.println("Você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");

        // Exibindo as descrições das tarefas na lista
        listaTarefa.obterDescricoesTarefas();

        // Removendo uma tarefa da lista
        listaTarefa.removerTarefas("2");

        // Exibindo o número total de tarefas na lista após a remoção
        System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");

        // Exibindo as descrições das tarefas atualizadas na lista
        listaTarefa.obterDescricoesTarefas();

        // Removendo uma tarefa da lista quando a lista está vazia
        listaTarefa.removerTarefas("3");
        listaTarefa.removerTarefas("4");

        // Exibindo o número total de tarefas na lista após tentar remover de uma lista vazia
        System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");
        listaTarefa.obterDescricoesTarefas();

    }
}