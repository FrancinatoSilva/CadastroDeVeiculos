package controller;

import model.Veiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcoes {

    public static void opcao1() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual tipo de veículo você deseja cadastrar (carro/moto): ");
        String tipo = sc.nextLine();

        if (tipo.equalsIgnoreCase("carro")) {
            List<Veiculo> veiculos = new ArrayList<>();

            System.out.println("---Preencha os dados à seguir---");

            System.out.print("Modelo:");
            String modelo = sc.nextLine();

            System.out.print("Cor: ");
            String cor = sc.nextLine();

            System.out.print("Placa: ");
            String placa = sc.nextLine();

            Veiculo novoVeiculo = new Veiculo(tipo, modelo, cor, placa);

        } else if (tipo.equalsIgnoreCase("moto")) {
            List<Veiculo> veiculos = new ArrayList<>();

            System.out.println("---Preencha os dados à seguir---");

            System.out.print("Modelo:");
            String modelo = sc.nextLine();

            System.out.print("Cor: ");
            String cor = sc.nextLine();

            System.out.print("Placa: ");
            String placa = sc.nextLine();

            Veiculo novoVeiculo = new Veiculo(tipo, modelo, cor, placa);

        } else {
            System.out.println("Tipo de veiculo inválido!");
        }




        sc.close();
    }
}