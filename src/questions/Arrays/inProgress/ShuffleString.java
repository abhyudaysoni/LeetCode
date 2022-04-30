package questions.Arrays.inProgress;

import java.util.Scanner;

public class ShuffleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(restoreString(str, arr));
    }

    public static String restoreString(String s, int[] indices) {
        return null;
    }
}
