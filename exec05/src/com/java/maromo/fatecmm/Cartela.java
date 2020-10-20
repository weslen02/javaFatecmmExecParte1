package com.java.maromo.fatecmm;

import java.util.Random;

public class Cartela {
    final int TAM = 6;
    private int i;
    private int j;
    private int k;
    private int count;
    private boolean diagonal;
    private boolean linha;
    private boolean coluna;
    private boolean linhaBoole[] = new boolean[TAM];
    private boolean colBoole[] = new boolean[TAM];
    private Random aleatorio = new Random();
    private int[][] cartelaJogador = new int[TAM][TAM];
    private int[] numSorteado = new int[24];

    public Cartela() {
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.count = 0;
        criarCartela();
        sortearNum();
        conferirSorteio();
    }

    private void criarCartela() {
        for (i = 0; i < TAM; i++) {
            for (j = 0; j < TAM; j++) {
                this.cartelaJogador[i][j] = this.aleatorio.nextInt(75 + 1);
            }
        }
    }

    private void sortearNum() {
        for (i = 0; i < numSorteado.length; i++) {
            this.numSorteado[i] = this.aleatorio.nextInt(75 + 1);
        }
    }

    private boolean validaDiagonal() {
        count = 0;
        for (i = 0; i < TAM; i++) {
            for (j = 0; j < TAM; j++) {
                //if para entrar apenas na diagonal
                if (i == j) {
                    for (k = 0; k < this.numSorteado.length; k++) {
                        //A diagonal tem 6 numeros, se entrar nesse if 6x significa que diagonal é Bingo!
                        if (this.numSorteado[k] == this.cartelaJogador[i][j]) {
                            count++;
                            //encontrou um valor semelhante sai fora do vetor, do contrário o count seria maior que 6.
                            break;
                        }
                    }
                }
            }
        }
        if (count == TAM) {
            return true;
        } else {
            return false;
        }
    }

    private boolean validaLinha() {
        for (i = 0; i < TAM; i++) {
            count = 0;
            for (j = 0; j < TAM; j++) {
                for (k = 0; k < this.numSorteado.length; k++) {
                    if (this.numSorteado[k] == this.cartelaJogador[i][j]) {
                        count++;
                        break;
                    }
                }
            }
            if (count == TAM) {
                linhaBoole[i] = true;
            } else {
                linhaBoole[i] = false;
            }
        }
        return checkLinhaBoole();
    }

    private boolean checkLinhaBoole() {
        for (i = 0; i < linhaBoole.length; i++) {
            if (linhaBoole[i]) {
                return true;
            }
        }
        return false;
    }

    private boolean validaColuna() {
        for (j = 0; j < TAM; j++) {
            count = 0;
            for (i = 0; i < TAM; i++) {
                for (k = 0; k < this.numSorteado.length; k++) {
                    if (numSorteado[k] == cartelaJogador[i][j]) {
                        count++;
                        break;
                    }
                }
            }
            if (count == TAM) {
                colBoole[j] = true;
            } else {
                colBoole[j] = false;
            }
        }
        return checkColBoole();
    }

    private boolean checkColBoole() {
        for (i = 0; i < TAM; i++) {
            if (colBoole[i]) {
                return true;
            }
        }
        return false;
    }

    private void conferirSorteio() {
        diagonal = validaDiagonal();
        linha = validaLinha();
        coluna = validaColuna();
    }

    public void imprimirCartelas() {
        System.out.println("##########################################");
        System.out.println("Cartela do Jogador");
        for (i = 0; i < TAM; i++) {
            for (j = 0; j < TAM; j++) {
                if (j == 5) {
                    System.out.printf("|%d\t%n", this.cartelaJogador[i][j]);
                } else {
                    System.out.printf("|%d\t", this.cartelaJogador[i][j]);
                }
            }
        }
        printChar();

        System.out.println("Numeros Sorteados");
        for (k = 0; k < numSorteado.length; k++) {
            System.out.printf("|%d\t", this.numSorteado[k]);
        }
        System.out.printf("%n");
        if (diagonal) {
            printChar();
            System.out.println("Bingo na Diagonal");
            for (i = 0; i < TAM; i++) {
                for (j = 0; j < TAM; j++) {
                    if (i == j) {
                        System.out.printf("|%d\t%n", this.cartelaJogador[i][j]);
                    }
                }
            }
        }
        if (linha) {
            printChar();
            System.out.println("Bingo na Linha");
            for (i = 0; i < TAM; i++) {
                if (linhaBoole[i] == true) {
                    for (j = 0; j < TAM; j++) {
                        System.out.printf("|%d\t", this.cartelaJogador[i][j]);
                    }
                }
            }
        }
        if (coluna) {
            printChar();
            System.out.println("Bingo na Coluna");
            for (j = 0; j < TAM; j++) {
                if (colBoole[j] == true) {
                    for (i = 0; i < TAM; i++) {
                        System.out.printf("|%d\t%n", this.cartelaJogador[i][j]);
                    }
                }
            }
        }
        printChar();
        if (!(diagonal || linha || coluna)) System.out.println("Azarado!!!! Nao deu Bingo em nada.");

    }
    private void printChar() {
        System.out.println("##########################################");
        System.out.println("");
        System.out.println("##########################################");
    }

}
