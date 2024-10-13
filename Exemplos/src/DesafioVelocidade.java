import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.NoSuchElementException;


public class DesafioVelocidade {
    // Função para calcular a velocidade média de conexão de internet
    public static double calcularVelocidadeMedia(String[] velocidades) {
        int total = 0;
        for(String s : velocidades){
            total += Integer.valueOf(s);
        }
        double media = (double) total / velocidades.length;
        return media;
    }

    public static void main(String[] args) {
        String[] v = {"123","234","23","45","32"};
//        Scanner scanner = new Scanner(System.in);
//        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
//        String input = scanner.nextLine();
//
//        // Convertendo a entrada em uma lista de strings
//        String[] velocidades = input.split(",");
//
//        // Calculando a velocidade média de conexão
//        double velocidadeMedia = calcularVelocidadeMedia(velocidades);
//
//        // Exibindo a velocidade média de conexão
//        System.out.println((int) velocidadeMedia + " Mbps");
//        scanner.close();

        System.out.println(calcularVelocidadeMedia(v));
    }
}