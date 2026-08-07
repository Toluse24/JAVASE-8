public class TestTruthTable {
    public static void main(String args[]){
        boolean t, f;
        System.out.println("The TRUTH TABLE for some logical operations");
        System.out.println();

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT(t)\tN0T(f)");

        t = true; f = true;
        System.out.print(t + "\t" + f + "\t");
        System.out.print((t&f) + "\t" + (t|f) + "\t" + (t^f) + "\t");
        System.out.println((!t) + "\t" + (!f));

        t = true; f = false;
        System.out.print(t + "\t" + f + "\t");
        System.out.print((t&f) + "\t" + (t|f) + "\t" + (t^f) + "\t");
        System.out.println((!t) + "\t" + (!f));

        t = false; f = true;
        System.out.print(t + "\t" + f + "\t");
        System.out.print((t&f) + "\t" + (t|f) + "\t" + (t^f) + "\t");
        System.out.println((!t) + "\t" + (!f));

        t = false; f = false;
        System.out.print(t + "\t" + f + "\t");
        System.out.print((t&f) + "\t" + (t|f) + "\t" + (t^f) + "\t");
        System.out.println((!t) + "\t" + (!f));



    }
}
