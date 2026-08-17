class ForVar {
    public static void main(String args[]){

        int sum = 0;
        int fact = 1;

        //To compute the factorial of numbers through 5
        for (int i = 1; i <= 5; i++) { //the variable is declared inside the for loop
            sum += i;
            fact *= i;
        }

        //Basically, i cannot be known here, because it is out of the scope
        System.out.println("sum is " + sum);
        System.out.println("factorial is " + fact);
    }
}