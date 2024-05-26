import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();

        // Loop for para iterar sobre os saques
        for (int i = 1;; i++) {

            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Transações encerradas.");
                break;
            } else if (valorSaque > limiteDiario) {
                System.out.println("Limite diário de saque atingido. Transações encerradas.");
                break;
            } else {
                // Atualizar o limite diário
                limiteDiario -= valorSaque;
                System.out.printf("Saque realizado. Limite restante: %.2f\n", i, limiteDiario);
            }
        }

        scanner.close();
    }
}
