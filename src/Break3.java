class Break3 {
    public static void main(String args[]) {

        int i,t;
        for (i = 0; i < 3; i++) {
            System.out.println("Outer Loop Count: " + i);
            System.out.print("    Inner Loop Count: ");

            t = 0;
            while (t < 100) {
                if (t == 10)
                    break;
                System.out.print(t + " ");
                t++;
            }
            System.out.println();
        }
        System.out.println("Loops Complete.");
    }
}
