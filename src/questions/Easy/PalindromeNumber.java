package questions.Easy;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class PalindromeNumber {
    static ArrayList<Integer> arrList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i = i / 10) {
            int r = i % 10;
            arrList.add(r);
        }
        System.out.println(isPalindrome(n));
    }

    public static boolean isPalindrome(int x) {
        int j = arrList.size() - 1;
        for (int i = 0; i < arrList.size() / 2; i++) {
            if (!Objects.equals(arrList.get(i), arrList.get(j))) {
                return false;
            }
            j--;
        }
        return true;
    }
}
