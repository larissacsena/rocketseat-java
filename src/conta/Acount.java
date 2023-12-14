package conta;

public class Acount {
    private String titular;
    private String numero;
    private Double saldo;

    void deposito (Double valor){
        if (valor > 0){
            saldo += valor;
            System.out.println("Novo saldo: " + saldo);
        }else {
            System.out.println("Valor de depósito inválido");
        }
    }

    void saque (Double valor){
        if (valor > 0 && saldo >= valor){
            saldo -= valor;
            System.out.println("Novo saldo: " + saldo);
        }else {
            System.out.println("Valor de saque inválido");
        }
    }
}
