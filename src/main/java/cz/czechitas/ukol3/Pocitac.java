package cz.czechitas.ukol3;

public class Pocitac {

    public boolean isJeZapnuty() {
        return this.jeZapnuty;
    }

    public void zapniSe(){
        if (jeZapnuty){
            System.err.println("Počítač je už zapnutý.");
        } else {
            zapniSe();
        }

    }
    public void vypniSe(){
    if (jeZapnuty){
        vypniSe();
    } else {
            System.err.println("Počítač je už vypnutý.");
        }
    }
    private boolean jeZapnuty;
}
