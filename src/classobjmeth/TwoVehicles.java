package classobjmeth;

class Vehicles {
    int passangers;     //number of passangers
    int fuelcap;    //fuel capacity in gallons
    int mpg;    //fuel consumption in miles per gallon
}

class TwoVehicles {
    public static void main(String args[]) {
        //Two seperate objects
        Vehicles minivan = new Vehicles();
        Vehicles sportscar = new Vehicles();

        //OR

        /*Vehicles minivan;
        minivan = new Vehicles();
        Vehicles sportscar;
        sportscar = new Vehicles();*/

        int range1, range2;

        //Assigning values to the fields in minivan.
        minivan.passangers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //Assigning values to fields in sportscar.
        sportscar.passangers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        //Assuming a full tank of gas, the range is given as;
        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportscar.fuelcap * sportscar.mpg;

        System.out.println("minivan carries a maximum of " + minivan.passangers + " passangers" + " with a range of " + range1 + " gallons");
        System.out.println("\n");
        System.out.println("sportscar carries a maximum of " + sportscar.passangers + " passangers" + " with a range of " + range2 + " gallons");


    }
}