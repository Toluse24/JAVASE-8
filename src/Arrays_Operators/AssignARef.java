package Arrays_Operators;

class AssignARef {
    public static void main(String args[]) {
        int i;
        int[] nums1 = new int[10];
        int[] nums2 = new int[10];

        for (i=0; i<10; i++) {
            nums1[i] = i;
        }
        for (i=0; i<10; i++) {
            nums2[i] = -i;
        }

        System.out.print("Here are the values for nums1: ");
        for (i=0; i<10; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();

        System.out.print("Here are the values for nums2: ");
        for (i=0; i<10; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();

        nums2 = nums1;

        //N.B Both reference variables refer to the same object
        System.out.print("Here are the values for nums2 after Assignment: ");
        for (i=0; i<10; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();

        //Operate on nums1 array through nums2
        nums2[3] = 99;

        System.out.print("Here are the values for nums1 after change through nums2: ");
        for (i=0; i<10; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();
    }
}