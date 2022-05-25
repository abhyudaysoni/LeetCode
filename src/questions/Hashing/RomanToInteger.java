package questions.Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(romanToInt(str));
    }

    static public int romanToInt(String s) {
        HashMap<Character, Integer> hm2 = new HashMap<>();
        hm2.put('I', 1);
        hm2.put('V', 5);
        hm2.put('X', 10);
        hm2.put('L', 50);
        hm2.put('C', 100);
        hm2.put('D', 500);
        hm2.put('M', 1000);
        System.out.println(hm2);
        int sum = 0;
        int prev = 0;
        for (char c : s.toCharArray()) {
            int val = hm2.get(c);

            if (val > prev) {
                sum = sum - prev + (val - prev);
            } else {
                sum = sum + val;
            }
            prev = val;
        }
        return sum;
    }
}


/*

        HashMap<Character, Integer> hm2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            hm1.put(s.charAt(i), hm1.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            hm2.put('I', 1);
            hm2.put('V', 5);
            hm2.put('X', 10);
            hm2.put('L', 50);
            hm2.put('C', 100);
            hm2.put('D', 500);
            hm2.put('M', 1000);
        }
        System.out.println(hm1);
        System.out.println(hm2);

        int sum = 0;
        for (Map.Entry<Character, Integer> entry : hm1.entrySet()) {
            sum = sum + (entry.getValue() * hm2.get(entry.getKey()));
        }

 */