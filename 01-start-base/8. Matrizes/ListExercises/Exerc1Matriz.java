
import java.util.Random;

/*1. Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0 - 9. Após isso determine o maior número da matriz e a sua posição (linha, coluna).  */

public class Exerc1Matriz{
    public static void main(String[] args) {
        
        int[][] m = new int[4][4];

        Random numRandom = new Random();
        //Povoar matriz
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                m[i][j] = numRandom.nextInt(9);//ou seja, gera nums no intervalo de 0 a 9
            }
        }
        int maior = 0;
        int linha = 0;
        int col = 0;
        //Localizar os dados solicitados
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                if (m[i][j] > maior){
                    maior = m[i][j];
                    linha = i;
                    col = j;
                }
            }
        }
        //Ver matriz
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                System.out.print(m[i][j] + " ");    
                
            }
            System.out.println(); //Para que pule de linha a cada nova linha
        }

        System.out.println("Maior valor = " + maior);
        System.out.println("Localizado na: ");
        System.out.println("Linha: " + linha + " | Coluna: " + col);
    
    }
}