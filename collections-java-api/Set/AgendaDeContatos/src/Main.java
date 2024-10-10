//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       AgendaContatos agendaContatos = new AgendaContatos();
       agendaContatos.adicionarContato("Jorge", 1234);
       agendaContatos.atualizarNumeroContato("Jorge", 4321);
       agendaContatos.exibirContatos();
    }
}



