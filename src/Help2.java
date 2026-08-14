public class Help2 {
    public static void main(String args[])
        throws java.io.IOException{

        char choice;

        System.out.println("HELP ON:");
        System.out.println("    1. ARITHMETIC OPERATORS");
        System.out.println("    2. RELATIONAL OPERATORS");
        System.out.println("    3. LOGICAL OPERATORS");
        System.out.println("CHOOSE ONE: ");

        choice = (char) System.in.read();
        System.out.println("\n");

        switch(choice) {
            case '1':
                System.out.println("ARITHMETIC OPERATORS:\n");
                System.out.println("+ ADDITION/UNARY PLUS");
                System.out.println("- SUBSTRACTION");
                System.out.println("/ DIVISION");
                System.out.println("* MULTIPLICATION");
                System.out.println("% MODULUS");
                System.out.println("++ INCREMENT");
                System.out.println("-- DECREMENT");
                break;
            case '2':
                System.out.println("RELATIONAL OPERATORS:\n");
                System.out.println("== EQUAL TO");
                System.out.println("!= NOT EQUAL TO");
                System.out.println("> GREATER THAN");
                System.out.println("< LESS THAN");
                System.out.println(">= GREATER THAN OR EQUAL TO");
                System.out.println("<= LESS THAN OR EQUAL TO");
                break;
            case '3':
                System.out.println("& AND");
                System.out.println("| OR");
                System.out.println("^ XOR(EXCLUSIVE OR)");
                System.out.println("|| SHORT CIRCUIT OR");
                System.out.println("&& SHORT CIRCUIT AND");
                System.out.println("! NOT");
            default:
                System.out.println("SELECTION NOT FOUND");

        }
    }
}
