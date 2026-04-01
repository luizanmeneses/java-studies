import java.util.Scanner;
/*11. Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a quantidade de elementos armazenados neste 
vetor que são pares. */
public class Exerc11Arrays{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vet_a = new int[8];
        int pares = 0;

        for (int i = 0; i< vet_a.length; i++){
            System.out.println("Valor de A posição " + (i+1) + ": ");
            vet_a[i] = scan.nextInt();
            if (vet_a[i] % 2 == 0){
                pares += 1;
            }
        }
        System.out.print("A = ");
        for(int i = 0; i < vet_a.length; i++){
            System.out.print(vet_a[i] + " ");
        }
        System.out.print("\nQuantidade de pares: " + pares);
    }
}