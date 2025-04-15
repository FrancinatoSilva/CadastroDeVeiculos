package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ControleDeFluxo {

    public static void exibirMenu() {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("-Opções disponíveis");
            System.out.println("1. Cadastrar veículo e motorista");
            System.out.println("2. Listar veículos e motoristas cadastrados");
            System.out.println("3. Editar dados cadastrados");
            System.out.println("4. deletar cadastro");
            System.out.println("5. Encerrar aplicação");

            try {
                System.out.println();
                System.out.print("Informe o número referente à opção desejada: ");
                int opcao = sc.nextInt();
                sc.nextLine();
                System.out.println();

                switch (opcao) {
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:

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
        }

        sc.close();

        }
    }

