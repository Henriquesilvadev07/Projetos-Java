package projetos;
import java.util.Scanner;
public class Projeto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===================");
        System.out.println("Bem vindo ao sistema escolar de São Paulo");
        System.out.println("===================");
        System.out.println("Voce gostaria de continuar? S/N: ");
        String entrada = scanner.next();
        if (entrada == "N || n") {
            System.out.println("Encerrando o programa...");
            System.exit(0);
        } else {
            System.out.println("Beleza! Vamos continuar");
        }
        System.out.println("Qual o seu nome?: ");
        String nome = scanner.next();
        System.out.println("Qual a sua idade?: ");
        int idade = scanner.nextInt();
        System.out.println("Qual a sua série?: ");
        String serie = scanner.next();
        System.out.println("Informe suas 3 notas para calcularmos a sua média: ");
        int nota1 = scanner.nextInt();
        int nota2 = scanner.nextInt();
        int nota3 = scanner.nextInt();
        int notas = (nota1 + nota2 + nota3) / 3;
        System.out.println("Sua média foi: " + notas);
         if (notas < 5){
             System.out.println("Você reprovou! sua media foi abaixo de 5");
         } else if (notas == 5 ) {
             System.out.println("Você está de recuperação! sua nota está entre 5 e 7");
         } else if (notas > 6) {
             System.out.println("Parabéns você foi aprovado!");
         }
        System.out.println("==========================");
        System.out.println("Boletim de: " + nome + ", idade: " +idade+ ", Série: " +serie+ ", média: " +notas);
    }
}
