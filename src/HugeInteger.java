
public class HugeInteger {
   int[] digits = new int[40];

    public int[] parse(String number) {
        for(int count = 0; count < number.length(); count++) {
            digits[count] = Integer.parseInt(String.valueOf(number.charAt(count)));
        }
        return digits;
    }
}