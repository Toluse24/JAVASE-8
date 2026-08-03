public class Increment {
    public static void main(String args[]){
        int x,y;

        x = 10;
        y = ++x;

        System.out.println("The value of x and y are: " + x + " and " + y);

        x = 10;
        y = x++;

        System.out.println("The value of x and y are: " + x + " and " + y);
    }
}
