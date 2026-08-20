class Help4 {
    public static void main(String args[])
        throws java.io.IOException {
        char choice, ignore;

        for (; ;) {
            do {
                System.out.println("HELP ON: ");
                System.out.println("    1. IF STATEMENT.");
                System.out.println("    2. SWITCH STATEMENT.");
                System.out.println("    3. FOR STATEMENT.");
                System.out.println("    4. WHILE STATEMENT.");
                System.out.println("    5. DO-WHILE STATEMENT.");
                System.out.println("    6. BREAK STATEMENT.");
                System.out.println("    7. CONTINUE STATEMENT.");
                System.out.print(" PLEASE ENTER YOUR INPUT CHOICE....:");

                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while ( choice < '1' || choice > '7' & choice != 'q');

            if ( choice == 'q') break;

            System.out.println("\n");

            switch (choice) {
                case '1':
                    System.out.println("The if statement\n");
                    System.out.println("if (condition) statement;");
                    System.out.println("else statement;");
                    break;
                case '2':
                    System.out.println("The switch statement\n");
                    System.out.println("switch (expression) { ");
                    System.out.println("    case constant: ");
                    System.out.println("        statement sequence; ");
                    System.out.println("        break; ");
                    System.out.println("} ");
                    break;
                case '3':
                    System.out.println("The for statement\n");
                    System.out.println("for (initialization; condition; iteration) { ");
                    System.out.println("    statement sequence;");
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
                    System.out.println("    statement; ");
                    System.out.println("} while (condition); ");
                    break;
                case '6':
                    System.out.println("The break statement\n");
                    System.out.println("break; or break label;");
                    break;
                case '7':
                    System.out.println("The continue statement\n");
                    System.out.println("continue; or continue label;");
                    break;
            }
            System.out.println();
        }
    }
}
