package Calculator;


public class StringCalculator {


    public int add(String numbers){
        String delimiter = ",";
        int sum = 0;

        if (numbers.isEmpty()) return 0;
        try {
            String[] numArr = numbers.split(delimiter);
            for (String s : numArr) {
                sum += Integer.parseInt(s);
            }
        } catch (Exception e){
            System.out.println(e);
            return Integer.MIN_VALUE;
        }
        return sum;
    }

}
