package models;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    List<Livro> livroList;

    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        System.out.println("Livro adicionado");
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }
    public void pesquisaPorAutor(String autor){
        List<Livro> livroProcurar = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro livro : livroList){
                if (livro.getAutor().equalsIgnoreCase(autor)){
                    livroProcurar.add(livro);
                }
            }
            System.out.println("Busca por autor:");
            System.out.println(livroProcurar);

        }else{
            System.out.println("Lista vazia");
        }
    }
    public void pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livroProcurar = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro livro : livroList){
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal){
                    livroProcurar.add(livro);
                }

            }
            System.out.println("Busca por anos:");
            System.out.println(livroProcurar);

        }else{
            System.out.println("Lista vazia");
        }
    }

    public void pesquisarPorTitulo(String titulo){
        List<Livro> livroProcurar = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro livro : livroList){
                if (livro.getTitulo().equalsIgnoreCase(titulo)){
                    livroProcurar.add(livro);
                }
            }
            System.out.println("Busca por título:");
            System.out.println(livroProcurar);

        }else{
            System.out.println("Lista vazia");
        }
    }


    @Override
    public String toString() {
        return "CatalogoLivros{" +
                "livroList=" + livroList +
                '}';
    }
}
