public class NestedIfs {
    public static void main(String args[])
        throws java.io.IOException{
            int i, answer = 10;

            System.out.println("INPUT A DIGIT BETWEEN 1 AND 100");

            i = System.in.read();

            if (i == 10) {
                if (i < 10) System.out.println("Almost close");
                ;
                if (i > 100) System.out.println("You are out of range");
                else System.out.println("You are within range");
                ;  // this else belongs to the i>100
            }
            else System.out.println("Input digit again");
            // this else belongs to the i==10
        }


}
