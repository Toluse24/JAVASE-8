class DivModDemo {
    public static void main(String args[]){
        int iresult, irem;
        double dresult, drem;

        iresult = 10 / 3;
        irem = 10 % 3;

        dresult = 10.0 / 3.0;
        drem = 10.0 % 3.0;

        System.out.println("The Result and Remainder of 10/3 is: " + iresult + " and " + irem);
        System.out.println("The Result and Remainder of 10%3 is: " + dresult + " and " + drem);
    }

}
