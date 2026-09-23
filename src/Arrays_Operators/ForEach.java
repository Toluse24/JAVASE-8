package Arrays_Operators;

/*class NewFor{
    public static void main(String args[]){

        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int x: nums)
            sum += x;
        System.out.println("The sum is " + sum);
    }
}*/

class ForEach {
    public static void main(String args[]){

        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        //Using the foreach style to display and sum the values
        for (int x: nums) {
            System.out.println("Value is: " + x);
            sum += x;
            //Using the break statements
            if (x == 6)
                break;  //stop the loop when 5 is obtained
        }

        System.out.println("Summation: " + sum);
    }
}