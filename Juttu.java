public class Juttu {
    private int x;
    private int y;
    private static int z = 0;

    public Juttu() {
        x = z;
        y = z;
    }

    static void asetaJuttu(int a) {
        z = a;
    }

    //pääohjelma
    public static void main(String[] args) {
        Juttu yksi = new Juttu();
        Juttu kaksi = new Juttu();
        Juttu kolme = new Juttu();

        // e)
        Juttu.asetaJuttu(9);

        //System.out.println("Tämä on yksi:" + yksi.z);
        //System.out.println("Tämä on kaksi:" + kaksi.z);
        //System.out.println("Tämä on kolme:" + kolme.z);
    }

    /*
    a, b & c)
    pääohjelmassa luotiin kolme erillistä muuttujaa x, kolme erillistä muuttujaa y ja kolme erillistä muuttujaa z,
    koska luokan Juttu arvot ovat yksityisiä ja ilmentymiä on yhteensä kolme
    d) kaikkien ilmentymien kenttien x ja y arvo on 0
     */

}