//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Jose", 12,1.45);
        ordenacaoPessoa.adicionarPessoa("Maria", 22,1.85);
        ordenacaoPessoa.adicionarPessoa("Samaria", 82,1.35);
        ordenacaoPessoa.adicionarPessoa("Cleber", 52,1.95);
        ordenacaoPessoa.adicionarPessoa("Marcos", 62,1.75);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());

        System.out.println("///////////////////////");

        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        for (int i = 0; i < 12; i++) {
            int num = (int) (Math.random() * 1000) + 1;
            ordenacaoNumeros.adicionarNumero(num);
        }

        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendente());
    }
}