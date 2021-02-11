import static org.junit.jupiter.api.Assertions.*;

class PrefixTest {

    @org.junit.jupiter.api.Test
    void longestCommonPrefix1() {
        Prefix prefix = new Prefix();
        String actual = prefix.longestCommonPrefix(new String[] {"flower", "flow", "flight"});
        String expected = "fl";
        assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    void longestCommonPrefix2() {
        Prefix prefix = new Prefix();
        String actual = prefix.longestCommonPrefix(new String[] {"dog", "racecar", "car"});
        String expected = "";
        assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    void longestCommonPrefix3() {
        Prefix prefix = new Prefix();
        String actual = prefix.longestCommonPrefix(new String[] {"cat", "carrot", "camel"});
        String expected = "ca";
        assertEquals(actual, expected);
    }

}