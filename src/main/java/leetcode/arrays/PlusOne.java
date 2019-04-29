package leetcode.arrays;

public class PlusOne {

    public static void main(String[] args) {
        int[] ints = plusTest2(new int[]{9});

        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

    }
    private static int plusTest(int[] digits){

        int n = digits.length;
        int precent =1;
        int num=0;
        if (n<1){
            return 0;
        }

        if (n==1){
            return  digits[0];
        }
        for (int i = 0; i <digits.length ; i++) {
            for (int j = digits.length-(i+1); j>0 ; j--) {
                precent = precent * 10;
            }
            num = num+ (digits[i])*precent;
            precent=1;
        }

        return  num;

    }

    private static int[] plusTest2(int[] digits) {

        for (int i = digits.length-1; i >=0  ; i--) {
            if (digits[i] !=9){
                digits[i] = digits[i]+1;
                return digits;
            }

            digits[i]=0;

        }
        int[] temp = new int[digits.length +1];
        temp[0] = 1;
        return temp;
    }
}
