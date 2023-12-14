package conta;

public class Program {
    public static void main(String[] args) {
        Acount conta = new Acount();
        conta.titular = "Larissa";
        conta.numero = "1234";
        conta.saldo = 0.0;

        conta.deposito(20.0);
        conta.saque(200.0);

        //não posso conseguir fazer isso DEVO PRIVAR OS ATRIBUTOS NA CLASSE PRA SÓ PODER ALTERAR NA PRÓPRIA CLASSE
        conta.saldo = 500.0;
        System.out.println(conta.saldo);
    }
}
