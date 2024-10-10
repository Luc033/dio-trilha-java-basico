public class Main {
    public static void main(String[] args) {
        PalavrasUnicas palavrasUnicas = new PalavrasUnicas();

        palavrasUnicas.adicionarPalavra("bom dia");
        palavrasUnicas.adicionarPalavra("boa tarde");
        palavrasUnicas.adicionarPalavra("boa tarde");

        palavrasUnicas.exibirPalavrasUnicas();

        palavrasUnicas.verificarPalavra("boa noite");

        palavrasUnicas.removerPalavra("boa tarde");

        palavrasUnicas.exibirPalavrasUnicas();
    }
}