public class GalToLit {
    public static void main(String args[]) {
        double gallons;
        double litres;
        int counter;

        //converting gallons to litres
        /*litres = 3.7854;

        counter = 0;

        for (gallons=1; gallons<=10; gallons++)
            System.out.println((int)gallons + "gallons is approximately " + litres + "litres");*/

        //converting a specific amount to litres

        gallons = 10;
        litres = gallons * 3.7854;
        System.out.println(gallons + " gallons is equivalent to " + litres + "litres");
    }
}
