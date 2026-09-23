package Arrays_Operators;

//To show a One-Dimensional Array
class ArrayDemo {
    public static void main(String args[]) {

        int sample[] = new int[10];
        int i;
        //All Arrays are indexed from zero
        for (i = 0; i < 10; i += 1)
            sample[i] = i;

        for (i = 0; i < 10; i += 1)
            System.out.println("This is the sample[" + i + "]: " +
                    sample[i]);
    }
}

