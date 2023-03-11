package cz.czechitas.ukol3;

import static java.util.Objects.isNull;

public class Pocitac {


    private Pamet ram;

    public boolean jeZapnuty;
    private Disk pevnyDisk;

    private Procesor cpu;


    public boolean isJeZapnuty() {
        return this.jeZapnuty;
    }

    public void setProcesor(Procesor procesor) {
        this.cpu = procesor;
    }

    public void setPevnyDisk(Disk disk) {
        this.pevnyDisk = disk;
    }

    public void setRam(Pamet pamet) {
        this.ram = pamet;
    }

    public void zapniSe() {
        if (!jeZapnuty) {
            if (this.ram == null || this.cpu == null || this.pevnyDisk == null) {
                System.err.println("Komponenty počítače se nenačetly.");
                return;
            }
            this.jeZapnuty = true;
            System.out.println("Počítač se zapnul.");
        } else {
            System.err.println("Počítač je už zapnutý.");
        }

    }

    public void vytvorSouborOVelikosti(long velikost) {
        if (jeZapnuty) {
            this.pevnyDisk.setVyuziteMisto(this.pevnyDisk.getVyuziteMisto() + velikost);
            if (pevnyDisk.getVyuziteMisto() > pevnyDisk.getKapacita()) {
                System.err.println("Kapacita na disku je příliš malá.");
                pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() - velikost);


            }
        }
    }

    public void smazSouborOVelikosti (long velikost){
        if (jeZapnuty){
            this.pevnyDisk.setVyuziteMisto(this.pevnyDisk.getVyuziteMisto() - velikost);
            if (pevnyDisk.getVyuziteMisto() < 0){
                pevnyDisk.setVyuziteMisto (0);
            }
        }
    }

    public void vypniSe() {
        if (jeZapnuty) {
            System.out.println("Počítač se vypnul.");
        } else {
            System.err.println("Počítač je už vypnutý.");
        }
    }


    @Override
    public String toString() {
        return "Pocitac{" +
                "ram=" + ram +
                ", jeZapnuty=" + jeZapnuty +
                ", pevnyDisk=" + pevnyDisk +
                ", cpu=" + cpu +
                '}';
    }
}




