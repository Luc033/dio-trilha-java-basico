package luc.models;


public class ContaPoupanca extends Conta {

    public ContaPoupanca(String nome) {
        super(nome);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupan�a ===");
        super.imprimirInfosComuns();
    }
}
