package questions.Strings;

import java.util.HashSet;
import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(lengthOfLongestSubstring(str));
    }

    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int acquire = 0;
        int release = 0;
        int max = 0;
        while (acquire < s.length()) {
            char chAcq = s.charAt(acquire);
            if (!hs.contains(chAcq)) {
                hs.add(chAcq);
                acquire++;
                max = Math.max(max, hs.size());
            } else {
                char chRel = s.charAt(release);
                hs.remove(chRel);
                release++;
            }
        }
        return max;
    }
}
