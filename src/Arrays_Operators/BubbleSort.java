package Arrays_Operators;

class BubbleSort {
    public static void main(String args[]) {
        int nums[] = {99, -10, 100123, 18, -978,
                5623, 463, -9, 287, 49};
        int a, b, t;
        int size;

        size = 10;      //Number of elements to sort

        //display Original Array
        System.out.print("The Original Array is:");
        for (int i = 0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println("\n");

        //The Bubble Sort Technique
        for (a = 1; a < size; a++)
            for (b = size - 1; b >= a; b--) {
                if (nums[b - 1] > nums[b]) {

                    //If out-of-order, exchange elements
                    t = nums[b-1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }
            }

        //Displays the Sorted Array
        System.out.print("Sorted Array is:");
        for (int i = 0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();
    }
}