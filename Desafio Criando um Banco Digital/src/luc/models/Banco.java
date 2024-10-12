package luc.models;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Banco {

    private String nome;
    private Set<Conta> contas;

    public Banco(String nome, Set<Conta> contas) {
        this.nome = nome;
        this.contas = contas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conta> getContas() {
        return contas;
    }

    public void setContas(Set<Conta> contas) {
        this.contas.add((Conta) contas);
    }

    public void exibindoContas(){
        System.out.println("--===| CONTAS |===--");
        contas.stream().forEach(System.out::println);
    }

    public void pesquisaPorNome(String nome){
        if(!contas.isEmpty()) {
            System.out.println("_--_--_--_ CONTA ENCONTRADA _--_--_--_");
            contas.stream()
                    .filter(n -> n.cliente.getNome().equalsIgnoreCase(nome))
                    .forEach(System.out::println);
            System.out.println("\n");
        }else{
            System.out.println("Lista vazia.");
        }
    }



}