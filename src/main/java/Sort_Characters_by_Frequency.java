import java.util.*;

public class Sort_Characters_by_Frequency {
    public String frequencySort(String s) {
        Map<Character, Integer> counter = new HashMap();
        for (char c : s.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer> > list = new ArrayList(counter.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Character, Integer> >() {
            public int compare(Map.Entry<Character, Integer> a, Map.Entry<Character, Integer> b) {
                return b.getValue() - a.getValue();
            }
        });

        StringBuilder result = new StringBuilder(list.size());
        for (Map.Entry<Character, Integer> es : list) {
            for (int i = 0; i < es.getValue(); ++i) {
                result.append(es.getKey());
            }
        }

        return result.toString();
    }
}
