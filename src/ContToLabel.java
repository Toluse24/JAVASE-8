class ContToLabel {
    public static void main(String args[]) {

    outerloop:
        for (int i=1; i<10; i++) {
            System.out.println("\nOuterloop " + i + ", Innerloop: ");

            for (int j=1; j<10; j++) {
                if (j == 5) continue outerloop; //continue the outerloop
                System.out.println(j);
            }
        }
    }
}
