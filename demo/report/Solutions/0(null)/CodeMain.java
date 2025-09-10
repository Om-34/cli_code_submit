public class CodeMain {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Error: Insufficient arguments");
            return;
        }

        String dataType = args[0];
        String input = args[1];
        // This is optional
        // Ourcode only wants int so keep for int and other are error
        switch (dataType) {
            case "int":
                int intValue = Integer.parseInt(input);
                solve(intValue);
                break;
            default:
                System.out.println("Error: Unsupported data type");
        }
    }

    // The user needs to implement the solve method
    public static void solve(int value) { 
        /// Students will impl this
        System.out.print(value%2==0?"even":"odd");
    }
}
