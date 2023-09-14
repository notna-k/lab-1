package Calculator;

public class StringCalculator {


    public int add(String numbers){
        String delimiter = ",";
        int sum = 0;

        try {
            String[] numArr = numbers.split(delimiter);
            if (numbers.length() > 3) throw new Exception("Length of sequence must be <= 2");
            for (String s : numArr) {
                sum += Integer.parseInt(s);
            }
        } catch (Exception e){
            System.out.println(e);
        }
        return sum;
    }

}
