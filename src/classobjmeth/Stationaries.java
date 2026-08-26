package classobjmeth;

class Stationary {
    int pens;
    int notebooks;
    int rulers;
}

class Stationaries {
    public static void main(String args[]) {

        Stationary assets = new Stationary();
        int cost;

        assets.pens = 30;
        assets.notebooks = 10;
        assets.rulers = 6;

        cost = assets.pens + assets.notebooks + assets.rulers;

        System.out.println("Cost of assets: " + cost);
    }
}
