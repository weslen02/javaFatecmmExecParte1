package com.java.maromo.fatecmm;

import java.util.Scanner;

public class MainCasa {
    public static void main(String[] args) {
        // write your code here
        Casa[] vectPorta = new Casa[3];
        Scanner sc = new Scanner(System.in);

        int dig = -1;
        for (int i=0; i < vectPorta.length; i++) {
            System.out.println("|Start----------------------------------------------------------|");
            System.out.printf("Porta #%d%n", i+1);
            System.out.printf("0 - Abrir a Porta%nDigite qq outro num para fechar!%nDigte:%n");
            dig = sc.nextInt();
            System.out.printf("Digite a cor da porta:%n");
            vectPorta[i] = new Casa((dig==0?true:false), sc.next());
            System.out.println("|-------------------------------------------------------------End|");
            System.out.println("");
        }

        Casa cs = new Casa();
        for (dig = 0; dig < vectPorta.length; dig++) {
            System.out.println(vectPorta[dig].porta);
            if (vectPorta[dig].porta.estaAberta()) {
                cs.setQtd(1);
            }
        }
        cs.qtdPortasAbertas();
    }
}
