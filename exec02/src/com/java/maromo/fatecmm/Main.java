package com.java.maromo.fatecmm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sair;
        Pessoa ps = new Pessoa();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        ps.setNome(sc.next());

        //Nao tratei negativo
        System.out.println("Digite sua idade:");
        ps.setIdade(sc.nextInt());

        ps.imprimir();

        do {
            ps.fazAniversario();
            do {
                System.out.println("Digite 0 para SAIR | digite 1 para ADICIONAR mais um ano na sua idade");
                sair = sc.nextInt();
                if (sair != 0 && sair != 1) {
                    System.out.println("Valor invalido!!!!!!!!!");
                }
            } while (sair != 0 && sair != 1);
        }while(sair != 0);

        sc.close();
    }
}
