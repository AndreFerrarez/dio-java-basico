import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: Cadastar conta bancaria do usuario

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero da Agencia: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o numero da conta: ");
        int numerConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o Nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o Saldo: ");
        double saldo = scanner.nextDouble();

        String numerContaFormatado = String.format("%05d", numerConta);

        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia e "
                + agencia + ", conta " + numerContaFormatado + ", e seu saldo " + saldo
                + " ja esta disponivel para saque. ");

        scanner.close();

    }
}
