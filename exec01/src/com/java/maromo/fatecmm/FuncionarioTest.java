package com.java.maromo.fatecmm;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class FuncionarioTest {

    public static void main(String[] args) {
	// write your code here
        Funcionario func1 = new Funcionario();
        //func1 = new Funcionario();

        func1 = new Funcionario(1,"Joao", "Financas", "123",
                LocalDate.of(2019, Month.JULY, 25), true);

        Scanner sc = new Scanner(System.in);
        double salario;
        do {
            System.out.println("");
            System.out.println("************INICIO DO FUNCIONARIO ************");
            System.out.println("Digite o valor do salario de " + func1.nomeFunc + ":");
            salario = sc.nextDouble();
            func1.setSalario(salario);
        } while(salario <= 0);

        func1.imprimir();

        //aumentando salario
        double upSal;
        do {
            System.out.println("");
            System.out.println("************AUMENTO DE SALARIO DO FUNCIONARIO ************");
            System.out.println("Digite o valor do aumento de " + func1.nomeFunc + ":");
            upSal = sc.nextDouble();
            func1.atualizarSalario(upSal);
        } while(upSal <= 0);

        //demitindo funcionario
        func1.ativo = false;
        System.out.println("");
        System.out.println("************DEMISSAO DO FUNCIONARIO ************");
        func1.imprimir();

        sc.close();
    }
}
