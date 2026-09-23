package Arrays_Operators;

class LengthDemo {
    public static void main(String args[]) {

        int list[] = new int[10];
        int nums[] = {1,2,3};
        int table[][] = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        System.out.println("Length of the list is: " + list.length);
        System.out.println("Length of nums is: " + nums.length);
        System.out.println("Length of the table is: " + table.length);
        System.out.println("Length of table[0] is: " + table[0].length);
        System.out.println("Length of table[1] is: " + table[1].length);
        System.out.println("Length of table[2] is: " + table[2].length);
        System.out.println();

        //Using length to initialize list
        for (int i=0; i<list.length; i++)
            list[i] = i * i;
        System.out.println("Here is the list: ");

        //Now, Use length to display the list
        for (int i=0; i<list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();

    }
}

