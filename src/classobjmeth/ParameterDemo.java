package classobjmeth;

class Name {

    boolean isEven(int x) {
        if (x % 2 == 0) {
            return true;
        }else  {
            return false;
        }
    }
}

class ParameterDemo{
    public static void main(String args[]) {

        Name newName = new Name();

        if (newName.isEven(10))
            System.out.println("10 is Even");
        if (newName.isEven(9))
            System.out.println("9 is Even");
        if (newName.isEven(8))
            System.out.println("8 is Even");
        if (newName.isEven(7))
            System.out.println("7 is Even");
    }
}