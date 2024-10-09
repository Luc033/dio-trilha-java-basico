import models.SomaNumeros;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        for (int i = 4; i < 10; i++) {
            somaNumeros.adicionarNumero(i);
        }

        System.out.println("total: " + somaNumeros.calcularSoma());
        System.out.println("maior: "+ somaNumeros.encontrarMaiorNumero());
        System.out.println("menor: "+ somaNumeros.encontrarMenorNumero());

        somaNumeros.exibirNumeros();
    }
}