class NestedSwitchDemo{
    public static void main(String args[]){

        char ch1,ch2;
        ch1 = 'A';
        ch2 = 'B';

        switch (ch1){
            case 'A':
                System.out.println("This is a part of the outer switch");
                switch (ch2) {
                    case 'A':
                        System.out.println("This is a part of the inner switch");
                        break;
                    case 'B':
                        //N.B This is the end of the inner switch
            }
            break;
            case 'B':
        }
    }
}
