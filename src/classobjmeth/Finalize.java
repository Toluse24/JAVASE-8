package classobjmeth;

class FDemo {
    int x;

    FDemo(int i) {
        x = i;
    }

    //Is called when object is recycled
    protected void finalise() {
        System.out.println("Finalizing " + x);
    }

    //Generates an object that is immediately destroyed
    void generator(int i) {
        FDemo o = new FDemo(i);
    }
}

class Finalize {
    public static void main(String args[]) {
        int count;

        FDemo ob = new FDemo(0);
        //Try, creating larger amount of objects
        for (count = 1; count < 100000; count++)
            ob.generator(count);
    }
}