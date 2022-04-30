package questions.Arrays.completed;

import java.util.Scanner;

public class MaximumNumberOfWordsInASentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        mostWordsFound(arr);
    }

    public static int mostWordsFound(String[] sentences) {
        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            int count = 0;
            for (int j = 0; j < sentences[i].length(); j++) {
                if (sentences[i].charAt(j) == ' ') {
                    count++;
                }
                if (count > max) {
                    max = count;
                }
            }
        }
        return max + 1;
    }
}
