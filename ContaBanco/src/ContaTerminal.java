import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá bem vindo a banco!, digite seu Nome por favor");
        String nome = scanner.next();
        System.out.println("Por favor, digite o numero da Agência!");
        String numagencia = scanner.next();
        System.out.println("Por favor, digite o numero da Conta!");
        int conta = scanner.nextInt();
        System.out.println("Por favor, digite o saldo de sua conta!");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é: " + numagencia + " conta " + conta + " e seu saldo de " + saldo+ " já esta desponivel para saque");






    }
}