//1. Escreva uma classe para representar uma lâmpada. Desenvolva métodos para ligar, desligar a lampada. 

public class Lampada{
    String cor;
    String comodo;
    boolean ligada;

    //Métodos
    void ligar(){
        ligada =true;
        System.out.println("Lâmpada ligada.");
    }

    void desligar(){
        ligada = false;
        System.out.println("Lâmpada desligada.");
    }


}


