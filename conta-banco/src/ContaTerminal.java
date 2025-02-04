import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência: \n");
        agencia = scanner.nextLine();
        System.out.print("Agencia digitada: " + agencia + "\n");

        System.out.print("Por favor, digite o número da conta: \n");
        numero = scanner.nextInt();
        System.out.print("Número da conta digitado: " + numero + "\n");

        // Limpa o buffer do teclado
        scanner.nextLine();

        System.out.print("Por favor, digite o nome do cliente: \n");
        nomeCliente = scanner.nextLine();
        System.out.print("Nome do cliente digitado: " + nomeCliente + "\n");

        System.out.print("Por favor, digite o saldo inicial: \n");
        saldo = scanner.nextDouble();
        System.out.println("Saldo digitado: " + saldo + "\n");

        String mensagemBoasVindas = "Olá ".concat(nomeCliente).concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencia).concat(", conta " ).concat(String.valueOf(numero)).concat(" e seu saldo " ).concat(String.valueOf(saldo)).concat(" já está disponível para saque.");

        System.out.println(mensagemBoasVindas);

    }
}
