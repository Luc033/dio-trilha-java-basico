import model.ListaTarefas;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Estudar");
        listaTarefas.adicionarTarefa("COMER");
        listaTarefas.obterDescricoesTarefas();
        listaTarefas.removerTarefa("comer");
        listaTarefas.obterDescricoesTarefas();
    }
}