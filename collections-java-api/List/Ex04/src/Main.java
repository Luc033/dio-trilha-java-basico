//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa("Comer");
        listaTarefas.adicionarTarefa("Cagar");
        listaTarefas.adicionarTarefa("Beber");
        listaTarefas.adicionarTarefa("JOgar");
        listaTarefas.adicionarTarefa("Dormir");

        listaTarefas.exibirTarefa();

        listaTarefas.removerTarefa("Cagar");

        listaTarefas.exibirTarefa();

        System.out.println(listaTarefas.ordenarLista());
    }
}