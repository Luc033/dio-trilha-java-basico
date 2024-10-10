import java.util.Objects;

public class Tarefa {
    private boolean pendente;
    private String descricao;

    public Tarefa(boolean status, String descricao) {
        this.pendente = status;
        this.descricao = descricao;
    }

    public boolean isPendente() {
        return pendente;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setPendente(boolean pendente) {
        this.pendente = pendente;
    }

    @Override
    public String toString() {
        return "{Tarefa: " + descricao +
                ", Pendente: " + pendente + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tarefa)) return false;
        Tarefa tarefa = (Tarefa) o;
        return Objects.equals(getDescricao(), tarefa.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getDescricao());
    }
}
