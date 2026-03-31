import java.util.Scanner;
//2. Criar um vetor A com 8 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho e com os elementos do vetor A multiplicados 
//por 2, ou seja: B[i] = A[i] * 2. 

public class Exerc2Arrays{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(java.util.Locale.US);

        int[] A = new int[8];
        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++){
            System.out.println("Valor de A[" + (i+1) + "]: ");
            A[i] = scan.nextInt();
            B[i] = (A[i] * 2);
        }
        System.out.print("A = ");
        for(int i = 0; i < A.length; i++){
            System.out.print(A[i] + " - ");
        }

        System.out.print("\nB = ");
        for(int i = 0; i < B.length; i++){
            System.out.print(B[i] + " - ");
        }
    }
}