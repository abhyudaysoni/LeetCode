package questions.Hashing.Completed;

import java.util.Scanner;

public class RingsAndRods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        System.out.println(countPoints(n));
    }

    public static int countPoints(String rings) {
        int res = 0;
        boolean[] red = new boolean[10];
        boolean[] blue = new boolean[10];
        boolean[] green = new boolean[10];
        for (int i = 0; i < rings.length(); i = i + 2) {
            char color = rings.charAt(i);
            int colorIdx = rings.charAt(i + 1) - '0';
            System.out.print(colorIdx + " ");
            if (color == 'R' || color == 'r') {
                red[colorIdx] = true;
            } else if (color == 'B' || color == 'b') {
                blue[colorIdx] = true;
            } else {
                green[colorIdx] = true;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (red[i] && blue[i] && green[i]) {
                res++;
            }
        }
        return res;
    }
}
