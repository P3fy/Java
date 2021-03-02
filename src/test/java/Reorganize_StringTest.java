import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Reorganize_StringTest {

    @Test
    public void reorganizeString1() {
        Reorganize_String s = new Reorganize_String();
        String str = "aab";
        String actual = s.reorganizeString(str);
        String expected = "aba";
        assertEquals(actual, expected);
    }

    @Test
    public void reorganizeString2() {
        Reorganize_String s = new Reorganize_String();
        String str = "aaab";
        String actual = s.reorganizeString(str);
        String expected = "";
        assertEquals(actual, expected);
    }

    @Test
    public void reorganizeString3() {
        Reorganize_String s = new Reorganize_String();
        String str = "bba";
        String actual = s.reorganizeString(str);
        String expected = "bab";
        assertEquals(actual, expected);
    }
}