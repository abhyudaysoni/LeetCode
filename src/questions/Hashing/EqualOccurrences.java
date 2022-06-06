package questions.Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EqualOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(areOccurrencesEqual(str));
    }

    public static boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        }
        System.out.println(hm);
        int key = hm.get(s.charAt(0));
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            if (entry.getValue() != key) {
                return false;
            }
        }
        return true;
    }
}
