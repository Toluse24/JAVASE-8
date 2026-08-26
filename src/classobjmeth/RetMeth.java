package classobjmeth;

//Using a return value
class Transport {
    int passengers;     //number of passengers
    int fuelcap;        //fuel capacity in gallons
    int mpg;        //fuel consumption in miles per gallon

    //Return the range
    int range () {
        return fuelcap * mpg;
    }
}

class RetMeth {
    public static void main (String args[]) {
        Transport Car = new Transport();
        Transport Bus = new Transport();

        int range1, range2;

        //Assign values in the fields to Car
        Car.passengers = 5;
        Car.fuelcap = 16;
        Car.mpg = 32;

        //Assign values in the fields to Bus
        Bus.passengers = 30;
        Bus.fuelcap = 27;
        Bus.mpg = 36;


        //Obtain the ranges
        range1 = Car.range ();
        range2 = Bus.range ();

        System.out.println("Car can carry " + Car.passengers +
                " with a range of " + range1 + " miles");
        System.out.println();
        System.out.println("Bus can carry " +  Bus.passengers +
                " with a range of " + range2 + " miles");
        System.out.println();
        System.out.println("condition;");

        if (Car.range() > Bus.range())
            System.out.println("Car has greater range");
        else
            System.out.println("Bus has greater range");
    }
}
