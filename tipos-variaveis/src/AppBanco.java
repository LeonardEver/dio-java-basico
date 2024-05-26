public class AppBanco {
    public static void main(String[] args) throws Exception {

        Conta conta = new Conta();

        System.out.println(conta.saldo);

        conta.receber(20.0);

        System.out.println(conta.novoSaldo);
    }
}
