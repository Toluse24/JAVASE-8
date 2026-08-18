class BreakDemo {
    public static void main(String args[]) {
        int i,num;

        num = 100;
        for (i = 0; i < num; i++) {
            if (i*i >= num)
                break;
            System.out.print(i + " ");
        }
        System.out.println("Loop Complete.");
    }
}
