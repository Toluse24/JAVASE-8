package classobjmeth;

class Pwr2 {
    double b;
    int e;
    double val;

    Pwr2(double b, int e) {
        this.b = b;
        this.e = e;

        this.val = 1;
        if (e == 0)
            return;

        for (; e > 0; e--)
            this.val = this.val * b;
    }

    double get_pwr() {
        return this.val;
    }
}

class DemoPwr2 {
    public static void main(String args[]) {
        Pwr2 w = new Pwr2(0, 3);
        Pwr2 x = new Pwr2(4.0,2);
        Pwr2 y = new Pwr2(2.5, 1);
        Pwr2 z = new Pwr2(5.7, 0);

        System.out.println(w.b + " raised to the power of " + w.e +
                " is " + w.get_pwr());
        System.out.println(x.b + " raised to the power of " + x.e +
                " is " + x.get_pwr());
        System.out.println(y.b + " raised to the power of " + y.e +
                " is " + y.get_pwr());
        System.out.println(z.b + " raised to the power of " + z.e +
                " is " + z.get_pwr());
    }
}