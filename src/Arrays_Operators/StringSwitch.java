package Arrays_Operators;

class StringSwitch {
    public static void main(String args[]) {

        String command = "Cancel";

        switch (command) {
            case "Connect":
                System.out.println("Connecting...");
                break;
            case "Cancel":
                System.out.println("Cancelling...");
                break;
            case "Disconnect":
                System.out.println("Disconnecting...");
                break;
            default:
                System.out.println("Command Error!");
                break;
        }
    }
}