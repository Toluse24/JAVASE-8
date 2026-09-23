package Arrays_Operators;

class Queue2 {
    double[] data;
    int putloc, getloc;

    Queue2(int size) {
        data = new double [size];
        putloc = getloc = 0;
    }

    void put(double i) {
        if (putloc == data.length) {
            System.out.println(" - Queue is full.");
            return;
        }

        data[putloc++] = i;
    }

    double get() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (double) 0;
        }
        return data[getloc++];
    }
}

class QueueDemo2 {
    public static void main(String args[]) {
        Queue2 largeQueue = new Queue2(50);
        Queue2 littleQueue = new Queue2(7);
        double d;
        int i;

        System.out.println("Using the largeQ to store the digits.");
        for (i=0; i < 28; i++)
            System.out.println((double) (1.0 + i));

        System.out.print("Contents of largeQueue: ");
        for (i=0; i < 28; i++){
            d = largeQueue.get();
            if (d != (double) 0)
                System.out.println(d);
        }
        System.out.println("\n");

        System.out.println("Using littleQueue to generate errors");
        for (i=0; i < 8; i++){
            System.out.println("Attempting to store digits " + (double) (7.0 - i));

            littleQueue.put((double) (7.0 - i));

            System.out.println();
        }
        System.out.println();

        //More errors on littleQueue
        System.out.println("Contents of littleQueue: ");
        for (i=0; i < 8; i++) {
            d = littleQueue.get();

            if (d != (double) 0)
                System.out.println(d);
        }
    }
}
