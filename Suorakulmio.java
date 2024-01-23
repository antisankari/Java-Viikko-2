public class Suorakulmio {
    private double leveys;
    private double korkeus;

    public Suorakulmio() {
        this.leveys = 1.0;
        this.korkeus = 1.0;
    }

    public Suorakulmio(double lev, double kor) {
        this.leveys = lev;
        this.korkeus = kor;
    }

    //getterit
    public double getAla() {
        return leveys * korkeus;
    }

    public double getYmparys() {
        return (2 * leveys) + (2 *  korkeus);
    }

    //pääohjelma
    public static void main(String[] args) {
        Suorakulmio kulmio1 = new Suorakulmio(4.0,40.0);
        Suorakulmio kulmio2 = new Suorakulmio(3.5,35.9);

        System.out.println("kulmio1 leveys: " + kulmio1.leveys + " korkeus: " + kulmio1.korkeus + " pinta-ala: " + kulmio1.getAla() + " ympärysmitta: " + kulmio1.getYmparys());
        System.out.println("kulmio2 leveys: " + kulmio2.leveys + " korkeus: " + kulmio2.korkeus + " pinta-ala: " + kulmio2.getAla() + " ympärysmitta: " + kulmio2.getYmparys());
    }
}
