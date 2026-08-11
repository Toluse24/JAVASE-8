class GuessLetter{
    public static void main(String args[])
            throws java.io.IOException{

        char ch, rightanswer = 'S';

        System.out.println("I am thinking of a letter between A to X..");

        System.out.print("Can you guess what is it?");
        ch = (char) System.in.read();

        if (ch == rightanswer){
            System.out.println("You are ** Right **! Welldone!!");
        }
        else System.out.println("Wrong Letter, Try again!");

        //To add a nested if to this particular program
        if (ch < rightanswer) System.out.println("Sorry, too Low");
        else System.out.println("Sorry, you are too high");
    }
}