public class NestVar {
    public static void main(String args[]){
        int count;

        for (count = 0; count < 10; count++){
            System.out.println("This is count: " + count);

            //int count; Cant declare count again, because it has already been declared
            /*for (count = 0; count < 2; count++){
                System.out.println("This is an errored program!");
            }*/

        }

    }
}
