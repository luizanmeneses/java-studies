import java.util.Scanner;

/*5. Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá 
ser o respectivo elemento de A multiplicado por sua posição (ou índice), ou seja: B[i] = A[i] * i.  */

public class Exerc5Arrays{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vet_a = new int[4];
        int[] vet_b = new int[vet_a.length];

        for (int i = 0; i < vet_a.length; i++){
            System.out.println("Posição " + (i + 1));
            vet_a[i] = scan.nextInt();
            vet_b[i] = (vet_a[i] * i);
        }
        System.out.print("A = ");
        for(int i = 0; i < vet_a.length; i++){
            System.out.print(vet_a[i] + " ");
        }

        System.out.print("\nB = ");
        for(int i = 0; i < vet_b.length; i++){
            System.out.print(vet_b[i] + " ");
        }
    }
}