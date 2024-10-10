import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos(){
        alunoSet = new HashSet<>();
    }
    public void adicionarAluno(String nome, Long matricula, double media){
        alunoSet.add(new Aluno(nome, matricula, media));
    }
    public void removerAluno(long matricula){
        Aluno alunoRemover = null;
        if(!alunoSet.isEmpty()){
            for (Aluno a : alunoSet){
                if(a.getMatricula() == matricula){
                    alunoRemover = a;
                    System.out.println("Aluno removido: " + alunoRemover);
                    alunoSet.remove(alunoRemover);
                    break;
                }
            }
        }else{
            System.out.println("Conjunto vazio.");
        }
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        return alunosPorNome;
    }
    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunoSet);
        return alunosPorNota;
    }
    public void exibirAlunos() {
        System.out.println("Conjunto de alunos: " + alunoSet);
    }

}
