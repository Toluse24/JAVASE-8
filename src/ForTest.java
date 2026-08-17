class ForTest{
    public static void main(String args[])
            throws java.io.IOException {
                int i;
                char ch;

                System.out.println("PRESS s TO STOP");


                for (i = 0; (char) System.in.read() != 's'; i++) {
                    System.out.println("pass #" + i);
                }
            }
}