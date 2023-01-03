import java.util.Arrays;
import java.util.Scanner;

public class Convertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int num;
        int count = 1;
        if (input.charAt(0) - '0' < 10) { //숫자가 주어질 경우 = 십진법 to 이진법
            num = Integer.parseInt(input);
            System.out.println(Arrays.toString(dec2bin(num)));
        } else if (input.charAt(0) == '[') {//boolean값이 주어질 경우 = 이진법 to 십진법
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ',') { //반점으로 boolean의 개수를 구한다
                    count++; //배열의 개수 구하기
                }
            }
            boolean[] tf = new boolean[count];
            int tfNum = 0;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == 't') {//t일경우 true
                    tf[tfNum] = true;
                    tfNum++;
                } else if (input.charAt(i) == 'f') {//f일경우 false
                    tf[tfNum] = false;
                    tfNum++;
                }
            }
            System.out.println(bin2dec(tf));
        }
    }
    public static boolean[] dec2bin(int decimal) {//십진법 to 이진법
        int length;
        int a = 0;
        while (true) {
            if (decimal < (int) Math.pow(2, a)) {//입력된 정수가 2^i로 나눠질경우 배열의 길이는 i
                length = a - 1;
                break;
            }
            a++;
        }
        int i = 0;
        boolean[] binary = new boolean[length + 1];
        while (decimal > 0) {
            if (decimal % 2 != 0) binary[i] = true;
            else binary[i] = false;
            decimal /= 2;
            i++;
        }
        return Arrays.copyOf(binary, i);
    }

    public static int bin2dec(boolean[] bin) {//이진법 to 십진법
        int decimal = 0;
        for (int i = 0; i < bin.length; i++) {
            if (bin[i]) {//주어진 배열에서 boolean 값이 true일 경우
                decimal += (int) Math.pow(2, i);//2^i를 더한다
            }
        }
        return decimal;
    }
}