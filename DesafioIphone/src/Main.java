package DesafioIphone.src;

import DesafioIphone.src.model.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.selecionarMusica("The number of the beast");
        iphone.adicionarNovaAba();
        iphone.atender();
        iphone.ligar("1393223-2332");
    }
}