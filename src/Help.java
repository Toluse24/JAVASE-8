class Help{
    public static void main(String args[])
        throws java.io.IOException{

        char choice;

        System.out.println("HELP ON:");
        System.out.println("    1. if");
        System.out.println("    2. switch");
        System.out.println("    3. jump");
        System.out.print("CHO0SE ONE: ");

        choice = (char) System.in.read();

        System.out.println("\n");

        switch (choice){
            case '1':
                System.out.println("The if:\n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement");
                break;
            case '2':
                System.out.println("The switch:\n");
                System.out.println("switch (expression) {");
                System.out.println("   case constant:");
                System.out.println("     statement sequence");
                System.out.println("     break;");
                System.out.println(" ....");
                System.out.println("}");
                break;
            case '3':
                System.out.println("The jump:\n");
                System.out.println("break labelName;");
                System.out.println("continue labelName;");
                System.out.println("return expression;");
                break;
            default:
                System.out.println("Selection Not Found");
        }
    }
}