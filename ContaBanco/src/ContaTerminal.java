import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;

		System.out.println("---------------CONTA DA DIO---------------\n");
		System.out.println("Digite o número da Conta:       Ex: (1234)");
		numero = sc.nextInt();

		System.out.println("Digite o número da Agência:     Ex: (123-8)");
		agencia = sc.next();

		System.out.println("Digite seu nome: ");
		nomeCliente = sc.next();
		sc.nextLine();

		System.out.println("Qual seu saldo atual: ");
		saldo = sc.nextDouble();

		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco.\n", nomeCliente);
		System.out.printf("Sua agência é: %s\n", agencia);
		System.out.printf("Sua conta foi aberta com o número %d\n", numero);
		System.out.printf("Seu saldo é de: R$ %.2f\n", saldo);
		
		sc.close();
	}

}