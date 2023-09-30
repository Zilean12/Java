import java.util.Scanner;

public class cal {
    public static void main(String[] args)
    {
        try (Scanner calScanner = new Scanner(System.in)) {
            System.out.println("Enter number");
            int num1 = calScanner.nextInt();
            int num2 = calScanner.nextInt();

            System.out.println("Select the operation to perfrom");
            System.out.println("     1. Sum");
            System.out.println("     2. Difference");
            System.out.println("     3. Mutiplication");
            System.out.println("     4. Quotient");

            int Select = calScanner.nextInt();
            int result = 0;
            switch (Select) 
            {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid selection.");
                    return;
   }
   System.out.println("Result: " + result);
        }
}
}