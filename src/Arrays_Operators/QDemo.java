package Arrays_Operators;

class Queue{
    char[] q;   //This array holds the queue
    int putloc, getloc;     //the put and get indices

    Queue(int size) {
        q = new char[size];     //allocates  memory for queue
        putloc = getloc = 0;
    }

    //Placing a character into the queue
    void  put(char ch) {
        if (putloc == q.length) {
            System.out.println(" - Queue is full.");
            return;
        }

        q[putloc++] = ch;
    }

    //Getting a character from the queue
    char get() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }
        return q[getloc++];
    }
}

class QDemo {
    public static void main(String args[]) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Using bigQ to store the Alphabet.");
        //put some letters into bigQ
        for (i=0; i < 26; i++)
            bigQ.put((char) ('A' + i));

        //retrieves and displays elements from bigQ
        System.out.print("Contents of bigQ: ");
        for (i=0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0)
                System.out.println(ch);
        }
        System.out.println("\n");

        System.out.println("Using smallQ to generate errors.");
        //Using smallQ to generate some errors
        for (i=0; i < 5; i++) {
            System.out.println("Attempting to store " + (char) ('Z' - i));

            smallQ.put((char) ('Z' - i));

            System.out.println();
        }
        System.out.println();

        //Add more errors on smallQ
        System.out.println("Contents of smallQ: ");
        for (i=0; i < 5; i++) {
            ch = smallQ.get();

            if (ch != (char) 0)
                System.out.println(ch);
        }
    }
}
