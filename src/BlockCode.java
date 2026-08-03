public class BlockCode {
    public static void main(String args[]){
        double i, j, d;
        i = 5;
        //i = 0; the whole target(the block ) is skipped
        j = 10;

        if (i != 0){
            System.out.println("i does not equal zero");
            d = j / i;
            System.out.println("j / i is " + d);
        }
    }
}
