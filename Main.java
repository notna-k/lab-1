import Calculator.StringCalculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        StringCalculator strCalc = new StringCalculator();

        if(test("", 0)){
            System.out.println("Test 1 ('') passed");
        } else System.out.println("Test 1 failed");

        if(test("1", 1)){
            System.out.println("Test 2 ('1') passed");
        } else System.out.println("Test 2 failed");

        if(test("1,2", 3)){
            System.out.println("Test 3 ('1,2') passed");
        } else System.out.println("Test 3 failed");

        System.out.println();
        System.out.print("Enter the string:  ");
        String str = scanner.nextLine();

        int sum = strCalc.add(str);
        System.out.println("Sum of numbers is: " + sum);

    }

    public static boolean test(String str, int definedResult){
        StringCalculator strcalc = new StringCalculator();
        int res = strcalc.add(str);
        return res == definedResult;
    }


}
