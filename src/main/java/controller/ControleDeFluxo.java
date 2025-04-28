package controller;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ControleDeFluxo {

    public static void exibirMenu() {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("-Opções disponíveis");
            System.out.println("1. Cadastrar veículo e motorista");
            System.out.println("2. Listar veículos e motoristas cadastrados");
            System.out.println("3. deletar cadastro");
            System.out.println("4. Encerrar aplicação");

            try {
                System.out.println();
                System.out.print("Informe o número referente à opção desejada: ");
                opcao = sc.nextInt();
                sc.nextLine();
                System.out.println();

                switch (opcao) {
                    case 1:
                        Funcoes.cadastro();
                        break;
                    case 2:
                        Funcoes.listarCadastrados();
                        break;
                    case 3:
                        //implementar depois
                        break;
                    case 4:
                        System.out.println("Encerrando aplicação...");
                        break;

                    default:
                        System.out.println("OPÇÃO INVÁLIDA. TENTE ENTRE 1 E 5.");
                }

            } catch (InputMismatchException e) {
                System.out.println("ENTRADA INVÁLIDA, DIGITE APENAS NÚMEROS.");
                sc.nextLine();

            } catch (Exception e) {
                System.out.println("ERRO INESPERADO: " + e.getMessage());
            }
        } while (opcao != 4);

        sc.close();

        }
    }

