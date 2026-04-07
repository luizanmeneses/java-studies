public class MatrizTridimensional{
    public static void main(String[] args) {
        
        //Matriz 3x3x3
        int [][][] matrizTrid = new int[3][3][3];

        //Os valores serão as somas dos índices
        int soma = 0;
        int somaPares = 0;
        int somaImpares = 0;

        //Loop para povoar a matriz
        for (int i = 0; i < matrizTrid.length; i++){
            for (int j = 0; j < matrizTrid[i].length; j++){
                for (int k = 0; k < matrizTrid[i][j].length; k++){
                    System.out.println("i = " + i + " - j = " + j + " - k = " + k);
                    matrizTrid[i][j][k] = i + j + k;
                }
            }
        }

        //Loop para descobrir os valores das somas
         for (int i = 0; i < matrizTrid.length; i++){
            for (int j = 0; j < matrizTrid[i].length; j++){
                for (int k = 0; k < matrizTrid[i][j].length; k++){
                    soma += matrizTrid[i][j][k];
                    //Somar apenas pares
                    if (matrizTrid[i][j][k] % 2 == 0){
                        somaPares += matrizTrid[i][j][k];
                    }else {
                        somaImpares += matrizTrid[i][j][k];
                    }
                }
            }
        }
        System.out.println("Soma total = " + soma);
        System.out.println("Soma Pares = " + somaPares);
        System.out.println("Soma Impares = " + somaImpares);
    }
}