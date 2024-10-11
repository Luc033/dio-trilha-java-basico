import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2024,10, 18), "Evento1","Atração1");
        agendaEventos.adicionarEvento(LocalDate.of(2024,10, 15), "Evento2","Atração2");
        agendaEventos.adicionarEvento(LocalDate.of(2024,10, 13), "Evento3","Atração3");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}