import java.util.Scanner;

/*10. Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá ser o resto da divisão do respectivo 
elemento de A por 2 (dois), ou seja: B[i] := A[i] % 2.  */
public class Exerc10Arrays{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vet_a = new int[5];
        int[] vet_b = new int[5];
        double[] vet_c = new double[5];

        for (int i = 0; i < (vet_a.length); i++){
            System.out.println("Valor para a Posição " + (i+1) + " de A: ");
            vet_a[i] = scan.nextInt();
        }

        for (int i = 0; i < (vet_a.length); i++){
            System.out.println("Valor para a Posição " + (i+1) + " de B: ");
            vet_b[i] = scan.nextInt();

            vet_c[i] = vet_a[i] % vet_b[i];
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