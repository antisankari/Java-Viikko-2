public class testipaaohjelma {
    public static void main(String[] args){
        Biisi biisi1 = new Biisi("Song1","Artist A",16);
        Biisi biisi2 = new Biisi("Song2","Blur",512512);
        Biisi biisi3 = new Biisi("Song3","Artist C",128);

        System.out.println("Kappale: " + biisi1.getNimi() + ", Esittäjä: " +
                biisi1.getEsittaja() + ", Soittokerrat: " + biisi1.getSpotifySoittomaara());
        System.out.println("Kappale: " + biisi2.getNimi() + ", Esittäjä: " +
                biisi2.getEsittaja() + ", Soittokerrat: " + biisi2.getSpotifySoittomaara());
        System.out.println("Kappale: " + biisi3.getNimi() + ", Esittäjä: " +
                biisi3.getEsittaja() + ", Soittokerrat: " + biisi3.getSpotifySoittomaara());

        /*
        *testataan settereitä

        biisi3.setEsittaja("TestiEsittäjä"); biisi3.setNimi("TestiLaulu"); biisi3.setSpotifySoittomaara(129);

        System.out.println("Kappale: " + biisi3.getNimi() + ", Esittäjä: " +
                biisi3.getEsittaja() + ", Soittokerrat: " + biisi3.getSpotifySoittomaara());

         */
    }
}
