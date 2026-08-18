class Guess4{
    public static void main(String args[])
        throws java.io.IOException{

        char ch, ignore, answer = 'K';

        do {
            System.out.println("I AM THINKING OF A LETTER BETWEEN A AND Z...");
            System.out.println("CAN YOU GUESS IT: ");

            ch = (char) System.in.read();

            // This discards any other characters from the input buffer
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            if (ch == answer) System.out.println("** YOU ARE RIGHT! **");
            else {
                System.out.print("...SORRY, YOU ARE ");
                if (ch < answer)
                    System.out.println(" TOO LOW");
                else
                    System.out.println(" TOO HIGH");
                System.out.println("TRY AGAIN!\n");
            }
        }while (answer != ch);
    }
}
