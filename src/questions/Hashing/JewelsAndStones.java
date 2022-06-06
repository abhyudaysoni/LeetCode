package questions.Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class JewelsAndStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jewels = sc.next();
        String stones = sc.next();
        System.out.println(numJewelsInStones(jewels, stones));
    }

    static public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < jewels.length(); i++) {
            int fq = hm.getOrDefault(jewels.charAt(i), 0);
            hm.put(jewels.charAt(i), fq + 1);
        }
        for (int i = 0; i < stones.length(); i++) {
            if (hm.containsKey(stones.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
