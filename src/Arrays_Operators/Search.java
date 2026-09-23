package Arrays_Operators;

class Search {
    public static void main(String args[]) {

        int nums[] = { 6, 8, 3, 7, 5, 6, 1, 4};
        int val = 15;
        boolean found = false;

        //Using the for-each style for to search nums for val.
        for (int x: nums) {
            if (x == val) {
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not found");
        }else
            System.out.println("Value Found");
    }
}


//Constructing Strings; Creating String Objects and initialization