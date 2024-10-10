//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Lucas", 123L, 8.9);
        gerenciadorAlunos.adicionarAluno("João", 234L, 5.5);
        gerenciadorAlunos.adicionarAluno("Maria", 323L, 9.7);
        gerenciadorAlunos.adicionarAluno("Jose", 153L, 7.0);
        gerenciadorAlunos.adicionarAluno("Carlos", 173L, 4.5);
        gerenciadorAlunos.adicionarAluno("Fernando", 173L, 4.5);

        gerenciadorAlunos.exibirAlunos();
        System.out.println("Alunos por nome: " + gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println("Alunos por nota: " + gerenciadorAlunos.exibirAlunosPorNota());
    }
}