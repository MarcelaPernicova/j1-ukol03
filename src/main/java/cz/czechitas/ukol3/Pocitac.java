package cz.czechitas.ukol3;

import static java.util.Objects.isNull;

public class Pocitac {

    private Procesor mujProcesor;
    private Pamet mojePamet;
    private Pamet ram;
    private Disk mujDisk;

    private Disk pevnyDisk;

    private Procesor cpu;



    public boolean isJeZapnuty() {
        return this.jeZapnuty;
    }
    public void setCpu(Procesor procesor){
        this.cpu=procesor;
    }

    public void setPevnyDisk(Disk disk){
        this.pevnyDisk=disk;
    }
    public void setRam(Pamet pamet){
        this.ram=pamet;
    }
    public void zapniSe() {
        if (!jeZapnuty) {
            if (this.mujProcesor==null||this.mojePamet==null ||this.mujDisk==null) {
                System.err.println("Komponenty počítače se nenačetly.");
                return;
            }

            this.jeZapnuty=true;
            System.out.println("Počítač se zapnul.");
        } else {
            System.err.println("Počítač je už zapnutý.");
        }

    }

    public void vypniSe() {
        if (jeZapnuty) {
            vypniSe();
        } else {
            System.err.println("Počítač je už vypnutý.");
        }
    }

    public boolean jeZapnuty;

    {
        if (jeZapnuty) {
            System.out.println("Počítač je zapnutý.");

        } else {
            System.out.println("Počítač je vypnutý.");

        }
    }
}




