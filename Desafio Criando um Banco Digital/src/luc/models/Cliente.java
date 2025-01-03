package luc.models;


public class Cliente implements Comparable<Cliente>{

    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public int compareTo(Cliente c) {
        return this.nome.compareToIgnoreCase(c.getNome());
    }
}