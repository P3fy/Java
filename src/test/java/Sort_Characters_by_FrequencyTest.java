import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class Sort_Characters_by_FrequencyTest {

    @Test
    void frequencySort1() {
        Sort_Characters_by_Frequency s = new Sort_Characters_by_Frequency();
        String str = "tree";
        String actual = s.frequencySort(str);
        String expected = "eert";
        assertEquals(actual, expected);
    }

    @Test
    void frequencySort2() {
        Sort_Characters_by_Frequency s = new Sort_Characters_by_Frequency();
        String str = "cccaaa";
        String actual = s.frequencySort(str);
        String expected = "aaaccc";
        assertEquals(actual, expected);
    }

    @Test
    void frequencySort3() {
        Sort_Characters_by_Frequency s = new Sort_Characters_by_Frequency();
        String str = "Aabb";
        String actual = s.frequencySort(str);
        String expected = "bbAa";
        assertEquals(actual, expected);
    }
}