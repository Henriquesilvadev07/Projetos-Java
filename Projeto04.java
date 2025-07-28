package projetos;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Projeto04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nome = new String[10];
        int[] idade = new int[10];
        String[] cpf = new String[10];
        int cadastrados = 0;
        String continuar = "s";
        while (continuar.equalsIgnoreCase("s")){
            System.out.println("1 - Cadastrar novo cliente");
            System.out.println("2 - Ver todos os cliente cadastrados");
            System.out.println("3 - Sair");
            int inicio = scanner.nextInt();
            if (cadastrados >= 10){
                System.out.println("Limite de cadastros atingido.");
                continue;
            }
                if (inicio == 1) {
                        System.out.println("Vamos lá");
                        System.out.println("==================");
                        System.out.println("Qual o seu nome?:  ");
                        nome[cadastrados] = scanner.nextLine();
                        System.out.println("Qual a sua idade?: ");
                        idade[cadastrados] = scanner.nextInt();
                        System.out.println("Qual o seu cpf?: ");
                        cpf[cadastrados] = scanner.next();
                        cadastrados++;
                        System.out.println("Cadastrado com sucessso!");
                } else if (inicio ==2 ) {
                    for (int i = 0; i < cadastrados; i++){
                        System.out.println("Cliente " + (i + 1));
                        System.out.println("Nome " + nome[i]);
                        System.out.println("Idade " + idade[i]);
                        System.out.println("CPF: " + cpf[i]);
                        System.out.println("================");
                    }
                } else if (inicio == 3) {
                    System.out.println("Saindo...");
                    System.exit(0);
                }
            System.out.println("Deseja continuar? ");
                continuar = scanner.next();
        }
        System.out.println("Saindo do programa....");
        System.exit(0);
    }
}
