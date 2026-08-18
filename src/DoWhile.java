class DoWhile{
    public static void main(String args[])
        throws java.io.IOException{

        char ch;

        do {
            System.out.println("PRESS A KEY FOLLOWED BY ENTER: ");
            ch = (char) System.in.read();
        } while (ch != 'q');
    }
}
