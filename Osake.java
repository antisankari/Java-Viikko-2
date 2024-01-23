public class Osake {
    public String symboli;
    public String nimi;
    private double edellinenHinta;
    private double nykyinenHinta;

    //konstruktori
    public Osake(String symboli, String nimi, double edellinenHinta, double nykyinenHinta) {
        this.symboli = symboli;
        this.nimi = nimi;
        this.edellinenHinta = edellinenHinta;
        this.nykyinenHinta = nykyinenHinta;
    }

    //setterit
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public void setSymboli(String symboli) {
        this.symboli = symboli;
    }

    public void setEdellinenHinta(double edellinenHinta) {
        this.edellinenHinta = edellinenHinta;
    }

    public void setNykyinenHinta(double nykyinenHinta) {
        this.nykyinenHinta = nykyinenHinta;
    }

    //getterit
    public double getMuutosProsentti() {
        return ((this.nykyinenHinta - this.edellinenHinta)/this.edellinenHinta * 100);
    }

    public String getOsakeNimi() {
        return this.nimi;
    }

    public String getOsakeSymboli() {
        return this.symboli;
    }

    public double getEdellinenHinta() {
        return this.edellinenHinta;
    }

    public double getNykyinenHinta() {
        return this.nykyinenHinta;
    }

    public double getHinnanMuutos() {
        return this.edellinenHinta - this.nykyinenHinta;
    }

    public String toString() {
        return "Osakkeen nimi: " + this.nimi
                + "\nOsakkeen tikkeri: " + this.symboli
                + "\nHinta eilen: " + this.edellinenHinta
                + "\nHinta tänään: " + this.nykyinenHinta
                + "\nHinnan muutos: " + String.format("%.2f", getHinnanMuutos())
                + "\nMuutos pros %: " + String.format("%.2f", getMuutosProsentti());
    }

    // pääohjelma
    public static void main(String[] args) {
        Osake lottolappu = new Osake("NOK","Nokia OYJ",34.5,34.35);
        System.out.println(lottolappu);

        /*
        Osake toTheMoon = new Osake("KEMPOWR", "Kempower", 30.46, 29.76);
        System.out.println(toTheMoon);
         */
        /*System.out.println("Osakkeen nimi: " + lottolappu.getOsakeNimi()
                + "\nOsakkeen tikkeri: " + lottolappu.getOsakeSymboli()
                + "\nHinta eilen: " + lottolappu.getEdellinenHinta()
                + "\nHinta tänään: " + lottolappu.getNykyinenHinta()
                + "\nHinnan muutos: " + String.format("%.2f", lottolappu.getHinnanMuutos())
                + "\nMuutos pros %: " + String.format("%.2f", lottolappu.getMuutosProsentti()));

         */
    }
}
