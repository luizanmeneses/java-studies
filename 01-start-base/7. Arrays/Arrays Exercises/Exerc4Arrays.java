import java.util.Scanner;
/*4. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tamanho, sendo que cada elemento do vetor B deverá ser a raiz 
quadrada do respectivo elemento de A, ou seja: B[i] = sqrt(A[i]).  */

public class Exerc4Arrays{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] x = new int[5];
        double[] y = new double[x.length];

        for (int i = 0; i < x.length; i++){
            System.out.print("X[" + (i+1) + "]: ");
            x[i] = scan.nextInt();
            y[i] = Math.sqrt(x[i]);
        }

        System.out.print("X = ");
        for(int i = 0; i < x.length; i++){
            System.out.print(x[i] + " ");
        }

        System.out.print("\nY = ");
        for(int i = 0; i < y.length; i++){
            System.out.print(y[i] + " ");
        }
        
    }
}