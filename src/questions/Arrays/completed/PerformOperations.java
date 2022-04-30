package questions.Arrays.completed;

import java.util.Scanner;

public class PerformOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        System.out.println(finalValueAfterOperations(arr));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String operation : operations) {
            if (operation.equals("++X")) {
                ++x;
            }
            if (operation.equals("X++")) {
                x++;
            }
            if (operation.equals("--X")) {
                --x;
            }
            if (operation.equals("X--")) {
                x--;
            }
        }
        return x;
    }
}