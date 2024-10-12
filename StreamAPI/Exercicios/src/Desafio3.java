import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;

import static java.util.Collections.reverse;
import static java.util.Collections.sort;

public class Desafio3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numeroPositivoPares = numeros.stream().filter(n -> n % 2 == 0 || n == 0).toList();
        numeroPositivoPares.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);


    }
}
