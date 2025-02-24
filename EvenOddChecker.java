import java.util.Scanner;

public class EvenOddChecker {
    public static int getIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        while(!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next();
            System.out.print("Enter an integer: ");}
        return scanner.nextInt();
    }
    public static String checkEvenOrOdd(int number){
        if (number % 2 == 0){
            return number + " is an Even number.";
        } else{
            return number + " is an Odd number.";
        }
    }
    public static void main(String[] args) {
        int number = getIntegerInput();
        String result = checkEvenOrOdd(number);
        System.out.println(result);
    }
}