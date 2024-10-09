package models;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> inteiroList;

    public SomaNumeros(){
        this.inteiroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        inteiroList.add(numero);
    }

    public int calcularSoma(){
        Integer numTotal = 0;
        for(Integer n : inteiroList){
            numTotal += n;
        }
        return numTotal;
    }

    public int encontrarMaiorNumero(){
        Integer maiorNum = 0;
        if (!inteiroList.isEmpty()){
            for(Integer n : inteiroList) {
                if( n >= maiorNum){
                    maiorNum = n;
                }
            }
        return maiorNum;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public int encontrarMenorNumero(){
        Integer menorNum = 0;
        if (!inteiroList.isEmpty()){
            for(Integer n : inteiroList) {
                if( n <= menorNum){
                    menorNum = n;
                }
            }
        return menorNum;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros(){
        if (!inteiroList.isEmpty()){
            System.out.println("Números da lista: " + inteiroList);
        }else{
            System.out.println("Lista vazia");
        }
    }
}
