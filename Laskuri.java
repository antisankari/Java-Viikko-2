public class Laskuri {

    private int luku1, luku2;
    private String s1;

    public Laskuri(){
        this.luku1 = 0;
        this.luku2 = 0;
    }

    public Laskuri(int luku1, int luku2, String s1) {
        this.luku1 = luku1;
        this.luku2 = luku2;
        this.s1 = s1;
    }
    public int kerro() {
        int tulo = luku1 * luku2;
        return tulo;
    }

    //pääohjelma
    public static void main(String[] args){
        Laskuri laskin1 = new Laskuri(23,29,"Moikka");
        System.out.println(laskin1.luku1 + " " + laskin1.luku2 + " " + laskin1.s1);
        System.out.println(laskin1.kerro());
        System.out.println(laskin1.s1);
    }
}