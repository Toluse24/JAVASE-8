package classobjmeth;

class Vehicle {
    int passangers;     //number of passangers.
    int fuelcap;    //fuel capacity in gallons.
    int mpg;    //Average fuel consumption in miles per gallon.
}

class VehicleDemo {
    public static void main(String args[]) {
        /*
        Vehicle car1 = new Vehicle();
        Vehicle car2 = car1;

        car1.mpg = 26;

        System.out.println(car1.mpg);
        System.out.println(car2.mpg);*/

        Vehicle minivan = new Vehicle();
        int range;

        //Assigning values to field in the minivan
        minivan.passangers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //Assuming a full tank of gas, computing the range
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("minivan can carry " + minivan.passangers + " passangers" +  " with a range of " + range);
    }
}
