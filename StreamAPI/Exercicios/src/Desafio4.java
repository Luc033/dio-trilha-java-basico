import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio4 {
    public static void main(String[] args) {

        Predicate<Integer> numNegativo = n -> n < 0;

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, -90, -34);

        List<Integer> listaRemover = numeros.stream().filter(numNegativo).toList();

        listaRemover.stream().forEach(System.out::println);
        numeros.removeAll(listaRemover);
        System.out.println("Removido");
        numeros.stream().forEach(System.out::println);




    }
}
