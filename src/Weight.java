public class Weight {
    public static void main(String args[]){
        double moongravity;
        double earthgravity;
        //double moongravity, earthgravity;

        earthgravity = 9.81;

        moongravity = 0.17 * earthgravity;

        System.out.println("The effective weight on the moon is " + moongravity);
    }
}
