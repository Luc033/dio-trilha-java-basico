import luc.models.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Conta cc1 = new ContaCorrente("Lucas");
        cc1.depositar(3580);
        Conta cc2 = new ContaCorrente("Jorge");
        cc2.depositar(2460);
        Conta cc3 = new ContaCorrente("Maria");
        cc3.depositar(6670);
        Conta cc4 = new ContaCorrente("Aluka");
        cc4.depositar(15860);

        Set<Conta> contasCorrentes = new HashSet<>();
        contasCorrentes.add(cc1);
        contasCorrentes.add(cc2);
        contasCorrentes.add(cc3);
        contasCorrentes.add(cc4);

        Banco bancos = new Banco("Bradesco", contasCorrentes);
        bancos.exibindoContas();
        bancos.pesquisaPorNome("maria");

        cc1.transferir(255, cc3);
        bancos.pesquisaPorNome("lucas");
        bancos.pesquisaPorNome("maria");
        cc3.transferir(6925, cc1);
        bancos.pesquisaPorNome("maria");

        // Tentando transferir sem saldo
        cc3.transferir(1, cc1);
        bancos.pesquisaPorNome("maria");


    }
}