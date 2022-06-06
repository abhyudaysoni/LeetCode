package questions.Arrays.inProgress;

import java.math.BigInteger;
import java.util.Scanner;

public class AddBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(addBinary(str1, str2));
    }

    public static String addBinary(String a, String b) {
        return new BigInteger(a, 2).add(new BigInteger(b, 2)).toString();
    }
}
