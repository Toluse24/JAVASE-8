class Empty2 {
    public static void main(String args[]) {

        int i;
        i = 0; //Initialization outside the for loop
        for (; i < 10; ) {
            System.out.println("pass #" + i);
            i++; //The Increment loop control var
        }
    }
}

