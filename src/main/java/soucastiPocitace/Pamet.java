package soucastiPocitace;

public class Pamet {
    public long getKapacita() {
        return kapacita;
    }

    public void setKapacita(long kapacita) {
        this.kapacita = kapacita;
    }
    public String toString() {
        return String.format("kapacita: %d RAM", this.kapacita);
    }
    private long kapacita = 8_000_000_000L;
}
