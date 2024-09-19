import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        int nota []= {6,7, 6,8,4,6,8,6,9};
        double media = 0;
        for (int i = 0; i < nota.length; i++) {
            media += nota[i];
        }
        media = media / nota.length;
        System.out.println(media >= 7?"Aprovado":"Reprovado");

        boolean num = new Random().nextInt(3) == 0;
        System.out.println(num);

        boolean condicao = false; while(condicao){ System.out.println("executou ... "); }
        */

        double num = 3.141524;
//        String sValue = (String) String.format("%.2f", num);
//        System.out.println(num + ' ' + sValue);
//        Double novoNum = Double.parseDouble(sValue);
//        System.out.println(novoNum);
//        String mensagem = String.format("Valor percentual: %f", novoNum);
//        System.out.println(mensagem);

        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);
        nf.setGroupingUsed(false);

        System.out.println(nf.format(num) + "%");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreve");
        String input = scanner.nextLine();
        String[] servicosContratados = input.split(",");;
        boolean movelContratado  = false;
        boolean bandaLargaContratada = false;
        boolean tvContratada = false;

        for (String servico : servicosContratados) {
            if (servico.trim().equalsIgnoreCase("movel")) {
                movelContratado = true;
            } else if (servico.trim().equalsIgnoreCase("banda larga")) {
                bandaLargaContratada = true;
            } else if (servico.trim().equalsIgnoreCase("tv")) {
                tvContratada = true;
            }
        }
        System.out.println();
    }
}