import java.util.Scanner;
public class List_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        scan.useLocale(java.util.Locale.US);
        //1. Faça um Programa que mostre a mensagem "Alo mundo" na tela. 
        System.out.println("Alo mundo");

        //2. Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
        System.out.println("Digite um número: ");
        int num = scan.nextInt();
        System.out.println("O número informado foi: " + num);

        //3. Faça um Programa que peça dois números e imprima a soma. 
        System.out.println("Digite dois números: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int soma = (a + b);

        System.out.println(soma);

        //4. Faça um Programa que peça as 4 notas bimestrais e mostre a média.
        System.out.println("Digite as 4 notas bimestrais: ");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        int n4 = scan.nextInt();

        int media = (n1 + n2 + n3 + n4) / 4;

        System.out.println(media);

        //5. Faça um Programa que converta metros para centímetros.
        //1 m = 100cm
        System.out.println("Qual a metragem? ");
        double metro = scan.nextDouble();
        double resultado = metro * 100;

        System.out.println(metro + " metros, corresponde a " + resultado + " centímetros");

        //6. Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
        // A = pi * r² - se tivesse o diametro, bastava dividir por 2 e teria o raio.
        System.out.println("Digite o raio do círculo: ");
        double r = scan.nextDouble();
        double a = 3.14 * (r * r);
        System.out.println("O valor da área do círculo com raio " + r + " é igual a: " + a);

        //7. Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário. 
        // A = l * l
        System.out.println("Qual o valor dos lados do quadrado? ");
        int l = scan.nextInt();

        int a_q = (l * l);
        System.out.println("O dobro da área do quadrado é igual a: " + a_q * 2);

        //8. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês. 
        System.out.println("Qual o mês, Valor por hora e Quantidade de horas trabalhadas neste mês: ");
        String mes = scan.next();
        double valor_hora = scan.nextDouble();
        int qtd_horas = scan.nextInt();

        double valor_mes = (valor_hora * qtd_horas);

        System.out.println("No mês de " + mes + " vc receberá o valor de " + valor_mes + " euros");

        // 9. Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius. 
            //C = (5 * (F-32) / 9). 
        System.out.println("Temperatura em Fahrenheit: ");
        double f = scan.nextDouble();
        double c = (5 * (f - 32) / 9);

        System.out.print("A temperatura " + f + " F, corresponde a " + c + " graus C.");

        // 10. Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Farenheit. 
            //F = (C * 1,8) + 32
        System.out.println("Temperatura em Celsius: ");
        double c = scan.nextDouble();
        double f = (c * 1.8) + 32;

        System.out.println("A temperatura de " + c + "C, corresponde a "+ f + " F.");

        //11. Faça um Programa que peça 2 números inteiros e um número real.
        //Calcule e mostre:
        System.out.println("Digite 3 números: ");
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();

        //a. o produto do dobro do primeiro com metade do segundo -> a multiplicação do dobro de x pela metade y
        int a = (2*x) * (y/2);
        System.out.println(a);

        //b. a soma do triplo do primeiro com o terceiro -> 3x + z
        int b = (3 * x) + z;
        System.out.println(b);

        //c. o terceiro elevado ao cubo.
        int c = (z * z * z);
        System.out.println(c);

        //12. Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: 
            //(72.7*altura) - 58 
        
        System.out.println("Digite a sua altura: ");
        double altura = scan.nextDouble();
        double peso = (72 * altura) - 58;

        System.out.println("O seu peso ideal é: " + peso);

        /*13. Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas: 
            a.Para homens: (72.7*h) - 58 
            b.Para mulheres: (62.1*h) - 44.7 (h = altura) */
        
        System.out.println("Informe: Sexo (f/m) e Altura");
        String sexo = scan.next();
        double h = scan.nextDouble();

        double pesoHomem = (72.7 * h) - 58;
        double pesoMulher = (62.1 * h) - 44.7;

        System.out.println("Se vc for mulher, seu peso ideal é de " + pesoMulher);
        System.out.println("Se vc for homem, seu peso ideal é de " + pesoHomem);

    /*14. João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o 
    estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia 
    a variável peso (peso de peixes) e verifique se há excesso. Se houver, gravar na variável excesso e na variável multa o valor da multa que João deverá pagar. Caso contrário 
    mostrar tais variáveis com o conteúdo ZERO.*/
        System.out.println("Peso: ");
        int peso = scan.nextInt();

        if (peso > 50){
            int excesso = peso - 50;
            double multa = excesso * 4;
            System.out.println("O valor da multa é de R$ " + multa);
        }
    /*15. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que 
    são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:  
        a. salário bruto. b. quanto pagou ao INSS. c. quanto pagou ao sindicato. d. o salário líquido.  */
        System.out.println("Valor por hora e Numero de horas trabalhadas: ");
        double valorHora = scan.nextDouble();
        int numHoras = scan.nextInt();

        double sal_bruto = (valorHora * numHoras);
        double desc_inss = (sal_bruto * 8/100);
        double desc_irs = (sal_bruto * 11/100);
        double desc_sind = (sal_bruto * 5/100);

        System.out.println("Salário Bruto: R$ " + sal_bruto);
        System.out.println("Desconto INSS: R$ " + desc_inss);
        System.out.println("Desconto IRS: R$ " + desc_irs);
        System.out.println("Desconto Sindicato: R$ " + desc_sind);
        System.out.println("Salário Líquido: R$ " + (sal_bruto - desc_inss - desc_irs - desc_sind));

        //16. Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro 
        // para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e 
        // o preço total.

        System.out.println("Metragem da área a ser pintada: ");//cobertura 1l/3m
        double metragem = scan.nextDouble();
        double qtd_litros = (metragem / 3); //descobrir a quantidade de litros necessária
        double qtd_latas = (qtd_litros / 18);
        double valor = (qtd_latas * 80);

        System.out.println("Vc precisará de " + qtd_latas + " latas de tinta para a metragem informada. O valor total será de R$ " + valor);

        //17. Mesma ideia do anterior, mas com acréscimo de galões
        System.out.println("Informe a metragem: ");
        double metros = scan.nextDouble();
        double qtd_litros = (metros / 6);
        double latas = (qtd_litros / 18);
        double galoes = (qtd_litros / 3.6);
        double valor_latas = (latas * 80);
        double valor_galoes = (galoes * 25);

        //comprar apenas latas de 18 litros
        System.out.println("Para " + metros + " metros, precisará de " + qtd_litros + " litros de tinta. " + latas + " latas e R$ " + valor_latas + " no total.");
        //comprar apenas galões de 3,6 litros
        System.out.println("Para " + metros + " metros, precisará de " + qtd_litros + " litros de tinta. " + galoes + " galões e R$ " + valor_galoes + " no total.");

        //18. Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps), calcule e informe o tempo aproximado de 
        // download do arquivo usando este link (em minutos).
        System.out.println("Tamanho do arquivo (MB) e Velocidade (Mbps): "); //mbps - megabites/segundo
        int tam_arquivo = scan.nextInt();
        int velocidade = scan.nextInt();

        int segundos = (tam_arquivo * velocidade);
        double minutos = (segundos / 60);

        System.out.println("Levará " + segundos + " segundos ou " + minutos + " minutos para baixar.");
        
        scan.close();
    }

}