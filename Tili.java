/**
 * @Tili.java
 * @author Anssi Sankari
 * @version 1.00 2024/01/16
 */
import java.util.Date;
import java.lang.Math;
public class Tili {
    private int id;
    private double saldo = 0.0;
    private double vuosiKorko = 0.0;
    private Date luontiPaiva;


    public Tili() {
        this.luontiPaiva = new Date();
    }
    public Tili(int id, double saldo) {
        this.id = id;
        this.saldo = saldo;
        this.luontiPaiva = new Date();
    }

    //methods

    /**
     * metodi nosto vähentää saldosta nostetun summan ja palauttaa uuden saldon
     * @param nostoSumma summa joka nostetaan tililtä
     * @return palauttaa uuden saldon
     */
    public double nosto(double nostoSumma) {
        this.saldo -= nostoSumma;
        return this.saldo;
    }

    /**
     * metodi talleta lisää saldoon talletettavan summan ja palauttaa uuden saldon
     * @param talletusSumma summa joka talletetaan tilille
     * @return palauttaa uuden saldon
     */
    public double talleta(double talletusSumma) {
        this.saldo += talletusSumma;
        return this.saldo;
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setVuosiKorko(double vuosiKorko) {
        this.vuosiKorko = vuosiKorko;
    }

    //getters
    public int getId() {
        return this.id;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double getVuosiKorko() {
        return this.vuosiKorko;
    }

    public Date getLuontiPaiva() {
        return this.luontiPaiva;
    }

    public double getKuukausiKorkoProsentti() {
        double kuukausiKorkoPros = Math.pow((1.0 + (this.vuosiKorko / 100.0)), (1.0 / 12.0)) - 1.0;
        return kuukausiKorkoPros;
    }
    public double getKuukausiKorko() {
        double kuukausiKorkoSumma = this.saldo * (1 + getKuukausiKorkoProsentti()) - this.saldo;
        return kuukausiKorkoSumma;
    }

    //pääohjelma
    public static void main(String[] args) {
        Tili omaTili = new Tili(1122,20000.0);
        omaTili.setVuosiKorko(4.5);
        System.out.println(omaTili.vuosiKorko);
        //System.out.println(omaTili.saldo);
        //omaTili.nosto(2500);
        //System.out.println(omaTili.saldo);
        //omaTili.talleta(3000.0);
        System.out.println(omaTili.saldo);
        System.out.println("Tämä on kk-korko%: " + String.format("%.3f", omaTili.getKuukausiKorkoProsentti()));
        System.out.println("Tämä on kk-korko summa: " + String.format("%.2f", omaTili.getKuukausiKorko()));
        System.out.println(omaTili.getLuontiPaiva());

    }
}
