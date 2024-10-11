//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Dicionario dicionario = new Dicionario();
       dicionario.adicionarPalavra("comer","ato de ingerir alimentos");
       dicionario.adicionarPalavra("sexo","ato de relaiconar-se com terceiros");
       dicionario.adicionarPalavra("domir","descanso");

        dicionario.exibirPalavras();

        dicionario.pesquisarPorPalavra("comer");
        dicionario.removerPalavra("comer");
        dicionario.removerPalavra("comer");
        dicionario.exibirPalavras();
    }
}