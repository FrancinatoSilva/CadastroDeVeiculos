package controller;

import model.Veiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcoes {

    private static List<Veiculo> veiculos = new ArrayList<>();

    public static void cadastro() {
        Scanner sc = new Scanner(System.in);

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

        } else {
            System.out.println("Tipo de veículo inválido!\\n");
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