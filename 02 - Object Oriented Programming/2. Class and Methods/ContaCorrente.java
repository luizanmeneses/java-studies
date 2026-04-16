
/*2. Cria uma classe para representar uma conta corrente que possui um número, um saldo, um status que informa se ela é especial ou não, um 
limite. Desenvolva métodos para realizar saque (verificando se o cliente pode realizar saques), despositar dinheiro, consultar saldo e 
verificar se o cliente está usando cheque especial ou não. Desenvolva um programa para testar essa classe.  */

public class ContaCorrente{
    int numero;
    double saldo;
    boolean especial;
    double limiteEspecial;
    double valorEspecialUsado;

    //Métodos
    boolean realizarSaque(double valor){
        if (saldo >= valor){
            saldo -= valor;
            return true;
        }else{
            if (especial){
                double disponivel = limiteEspecial + saldo; //pq se saldo estiver negativo, vai descontar do cheque especial, se +, vai somar o valor disponível
                System.out.println("Especial + saldo: " + disponivel);
                if (disponivel >= valor){
                    saldo -= valor;
                    return true;
                }else { //se valor solicitado maior que o que tem
                    return false;
                }
            }else{ //se não tiver especial
                return false;
            }
        }
    }

    void realizarDeposito(double valor){
        saldo += valor;
        System.out.println("Depósito efetuado com sucesso.");
    }

    void consultarSaldo(){
        System.out.println("Saldo atual: " + saldo);
    }

    boolean verificarUsoChequeEspecial(){
        return saldo < 0; //se o saldo for menor que zero, retorna o uso como true.
    }
}