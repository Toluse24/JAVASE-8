package test;

class NumProgress {
    public static void main(String args[]) {
        //to generate and display the progression 1,2,4,8,16,32 and so on...

        for (int i = 1; i < 100; i += i)
            System.out.print(i + " ");
    }
}
