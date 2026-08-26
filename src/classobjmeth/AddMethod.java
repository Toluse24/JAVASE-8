package classobjmeth;

class Car {
    int passangers;
    int fuelcap;
    int mpg;

    //This displays the range
    void range () {
        System.out.println("Range is " + fuelcap * mpg);
    }
}

class AddMethod {
    public static void main (String args[]) {
        Car camrySE = new Car();
        Car mazda6 = new Car();
        Car corolla = new Car();

        int range1, range2, range3;

        //Assigns values to the field in camrySE
        camrySE.passangers = 5;
        camrySE.fuelcap = 16;
        camrySE.mpg = 21;

        //Assigns values to the field in mazda6
        mazda6.passangers = 4;
        mazda6.fuelcap = 14;
        mazda6.mpg = 12;

        //Assigns value to the field in corolla
        corolla.passangers = 5;
        corolla.fuelcap = 34;
        corolla.mpg = 21;

        System.out.println("camrySE can carry " + camrySE.passangers + " passengers. ");
        camrySE.range();    //displays the range of camrySE
        System.out.println("\n");
        System.out.println("mazda6 can carry " + mazda6.passangers + " passengers. ");
        mazda6.range();     //displays the range of mazda6
        System.out.println("\n");
        System.out.println("corolla can carry " + corolla.passangers + " passengers. ");
        corolla.range();


    }
}