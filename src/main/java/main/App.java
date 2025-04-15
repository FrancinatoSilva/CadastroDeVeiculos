package main;

import controller.ControleDeFluxo;
import model.Motorista;
import model.Veiculo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        List <Veiculo> veiculos = new ArrayList<>();
        List <Motorista> motoristas = new ArrayList<>();

        System.out.println("====Sistema de controle de acesso====");
        ControleDeFluxo.exibirMenu();
        System.out.println();





        sc.close();
    }
}