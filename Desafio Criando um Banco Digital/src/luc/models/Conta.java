package luc.models;


import java.util.Objects;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(String nome) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        Cliente cliente = new Cliente(nome);
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        if(this.saldo >= valor) {
            saldo -= valor;
            System.out.println(String.format("Valor sacado R$ %.2f", valor));
        }else{
            System.out.println("Saldo insuficiente.");
        }

    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if(saldo >= valor){

        this.sacar(valor);
        contaDestino.depositar(valor);
        System.out.println(String.format("Valor transferido R$ %.2f para %s", valor, contaDestino.cliente.getNome()));
        }else{
            System.out.println("Saldo insuficiente.");
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Conta conta)) return false;
        return getNumero() == conta.getNumero();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getNumero());
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", cliente=" + cliente +
                '}';
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}