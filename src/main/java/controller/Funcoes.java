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

                String status = statusMotorista;

                Motorista novoMotorista = new Morador(nome, cpf, cnh, idMorador, residencia, status);
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

                String status = statusMotorista;

                Motorista novoMotorista = new Visitante(nome, cpf, cnh, idVisitante, residenciaVisitada, autorizadoPor,
                        status);
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
        if (veiculos.isEmpty() || motoristas.isEmpty()) {
            System.out.println("Nenhum veículo/motorista cadastrado ainda. \n");
            return;
        }

        System.out.println("=== Veículos/Motoristas Cadastrados ===");

        int tamanho = Math.min(veiculos.size(), motoristas.size());

        for (int i = 0; i < tamanho; i++) {
            Veiculo v = veiculos.get(i);
            Motorista motorista = motoristas.get(i);

            System.out.println("=== Veículo ===");
            System.out.println("Tipo: " + v.getTipo());
            System.out.println("Modelo: " + v.getModelo());
            System.out.println("Cor: " + v.getCor());
            System.out.println("Placa: " + v.getPlaca());

            System.out.println("=== Motorista ===");
            System.out.println("Nome: " + motorista.getNome());
            System.out.println("CPF: " + motorista.getCpf());
            System.out.println("CNH: " + motorista.getCnh());

            if (motorista.getStatus().equalsIgnoreCase("morador")) {
                Morador morador = (Morador) motorista;
                System.out.println("ID do morador: " + morador.getIdMorador());
                System.out.println("Residência: " + morador.getResidencia());
            } else if (motorista.getStatus().equalsIgnoreCase("visitante")) {
                Visitante visitante = (Visitante) motorista;
                System.out.println("Residência visitada: " + visitante.getResidenciaVisitada());
                System.out.println("Autorizado por: " + visitante.getAutorizadoPor());
            }

            System.out.println("-------------------------");
        }
        System.out.println();
    }

    public static void editarDados() {

    }
}