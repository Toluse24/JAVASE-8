public class LtoD {
    public static void main(String args[]){

        long L;
        double D;

        L = 100123285;
        D = L;

        System.out.println("L and D: " + L + " " + D);

        //No automatic conversion for double to long
        /*long L;
        double D;

        D = 100123285;
        L = D;*/
    }
}
