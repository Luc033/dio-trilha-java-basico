//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("lucas", 1234);
        agendaContatos.adicionarContato("lucas", 4444);
        agendaContatos.adicionarContato("joao", 1122);
        agendaContatos.adicionarContato("davi", 4433);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("joao");
        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("davi"));
    }
}