import Calculator.StringCalculator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        StringCalculator strCalc = new StringCalculator();

        if (strCalc.add("") != 0) throw new AssertionError("Test 1 ('') failed!");
        if (strCalc.add("1,2") != 3) throw new AssertionError("Test 2 ('1,2') failed!");
        if (strCalc.add("1,2,55,1,2,3") != 64) throw new AssertionError("Test 3 ('1,2,55,1,2,3') failed!");
        System.out.println("All tests passed!");

        System.out.println();
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();

        int sum = strCalc.add(str);
        if (sum != Integer.MIN_VALUE) System.out.println("Sum of numbers is: " + sum);

    }


}
