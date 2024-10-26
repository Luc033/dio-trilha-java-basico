import edu.luc.Met;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"2064","4000","2000","3200"};
        Met m = new Met();
        System.out.println(m.calcularConsumoTotal(strings));
    }
}