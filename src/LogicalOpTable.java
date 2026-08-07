public class LogicalOpTable {
    public static void main(String args[]){

        boolean p, q;
        System.out.println("Truth Table consisting of p and q with the discussed logical operators");
        System.out.println();

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT(p)\tNOT(q)");

        p = true; q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p) + "\t" + (!q));;

        p = true; q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p) + "\t" + (!q));

        p = false; q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p) + "\t" + (!q));

        p = false; q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p) + "\t" + (!q));
    }
}
