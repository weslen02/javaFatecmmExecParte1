package com.java.maromo.fatecmm;

public class Porta {
    private boolean aberta = false;
    private String cor = "branca";
    private double dx, dy, dz;

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getDx() {
        return dx;
    }

    public void setDx(double dx) {
        this.dx = dx;
    }

    public double getDy() {
        return dy;
    }

    public void setDy(double dy) {
        this.dy = dy;
    }

    public double getDz() {
        return dz;
    }

    public void setDz(double dz) {
        this.dz = dz;
    }

    public void abre(){
        aberta = true;
    }

    public void fecha(){
        aberta = false;
    }

    public void pinta(String s){
        this.cor = s;
    }

    public boolean estaAberta() {
        return aberta;
    }

    @Override
    public String toString() {
        return "Porta{" +
                "aberta=" + (estaAberta() == true ? "aberta" : "fechada") +
                ", cor='" + cor + '\'' +
                ", dx=" + dx +
                ", dy=" + dy +
                ", dz=" + dz +
                '}';
    }
}
