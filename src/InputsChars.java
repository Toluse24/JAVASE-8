class InputsChars{
    public static void main(String args[])
        throws java.io.IOException{

        char ch;

        System.out.println("PLEASE ENTER A VALID KEY");

        ch = (char) System.in.read();

        System.out.println("THE VALID KEY ENTERED IS: " + ch);
    }
}

