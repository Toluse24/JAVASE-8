class Break2 {
    public static void main(String args[])
        throws java.io.IOException {

        char ch;

        System.out.println("PLEASE THE ALPHABET 'G'");
        System.out.println();

        for (; ;) {
            //The 'break' terminates the infinite loop
            ch = (char) System.in.read();
            if (ch == 'g')
                break;
        }
        System.out.println("YOU PRESSED G");
    }
}
