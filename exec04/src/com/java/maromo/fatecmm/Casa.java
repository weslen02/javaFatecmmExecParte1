package com.java.maromo.fatecmm;

public class Casa {
    Porta porta = new Porta();
    private int qtd = 0;

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd += qtd;
    }

    public Casa() {

    }
    public Casa(boolean aberta, String cor) {
        porta.setAberta(aberta);
        porta.setCor(cor);
    }

    public void qtdPortasAbertas() {
        System.out.println("Quanditdade de portas abertas: " + getQtd());
    }
}
