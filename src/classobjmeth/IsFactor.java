package classobjmeth;

class Factor {

    boolean isFactor(int a, int b) {
        if ((b % a) == 0)
            return true;
        else
            return false;
    }
}

class IsFactor {
    public static void main(String args[]) {
        Factor x = new Factor();

        if (x.isFactor(2, 20))
            System.out.println("2 is a Factor");
        if (x.isFactor(3, 21))
            System.out.println("3 is a factor");
        if (x.isFactor(2, 23))
            System.out.println("Won't display");
    }
}