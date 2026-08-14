class Revise {
    public static void main(String args[]) {

        int i;

        for (i = 0; i <= 10; i++) {
            switch (i) {
                case 0:
                    System.out.println("i should be zero");
                    break;

                case 1:
                    System.out.println("i should be one");
                    break;
                case 2:
                    System.out.println("i should be two");
                    break;
                case 3:
                    System.out.println("i should be three");
                    break;
                case 4:
                    System.out.println("i should be four");
                    break;
                case 5:
                    System.out.println("i should be five");
                    break;
                case 6:
                    System.out.println("i should be six");
                    break;
                case 7:
                    System.out.println("i should be seven");
                    break;
                case 8:
                    System.out.println("i should be eight");
                case 9:
                    System.out.println("i should be nine");
                    break;
                case 10:
                    System.out.println("i should be ten");
                    break;
                default:
                    System.out.println("i is 11 or more");

            }
        }

        //If the break is not applied to the case, then this is what happens
        /*for (i = 0; i <= 5; i++) {
            switch (i) {
                case 0:
                    System.out.println("i is zero here");
                case 1:
                    System.out.println("i is one here");
                case 2:
                    System.out.println("i is two here");
                case 3:
                    System.out.println("i is three here");
                case 4:
                    System.out.println("i is four here");

            }
            System.out.println();
        }*/
    }
}