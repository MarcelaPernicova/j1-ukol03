package cz.czechitas.ukol3;

public class Procesor {

    private String vyrobce = "AMD";

    public String getVyrobce() {
        return vyrobce;
    }

    public void setVyrobce(String vyrobce) {
        this.vyrobce = vyrobce;
    }

    public long getRychlost() {
        return rychlost;
    }

    public void setRychlost(long rychlost) {
        this.rychlost = rychlost;
    }

    private long rychlost = 5_300_000_000_000L;

    @Override
    public String toString() {
        return "Procesor{" +
                "vyrobce='" + vyrobce + '\'' +
                ", rychlost=" + rychlost +
                '}';
    }
}
