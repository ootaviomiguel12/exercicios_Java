public class Cliente
{
    String primeiroNome;
    int idade;
    int saldo;

    Cliente()
    {
        saldo = 10;
    }

    void novaConta(){
        System.out.println("Bem vindo, " + primeiroNome);
        System.out.println("Seu novo saldo é: " + saldo);
    }

}
