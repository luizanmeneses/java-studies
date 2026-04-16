/*5. Cria uma classe para representar uma conta corrente que possui um número, um saldo, um status que informa se ela é especial ou não, um 
limite.  */
public class Exerc05{
    public static void main(String[] args) {
        
        ContaCorrente cc = new ContaCorrente();

        cc.numero = 101030;
        cc.saldo = 10000;
        cc.limite = 14000;
        cc.statusEspecial = true;
    }
}