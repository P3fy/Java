import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSubArrayTest {

    @Test
    void maxSubArray1() {
        MaxSubArray subArray = new MaxSubArray();
        int actual = subArray.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        int expected = 6;
        assertEquals(actual, expected);
    }

    @Test
    void maxSubArray2() {
        MaxSubArray subArray = new MaxSubArray();
        int actual = subArray.maxSubArray(new int[]{1, 2, 3, 4});
        int expected = 10;
        assertEquals(actual, expected);
    }

    @Test
    void maxSubArray3() {
        MaxSubArray subArray = new MaxSubArray();
        int actual = subArray.maxSubArray(new int[]{-5, 3, 10, -4, 3, 2, -7});
        int expected = 14;
        assertEquals(actual, expected);
    }
}