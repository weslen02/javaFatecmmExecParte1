package com.java.maromo.fatecmm;

import java.time.LocalDate;

public class Funcionario {
    public int idFun;
    public String nomeFunc;
    public String departamento;
    public LocalDate dataContratacao;
    private double salario;
    public String documento;
    public boolean ativo;

    public int getIdFun() {
        return idFun;
    }

    public void setIdFun(int idFun) {
        this.idFun = idFun;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        } else {
            System.out.printf("O valor %.2f não eh um valor valido para salario inicial!%n", salario);
            System.out.println("Digite um valor > 0");
        }
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void atualizarSalario(double aumento) {
        if (aumento > 0) {
            this.salario+= aumento;
            System.out.println("Aumento de: " + String.format("%.2f", aumento) + "| Salario atual: " + (String.format("%.2f", this.salario - aumento))
                    + "| Salario + aumento, resulta no total de: " + String.format("%.2f",this.salario));
        } else {
            System.out.printf("O valor %.2f não eh um valor valido para aumento!", aumento);
        }
    }

    public void demiteFuncionario() {
        this.ativo = false;
    }

    public void imprimir() {
        System.out.println("| >>> Funcionario: " + nomeFunc);
        System.out.println("| >>> idFun = " + idFun);
        System.out.println("| >>> admissao = " + dataContratacao);
        System.out.println("| >>> departamento = " + departamento);
        System.out.println("| >>> salario = " + salario);
        System.out.println("| >>> documento = " + documento);
        if (!ativo) {
            System.out.println("| >>> Nao Ativo");
            System.out.println("| >>> demissao = " + LocalDate.now());
        } else {
            System.out.println("| >>> Ativo");
        }
    }

    /*Construtor Padrao*/
    public Funcionario() {

    }

    /*Construtor para o func1 para não ficar digitando os mesmos dados toda hora*/
    public  Funcionario(int id, String nome, String departamento, String documento, LocalDate admissao, boolean ativo) {
        this.idFun = id;
        this.nomeFunc = nome;
        this.departamento = departamento;
        this.documento = documento;
        this.dataContratacao = admissao;
        this.ativo = ativo;
    }
}
