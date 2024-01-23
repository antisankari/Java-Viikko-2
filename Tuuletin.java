/**
 * Tuuletin.java
 *
 * @author Anssi Sankari
 * @version 1.00 2024/01/16
 */
public class Tuuletin {
    private static int hidas = 1;
    private static int normaali = 2;
    private static int nopea = 3;
    private int nopeus = 1;
    private boolean kytketty = false;
    private double halkaisija = 5.0;
    private String vari = "blue";

    //parametriton konstruktori luokalle
    /*
    public Tuuletin() {


    }*/

    //pääohjelma
    public static void main(String[] args) {
        Tuuletin fan0 = new Tuuletin();
        Tuuletin fan1 = new Tuuletin();
        fan0.setNopeus(3);
        fan0.setHalkaisija(10.0);
        fan0.setVari("keltainen");
        fan0.setKytketty(true);
        System.out.println(fan0);
        fan1.setNopeus(2);
        fan1.setHalkaisija(5.0);
        fan1.setVari("blue");
        fan1.setKytketty(false);
        System.out.println(fan1);
    }

    //getters and setters
    public boolean getKytketty() {
        return this.kytketty;
    }

    public void setKytketty(boolean kytketty) {
        this.kytketty = kytketty;
    }

    public int getNopeus() {
        return this.nopeus;
    }

    public void setNopeus(int nopeus) {
        this.nopeus = nopeus;
    }

    public double getHalkaisija() {
        return this.halkaisija;
    }

    public void setHalkaisija(double halkaisija) {
        this.halkaisija = halkaisija;
    }

    public String getVari() {
        return this.vari;
    }

    public void setVari(String vari) {
        this.vari = vari;
    }

    //toString palauttaja
    public String toString() {
        if (getKytketty()) {
            return "Nopeus: " + getNopeus()
                    + ", Väri: " + getVari()
                    + ", Säde: " + (getHalkaisija() / 2);
        } else {
            return "Väri: " + getVari()
                    + ", Halkaisija: " + getHalkaisija()
                    + ", tuuletin ei ole päällä";
        }
    }
}
