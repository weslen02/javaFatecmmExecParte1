package com.java.maromo.fatecmm;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class MainPorta {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        Porta pr = new Porta();
        int opc;
        do {
            System.out.println("--------------- OPCOES -------------");
            System.out.printf("0 - SAIR%n1 - Abrir Porta%n2 - Fechar porta%n3 - Pintar Porta%n" +
                    "4 - Alterar Dimensao%n5 - Verificar Porta%nDigite:%n");
            opc = sc.nextInt();
            switch (opc) {
                case 0:
                    System.out.println("Até mais !!!!!!");
                break;

                case 1:
                    pr.abre();
                break;

                case 2:
                    pr.fecha();
                break;

                case 3:
                    System.out.println("Digite a cor");
                    pr.pinta(sc.next());
                break;

                case 4:
                    System.out.println("Digite a Dimensao X");
                    pr.setDx(sc.nextDouble());
                    System.out.println("Digite a Dimensao Y");
                    pr.setDy(sc.nextDouble());
                    System.out.println("Digite a Dimensao Z");
                    pr.setDz(sc.nextDouble());
                break;

                case 5:
                    System.out.println(pr);
                break;

                default:
                    System.out.println("Valor Invalido!!!!!!!");
            }

        } while(opc != 0);

        sc.close();
    }
}
