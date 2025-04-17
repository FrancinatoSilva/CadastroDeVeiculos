package main;

import controller.ControleDeFluxo;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("====Sistema de controle de acesso====");
        ControleDeFluxo.exibirMenu();
        System.out.println();





        sc.close();
    }
}