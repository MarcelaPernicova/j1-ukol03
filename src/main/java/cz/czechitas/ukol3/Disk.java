package cz.czechitas.ukol3;



public class Disk {
    public long getKapacita() {
        return kapacita;
    }

    public void setKapacita(long kapacita) {
        this.kapacita = kapacita;
    }
    public String toString() {
        return String.format("kapacita: %d bajtů, využité místo: %d bajtů", this.kapacita, this.vyuziteMisto);
    }

    public long getVyuziteMisto() {
        return vyuziteMisto;
    }

    public void setVyuziteMisto(long vyuziteMisto) {
        this.vyuziteMisto = vyuziteMisto;
    }

    private long kapacita = 254_548_554_547L;

    private long vyuziteMisto = 125_256_458_230L;





}
