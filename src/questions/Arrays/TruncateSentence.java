package questions.Arrays;

import java.util.Scanner;

public class TruncateSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Hello how are you Contestant";
        int k = 4;
        System.out.println(truncateSentence(str, k));
    }

    public static String truncateSentence(String s, int k) {
        String[] strArr = s.split(" ");
        String res = "";
        for (int i = 0; i < k; i++) {
            res = res + strArr[i] + " ";
        }

        return res.trim();
    }
}
