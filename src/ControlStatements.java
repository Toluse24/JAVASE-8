public class ControlStatements {
    public static void main(String args[]){
        int a, b, c;

        a = 2;
        b = 3;

        if (a < b)
            System.out.println("a is lesser than b");
        if (a == b)
            System.out.println("you wont see anything");
        System.out.println();

        c = a - b;
        System.out.println("c contians -1");

        if (c > 0)
            System.out.println("c is non-negative");
        if (c < 0)
            System.out.println("c is negative");

        System.out.println();

        c = b - a;
        System.out.println("c contians 1");

        if (c >= 0)
            System.out.println("c is positive/non-negative");

        if (c < 0)
            System.out.println("c is negative");
    }
}
