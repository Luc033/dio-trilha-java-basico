//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();
        contagemPalavras.adicionarPalavra("panela", 35);
        contagemPalavras.adicionarPalavra("ovo", 56);
        contagemPalavras.adicionarPalavra("vasco", 12);
        contagemPalavras.adicionarPalavra("flamengo", 55);

        contagemPalavras.exibirContagemPalavras();

        System.out.println("Palavra mais frequente:");
        System.out.println(contagemPalavras.encontrarPalavraMaisFrequente());
        contagemPalavras.encontrarPalavraMaisFrequente();

        System.out.println("Palavra removida");
        contagemPalavras.removerPalavra("ovo");

        contagemPalavras.exibirContagemPalavras();


    }
}