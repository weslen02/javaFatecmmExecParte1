package com.java.maromo.fatecmm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Cartela ct = new Cartela();
        Scanner sc = new Scanner(System.in);
        int op = 0;

        do {
            System.out.println("");
            System.out.printf("1 - Novo Sorteio%n2 - Imprimir Sorteio%n3 - Sair%nEscolha:%n");
            op = sc.nextInt();
            if (op == 1) {
                System.out.println("Sorteio realizado com sucesso!!!");
                System.out.println("Escolha a opcao 2 para imprimir o resultado.");
                ct = new Cartela() ;
            } else if (op == 2) {
                ct.imprimirCartelas();
            } else if (op == 3) {
                System.out.println("Ate logo!");
            } else {
                System.out.println("Valor Invalido!!!");
            }
        } while (op != 3);

        sc.close();
    }
}
