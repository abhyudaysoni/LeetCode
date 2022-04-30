package questions.Arrays.completed;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KidsWithGreatestNumberOfCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int extraCandies = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(kidsWithCandies(arr, extraCandies));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> booleanList = new ArrayList<>();
        int moreCandies;
        for (int i = 0; i < candies.length; i++) {
            moreCandies = candies[i] + extraCandies;
            if (checkCandies(candies, moreCandies)) {
                booleanList.add(true);
            } else booleanList.add(false);
        }
        return booleanList;
    }

    public static boolean checkCandies(int[] candies, int moreCandies) {
        boolean flag = true;
        for (int i = 0; i < candies.length; i++) {
            if (moreCandies < candies[i]) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
