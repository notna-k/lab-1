import Calculator.StringCalculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        StringCalculator strCalc = new StringCalculator();

        assert (strCalc.add("") == 0): "Test 1('') failed!";
        assert (strCalc.add("1") == 1): "Test 2('1') failed!";
        assert (strCalc.add("1,2") == 3): "Test 3('1,2') failed!";
        System.out.println("All tests passed!");

        System.out.println();
        System.out.print("Enter the string:  ");
        String str = scanner.nextLine();

        int sum = strCalc.add(str);
        System.out.println("Sum of numbers is: " + sum);

    }


}
