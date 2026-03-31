import java.util.Scanner;

public class Exerc1Arrays{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(java.util.Locale.US);
    //1. Criar um vetor A com 5 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou seja, B[i] = A[i].
        int[] a = new int[5];
        int[] b = new int[5];
        //Loop to receive values
        for (int i = 0; i < a.length; i++){
            System.out.println("Valor de A na posição " + (i + 1) + " : ");
            a[i] = scan.nextInt();
            b[i] = a[i];
        }
        //Loops to list the arrays
        System.out.print("A = ");
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }

        System.out.print("\nB = ");
        for (int i = 0; i < b.length; i++){
            System.out.print(b[i] + " ");
        }
    }
}