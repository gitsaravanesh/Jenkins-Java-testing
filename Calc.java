public class Calc {
    public static void main(String[] args) {
        // Checking if the correct number of arguments is provided
        if(args.length != 3) {
            System.out.println("Usage: java Calculator <num1> <num2> <operation>");
            System.out.println("Example: java Calculator 10 5 add");
            return;
        }
        
        // Parsing the arguments
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        String operation = args[2].toLowerCase();
        
        // Performing the operation based on user input
        double result;
        switch(operation) {
            case "add":
                result = num1 + num2;
                System.out.println(result);
                break;
            case "sub":
                result = num1 - num2;
                System.out.println(result);
                break;
            case "mul":
                result = num1 * num2;
                System.out.println(result);
                break;
            case "div":
                if(num2 == 0) {
                    System.out.println("Error: Division by zero!");
                } else {
                    result = num1 / num2;
                    System.out.println(result);
                }
                break;
            default:
                System.out.println("Invalid operation. Please enter add, sub, mul, or div.");
        }
    }
}
