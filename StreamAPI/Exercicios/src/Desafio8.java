import java.util.Arrays;
import java.util.List;

public class Desafio8 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99, 11, 55, 44, 33);

        // Somando os dígitos de cada número usando Stream API
        numeros.stream()
                .map(numero -> String.valueOf(numero)
                        .chars()                  // Transforma os dígitos em uma stream de inteiros (códigos ASCII)
                        .map(Character::getNumericValue) // Converte os códigos ASCII em valores numéricos
                        .sum())                   // Soma os dígitos
                .forEach(soma -> System.out.println("Soma dos dígitos é: " + soma));
    }
}
