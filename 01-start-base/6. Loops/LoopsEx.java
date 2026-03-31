import java.util.Scanner;

public class LoopsEx{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(java.util.Locale.US);

//While
        /*int i = 1;
        int max = 10;

        System.out.println("Contando até " + max);
        while (i < max){
            System.out.println("Valor de i: " + i);
            i++;
        }

        System.out.println(i);
//Do-While
        do { 
            i++;
            System.out.println("Valor de i: " + i);
        } while (i < 15);
    
//For
        for (int count = 0; count < 7; count++){
            System.out.println(count);
        }

    //Decrement
        for (int count = 7; count > 0; count--){
            System.out.println(count);
        }*/
    
    //For with 2 vars
        for (int i = 0, j = 7; i < j; i++, j--){
            System.out.println("i = " + i + "; j = " + j);
        }

    }
}