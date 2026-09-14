package Arrays_Operators;

class ArrayErr {
    public static void main(String args[]) {
        int sample[] = new int[10];
        int i;

        /* To check the runtime error to overrun or underrun,
        in this case an array overrun*/
        for (i = 1; i < 100; i++){
            sample[i] = i;
        }
    }
}
