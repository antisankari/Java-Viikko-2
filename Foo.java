public class Foo {

    int i;

    static int s;

    public static void main (String [] args) {

        Foo f1 = new Foo();

        System.out.println("f1.i on " + f1.i + " f1.s on " + f1.s);

        Foo f2 = new Foo();

        System.out.println("f2.i on " + f2.i + " f2.s on " + f2.s);

        Foo f3 = new Foo();

        System.out.println("f3.i on " + f3.i + " f3.s on " + f3.s);

    }

    public Foo() {

        i++;

        s++;

    }

}