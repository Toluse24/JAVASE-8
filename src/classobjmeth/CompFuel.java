package classobjmeth;

//Adding a parameterized method that computes the fuel required for a given distance.
class Transportation {
    int passenger;
    int fuelcapacity;
    int mpgs;

    //A constructor for Transportation
    Transportation(int p, int f, int m) {
        passenger = p;
        fuelcapacity = f;
        mpgs = m;
    }

    //Return the range
    int range() {
        return mpgs * fuelcapacity;
    }

    //Compute the fuel needed for a given distance
    double fuelNeeded(int miles) {
        return (double) miles / mpgs;
    }
}

class CompFuel {
    public static void main(String args[]) {

        //Constructs complete Transportation
        //class-var = new class-name(arg-list)
        Transportation bus = new Transportation(16, 100, 18);
        Transportation jet = new Transportation(1, 53, 30);
        double gallons;
        int distance = 225;

        /*
        //Assigns values to the fields in bus
        bus.passenger = 16;
        bus.fuelcapacity = 100;
        bus.mpgs = 18;

        //Assigns values to the fields in jet
        jet.passenger = 1;
        jet.fuelcapacity = 53;
        jet.mpgs = 30; */

        gallons = bus.fuelNeeded(distance);

        System.out.println("To go " + distance + " miles, bus needs " + gallons + " gallons of fuel.");
        System.out.println();
        gallons = jet.fuelNeeded(distance);

        System.out.println("To go " + distance + " miles, jet needs " + gallons + " gallons of fuel.");
    }
}
