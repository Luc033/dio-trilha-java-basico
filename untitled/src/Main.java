import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int calcularConsumoTotal(String[] consumoSemanal) {
        int total = Arrays.stream(consumoSemanal).mapToInt(Integer::parseInt).sum();
        return total ;

    }
    public static int calcularMediaSemanal(int totalConsumo, int numeroDeSemanas) {
        return totalConsumo / numeroDeSemanas;


    }
        public static void main(String[] args) {
        String[] strings = {"2064","4000","2000","3200"};
        int m = calcularConsumoTotal(strings);
        System.out.println(m);
        System.out.println(calcularMediaSemanal(11264,4));
    }
}