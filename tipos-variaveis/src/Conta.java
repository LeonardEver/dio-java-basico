public class Conta {
    double saldo = 10.0;
    double novoSaldo = 0.0;

    public void sacar(Double valor) {
        double novoSaldo = saldo - valor;
    }

    public void receber(Double valor) {
        double novoSaldo = saldo + valor;
    }

    public void imprimirSaldo() {
        System.out.println(novoSaldo);
    }
}