package leetcode;

public class _66PlusOne {
    public static int[] plusOne(int[] digits) {
        int surplus = 1;
        int i = digits.length - 1;
        while (i>=0 && surplus > 0){
            digits[i] += surplus;
            surplus = digits[i]/10;
            digits[i] %= 10;
            i--;
        }
        if (surplus == 0){
            return digits;
        }
        int[] digits2 = new int[digits.length + 1];
        digits2[0] = surplus;
        for (int j = 1; j < digits.length; j++){
            digits2[j] = digits[j];
        }
        return digits2;
    }
    public static void main(String[] args) {
        int[] digits = {9,9,9};
        int[] result = plusOne(digits);
        for (int a: result){
            System.out.println(a);
        }
    }
}
