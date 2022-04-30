package questions.Arrays.completed;

import java.util.Scanner;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(maximumWealth(arr));
    }

    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int wealth = 0;
            int j = 0;
            while (j < accounts[0].length) {
                wealth = wealth + accounts[i][j];
                if (wealth > max) {
                    max = wealth;
                }
                j++;
            }
        }
        return max;
    }
}
