public class PromotionDemo {
    public static void main(String args[]){
        int i;
        byte b;

        b = 10;
        i = b * b; //Cast not needed because of the result is already promoted to int

        b = 10;
        b = (byte) (b * b); //cast needed

        System.out.println("i and b: " + i + " " + b);
    }
}
