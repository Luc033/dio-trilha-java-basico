import java.util.List;

public class Tarefa implements Comparable<Tarefa>{
    private String descricao;
    private int id;

    public Tarefa(String descricao, int id) {
        this.descricao = descricao;
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "id='" + id + '\'' +
                "descricao='" + descricao + '\'' +
                '}';
    }

    @Override
    public int compareTo(Tarefa t) {
        return Integer.compare(id, t.getId());
    }
}
