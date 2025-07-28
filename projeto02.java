package projetos;
import java.util.Scanner;
public class projeto02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "s";
        while (continuar.equalsIgnoreCase("s")) {
            System.out.println("Bem vindo a nossa calculadora");
            System.out.println("==============================");
            System.out.println("digite o primeiro numero: ");
            Long n1 = scanner.nextLong();
            System.out.println("Digite o segundo numero: ");
            Long n2 = scanner.nextLong();
            System.out.println("=========================");
            int resultado = 0;
            System.out.println("Escolha a operação:" +
                    "1 - Soma" +
                    ", 2 - Subtração" +
                    ", 3 - Multiplicação" +
                    ", 4 - divisão");
            int operacao = scanner.nextInt();
            if (operacao == 1) {
                System.out.println("O resultado da operação 1 é: " + (n1 + n2));
            } else if (operacao == 2) {
                System.out.println("O resultado da operação 2 é: " + (n1 - n2));
            } else if (operacao == 3) {
                System.out.println("O resultado da operação 3 é: " + (n1 * n2));
            } else if (operacao == 4) {
                System.out.println("O resultado da operação 4 é: " + (n1 / n2));
            }else {
                System.out.println("Operação invalida!");
            }
            System.out.println("==============================");
            System.out.println("Voce deseja fazer outra operação?");
            continuar = scanner.next();
        }
        System.out.println("programa encerrado.");
        scanner.close();
    }
}
