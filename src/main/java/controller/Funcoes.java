package controller;

import model.Morador;
import model.Motorista;
import model.Veiculo;
import model.Visitante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcoes {

    private static List<Veiculo> veiculos = new ArrayList<>();
    private static List<Motorista> motoristas = new ArrayList<>();

    public static void cadastro() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Qual tipo de veículo você deseja cadastrar (carro/moto): ");
            String tipo = sc.nextLine();

            if (tipo.equalsIgnoreCase("carro") || tipo.equalsIgnoreCase("moto")) {
                System.out.println("---Preencha os dados à seguir---");

                System.out.print("Modelo:");
                String modelo = sc.nextLine();

                System.out.print("Cor: ");
                String cor = sc.nextLine();

                System.out.print("Placa: ");
                String placa = sc.nextLine();

                Veiculo novoVeiculo = new Veiculo(tipo, modelo, cor, placa);
                veiculos.add(novoVeiculo);

                System.out.println("Veículo cadastrado com sucesso!");
                System.out.println();
                break;

            } else {
                System.out.println("Tipo de veículo inválido!\\n");
            }
        }

        while (true) {
            System.out.print("O motorista é morador ou visitante: ");
            String statusMotorista = sc.nextLine();

            if (statusMotorista.equalsIgnoreCase("morador")) {
                System.out.println("---Preencha os dados à seguir---");

                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("CPF: ");
                String cpf = sc.nextLine();

                System.out.print("CNH: ");
                String cnh = sc.nextLine();

                System.out.print("ID do morador: ");
                Integer idMorador = sc.nextInt();
                sc.nextLine();

                System.out.print("Residência: ");
                String residencia = sc.nextLine();

                Motorista novoMotorista = new Morador(nome, cpf, cnh, idMorador, residencia);
                motoristas.add(novoMotorista);

                System.out.print("Motorista cadastrado com sucesso!");
                System.out.println();
                break;

            } else if (statusMotorista.equalsIgnoreCase("visitante")) {
                System.out.println("---Preencha os dados à seguir---");

                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("CPF: ");
                String cpf = sc.nextLine();

                System.out.print("CNH: ");
                String cnh = sc.nextLine();

                System.out.print("ID do visitante: ");
                Integer idVisitante = sc.nextInt();
                sc.nextLine();

                System.out.print("Residência visitada: ");
                String residenciaVisitada = sc.nextLine();

                System.out.print("Autorizado por: ");
                String autorizadoPor = sc.nextLine();

                Motorista novoMotorista = new Visitante(nome, cpf, cnh, idVisitante, residenciaVisitada, autorizadoPor);
                motoristas.add(novoMotorista);

                System.out.println("Visitante cadastrado com sucesso!");
                System.out.println();
                break;

            } else {
                System.out.println("Tipo de veículo inválido!\\n");
            }
        }
    }

    public static void listarCadastrados() {
        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado ainda. \n");
            return;
        }

        System.out.println("=== Veículos Cadastrados ===");
        for (Veiculo v : veiculos) {
            System.out.println("Tipo: " + v.getTipo());
            System.out.println("Modelo: " + v.getModelo());
            System.out.println("Cor: " + v.getCor());
            System.out.println("Placa " + v.getPlaca());
            System.out.println("-------------------------");
        }
        System.out.println();
    }
}