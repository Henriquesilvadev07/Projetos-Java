package projetos;
import java.util.Random;
import java.util.Scanner;
public class projeto05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] senhas = new String[4];
        int posicao = 0;
        String continuar = "s";
        System.out.println("Bem vindo ao gerador de senhas fortes");
        System.out.println("======================================");
        while (continuar.equalsIgnoreCase("s")) {
            System.out.println("==========================================================");
            System.out.println("1 - Gerar senha personalizada");
            System.out.println("2 - Gerar senha forte aleatoria (16 caracteres, segura)");
            System.out.println("3 - ver ultimas senhas geradas");
            System.out.println("4 - Sair");
            System.out.println("==========================================================");
            int entrada = scanner.nextInt();
            if (entrada == 1) {
                System.out.println("==========================================================");
                System.out.println("Escolha o estilo da senha: " +
                        "1 - Letras minusculas" +
                        ", 2 - Maiusculas" +
                        ", 3 - numeros" +
                        ", 4 -  simbolos" +
                        ", 5 - Minusculas e maiusculas" +
                        ", 6 - letras e numeros" +
                        ", 7 - Letras + numeros e Simbolos");
                System.out.println("==========================================================");
                int opcao = scanner.nextInt();
                switch (opcao) {
                    case 1:
                        String senha = "";
                        String letras = "abcdefghijklmnopqrstuvwxyz";
                        for (int i = 0; i < 8; i++) {
                            int index = random.nextInt(letras.length());
                            senha += letras.charAt(index);

                        }
                        System.out.println("==========================================================");
                        System.out.println("Senha gerada > " + senha);
                        System.out.println("==========================================================");
                        if (posicao >= senhas.length) {
                            posicao = 0;
                        }
                            senhas[posicao] = senha;
                            posicao++;
                            break;
                            case 2:
                                String senha2 = "";
                                String maiusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                                for (int i = 0; i < 8; i++) {
                                    int index = random.nextInt(maiusculas.length());
                                    senha2 += maiusculas.charAt(index);
                                }
                                System.out.println("==========================================================");
                                System.out.println("Senha gerada > " + senha2);
                                System.out.println("==========================================================");
                                if (posicao >= senhas.length) {
                                    posicao = 0;
                                }
                                senhas[posicao] = senha2;
                                posicao++;
                                break;
                            case 3:
                                String senha3 = "";
                                String numeros = "0123456789";
                                for (int i = 0; i < 9; i++) {
                                    int index = random.nextInt(numeros.length());
                                    senha3 += numeros.charAt(index);
                                }
                                System.out.println("==========================================================");
                                System.out.println("Senha gerada > " + senha3);
                                System.out.println("==========================================================");
                                if (posicao >= senhas.length) {
                                    posicao = 0;
                                }
                                senhas[posicao] = senha3;
                                posicao++;
                                break;
                            case 4:
                                String senha4 = "";
                                String simbolos = "!@#$%&*";
                                for (int i = 0; i < 7; i++) {
                                    int index = random.nextInt(simbolos.length());
                                    senha4 += simbolos.charAt(index);
                                }
                                System.out.println("==========================================================");
                                System.out.println("Senha gerada > " + senha4);
                                System.out.println("==========================================================");
                                if (posicao >= senhas.length) {
                                    posicao = 0;
                                }
                                senhas[posicao] = senha4;
                                posicao++;
                                break;
                            case 5:
                                String senha5 = "";
                                String maiuminu = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
                                for (int i = 0; i < 8; i++) {
                                    int index = random.nextInt(maiuminu.length());
                                    senha5 += maiuminu.charAt(index);
                                }
                                System.out.println("==========================================================");
                                System.out.println("Senha gerada > " + senha5);
                                System.out.println("==========================================================");
                                if (posicao >= senhas.length) {
                                    posicao = 0;
                                }
                                senhas[posicao] = senha5;
                                posicao++;
                                break;
                            case 6:
                                String senha6 = "";
                                String maiuminunum = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
                                for (int i = 0; i < 8; i++) {
                                    int index = random.nextInt(maiuminunum.length());
                                    senha6 += maiuminunum.charAt(index);
                                }
                                System.out.println("==========================================================");
                                System.out.println("Senha gerada > " + senha6);
                                System.out.println("==========================================================");
                                if (posicao >= senhas.length) {
                                    posicao = 0;
                                }
                                senhas[posicao] = senha6;
                                posicao++;
                                break;
                            case 7:
                                String senha7 = "";
                                String tudo = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%&*";
                                for (int i = 0; i < 8; i++) {
                                    int index = random.nextInt(tudo.length());
                                    senha7 += tudo.charAt(index);
                                }
                                System.out.println("==========================================================");
                                System.out.println("Senha gerada > " + senha7);
                                System.out.println("==========================================================");
                                if (posicao >= senhas.length) {
                                    posicao = 0;
                                }
                                senhas[posicao] = senha7;
                                posicao++;
                                break;
                        }
                } else if (entrada == 2) {
                    String senha8 = "";
                    String forte = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%&*";
                    for (int i = 0; i < 16; i++) {
                        int index = random.nextInt(forte.length());
                        senha8 += forte.charAt(index);
                    }
                    System.out.println("==========================================================");
                    System.out.println("Senha forte gerada > " + senha8);
                    System.out.println("==========================================================");
                if (posicao >= senhas.length) {
                    posicao = 0;
                }
                senhas[posicao] = senha8;
                    posicao++;
                } else if (entrada == 3) {
                    System.out.println("==========================================================");
                    System.out.println(" Aqui estão as ultimas senhas geradas...");
                    for (int i = 0; i < senhas.length; i++) {
                        if (senhas[i] != null) {
                            System.out.println("- " + senhas[i]);
                        }
                    }
                    System.out.println("==========================================================");
                } else if (entrada == 4) {
                    System.out.println("==========================================================");
                    System.out.println("Saindo.....");
                    System.exit(0);
                } else {
                    System.out.println("Comando invalido!");
                }
            }
            System.out.println("Deseja continuar? s/n");
            System.exit(0);
        }
    }
