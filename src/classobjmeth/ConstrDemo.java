package classobjmeth;

class MyClass {
    int x;

    //A constructor
    MyClass() {
        x = 10;
    }
}

class ConstrDemo {
    public static void main(String args[]) {
        //The Constructor is called by new
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass();

        System.out.println(t1.x + " " + t2.x);
    }
}
