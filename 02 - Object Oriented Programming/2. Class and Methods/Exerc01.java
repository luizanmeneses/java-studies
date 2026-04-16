//1. Escreva uma classe para representar uma lâmpada. Desenvolva métodos para ligar, desligar a lampada. 
import java.util.Scanner;

public class Exerc01{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        Lampada lamp = new Lampada();
        lamp.cor = "Amarela";
        lamp.comodo = "Escritório";
        //posso fazer manual:
        lamp.ligada = false;
        //ou pelos métodos
        //lamp.ligar();
        //lamp.desligar();

        System.out.println("Escolha um valor (1 on ou 2 off): ");
        int resp = scan.nextInt();
        if (resp == 1){
            lamp.ligar();
        }else if (resp == 2){
            lamp.desligar();
        }else{
            System.out.println("Inválido!");
        }
}
}
