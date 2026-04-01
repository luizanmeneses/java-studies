//import java.text.DecimalFormat;
import java.util.Scanner;

/*9. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C, onde cada elemento de C é a divisão dos respectivos 
elementos em A e B, ou seja: C[i] = A[i] / float(B[i])*/

public class Exerc9Arrays{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vet_a = new int[5];
        int[] vet_b = new int[5];
        double[] vet_c = new double[5];
        
        //DecimalFormat df = new DecimalFormat("###,###.##");

        for (int i = 0; i < (vet_a.length); i++){
            System.out.println("Valor para a Posição " + (i+1) + " de A: ");
            vet_a[i] = scan.nextInt();
        }

        for (int i = 0; i < (vet_a.length); i++){
            System.out.println("Valor para a Posição " + (i+1) + " de B: ");
            vet_b[i] = scan.nextInt();

            vet_c[i] = vet_a[i] / vet_b[i];
        }

        System.out.print("A = ");
        for(int i = 0; i < vet_a.length; i++){
            System.out.print(vet_a[i] + " ");
        }

        System.out.print("\nB = ");
        for(int i = 0; i < vet_b.length; i++){
            System.out.print(vet_b[i] + " ");
        }

        System.out.print("\nC = ");
        for(int i = 0; i < vet_c.length; i++){
            System.out.print(vet_c[i] + " ");
        }
    }
}