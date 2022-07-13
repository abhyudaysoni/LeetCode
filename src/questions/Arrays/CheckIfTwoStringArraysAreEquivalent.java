package questions.Arrays;

import java.util.Scanner;

public class CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int m = sc.nextInt();
//        int n = sc.nextInt();
        String[] strArr1 = {"ab", "c"};
        String[] strArr2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(strArr1, strArr2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String res1 = String.join("", word1);
        String res2 = String.join("", word2);
        return res1.equals(res2);
    }
}
