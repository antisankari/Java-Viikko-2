public class Biisi {

    private String nimi;
    private String esittaja;
    private int spotifySoittomaara;

    /**
     * Konstruktori
     * @param nimi
     * @param esittaja
     * @param spotifySoittomaara
     */
    public Biisi(String nimi, String esittaja, int spotifySoittomaara) {
        this.nimi = nimi;
        this.esittaja = esittaja;
        this.spotifySoittomaara = spotifySoittomaara;
    }

    //setterit
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public void setEsittaja(String esittaja) {
        this.esittaja = esittaja;
    }

    public void setSpotifySoittomaara(int spotifySoittomaara) {
        this.spotifySoittomaara = spotifySoittomaara;
    }

    //getterit
    public String getNimi() {
        return this.nimi;
    }

    public String getEsittaja() {
        return this.esittaja;
    }

    public int getSpotifySoittomaara() {
        return this.spotifySoittomaara;
    }
    // pääohjelma
    public static void main(String[] args){}
}
