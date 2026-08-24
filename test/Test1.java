package tests;

class Test1 {
    public static void main(String args[])
        throws java.io.IOException {
        char ch;
        int spaces = 0;

        System.out.println("PLEASE ENTER A PERIOD TO STOP.");

        do {
            ch = (char) System.in.read();
            if (ch == ' ')
                spaces++;
        } while (ch != '.');

        System.out.println("spaces: " +  spaces);
    }
}