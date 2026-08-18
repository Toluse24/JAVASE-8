class Help3{
    public static void main(String args[])
        throws java.io.IOException{

        char choice, ignore;

        do {
            System.out.println("HELP ON:");
            System.out.println("    1. if Statement");
            System.out.println("    2. switch Statement");
            System.out.println("    3. for statement");
            System.out.println("    4. while statement");
            System.out.println("    5. do-while Statement");
            System.out.println("CHOOSE ONE: ");

            choice =  (char) System.in.read();

            System.out.println();

            do {
                //discards any other character in the input buffer
                ignore = (char) System.in.read();
            } while (ignore != '\n');
        } while (choice < '1' || choice > '5');

        switch (choice) {
            case '1':
                System.out.println("The if statement\n");
                System.out.println("if (condition) statement;");
                System.out.println("else statement");
                break;
            case '2':
                System.out.println("The switch statement\n");
                System.out.println("switch (expression) { ");
                System.out.println("    case constant: ");
                System.out.println("        Statement sequence; ");
                System.out.println("        break; ");
                System.out.println("} ");
                break;
            case '3':
                System.out.println("The for statement\n");
                System.out.println("for (initialization; condition; iteration) { ");
                System.out.println("    Statement sequence; ");
                System.out.println("} ");
                break;
            case '4':
                System.out.println("The while statement\n");
                System.out.println("while (condition) { ");
                System.out.println("    statement; ");
                System.out.println("} ");
                break;
            case '5':
                System.out.println("The do-while statement\n");
                System.out.println("do { ");
                System.out.println("    Statement;");
                System.out.println("} while (condition);");
                break;
        }
    }
}
