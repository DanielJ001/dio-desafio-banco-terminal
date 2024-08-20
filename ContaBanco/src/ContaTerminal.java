import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: Conhecer e importar a classe Scanner
        // Exibir as mensagens para o usuário
        // Obter pela classe scanner os valores digitados no terminal
        // Exibir a mensagem da conta criada
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da agência!");
        int numeroAgencia = scanner.nextInt();

        String agencia = "067-8";

        scanner.nextLine();
        System.out.println("Por favor, digite seu nome completo!");
        String nomeCliente = scanner.nextLine();

        double saldo = 237.48;

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroAgencia + " e seu saldo de " + saldo + " já está disponível para saque.");

    }
}
