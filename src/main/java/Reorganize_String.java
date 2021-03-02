import java.util.Arrays;

public class Reorganize_String {
    public String reorganizeString(String S) {
        int[] counter = new int[26];
        for (char c: S.toCharArray()) {
            counter[c - 'a'] += 100;
        }
        for (int i = 0; i < 26; ++i) {
            counter[i] += i;
        }
        Arrays.sort(counter);

        char[] str = new char[S.length()];
        int t = 1;
        for (int code: counter) {
            int j = code / 100;
            char ch = (char) ('a' + (code % 100));
            if (j > (S.length()+1) / 2) {
                return "";
            }
            for (int i = 0; i < j; ++i) {
                if(t >= S.length()) {
                    t = 0;
                }
                str[t] = ch;
                t += 2;
            }
        }

        return String.valueOf(str);
    }
}
