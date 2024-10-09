import models.CatalogoLivros;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("torfinn","joao",2022);
        catalogoLivros.adicionarLivro("Jorde","joao",2000);
        catalogoLivros.adicionarLivro("Titghi","joao",2000);
        catalogoLivros.adicionarLivro("Saude","Clarisse",1988);
        catalogoLivros.adicionarLivro("Tristeza","Clarisse",1990);
        catalogoLivros.adicionarLivro("Solitude","Fernando",1979);

        catalogoLivros.pesquisaPorAutor("joao");
        catalogoLivros.pesquisarPorIntervaloAnos(1985, 1995);
        catalogoLivros.pesquisarPorTitulo("Solitude");
    }
}