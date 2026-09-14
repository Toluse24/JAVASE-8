package classobjmeth;

class MyClasses {
    int x;

    //A parameterized constructor
    MyClasses(int i) {
        x = i;
    }
}

class ParmConstrDemo {
    public static void main(String args[]) {
        MyClasses t1 = new MyClasses(10);
        MyClasses t2 = new MyClasses(88);

        System.out.println(t1.x + " " + t2.x);
    }
}
