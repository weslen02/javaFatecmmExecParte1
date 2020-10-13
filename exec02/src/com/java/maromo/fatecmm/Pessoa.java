package com.java.maromo.fatecmm;

public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void fazAniversario() {
        int count = 0;
        System.out.println("****** FELIZ ANIVERSARIO Que venham mais 100 anos *******");
        System.out.println("Aiversario #" + count + 1);
        System.out.println("O ultimo dado registrado da sua idade eh: " + idade);
        System.out.println("");

        if (idade > 969) {
            System.out.printf("%nParabens voce esta vivendo mais que Matusalem%n");
        }

        System.out.println("Atualizando idade");

        try {
            Thread.sleep(500);
            System.out.println(".");
            Thread.sleep(500);
            System.out.println(".");
            Thread.sleep(500);
            System.out.println(".");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        count++;

        idade += count;

        imprimir();
    }

    public void imprimir() {
        System.out.println("nome = " + nome);
        System.out.println("idade = " + idade);
    }
}
