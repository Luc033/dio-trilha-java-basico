import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        // criando o objeto Scanner
        Scanner scanner = new Scanner(System.in);
        String nomeCliente;

        //Solicitando que o usuário insira o número da agência
        System.out.println("Por favor, digite o número da agência");

        //declarando a variável para ler o valor digitado pelo usuário com o Scanner
        String agencia = scanner.next();

        //Solicitando que o usuário insira o número da conta
        System.out.println("Insira o número da conta");

        //declarando a variável para ler o valor digitado pelo usuário com o Scanner
        int numero = scanner.nextInt();

        //necessário esvaziar o buffer do teclado antes da leitura do valor String
        scanner.nextLine();

        //Solicitando que o usuário insira o seu nome completo
        System.out.println("Insira o seu nome completo");

        //declarando a variável para ler o valor digitado pelo usuário com o Scanner
        nomeCliente = scanner.nextLine();

        //Solicitando que o usuário insira o saldo da conta
        System.out.println("Insira o saldo da conta");
        //declarando a variável para ler o valor digitado pelo usuário com o Scanner
        double saldo = scanner.nextDouble();

        System.out.println("Olá,"+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é ".concat(agencia) + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");
    }
}