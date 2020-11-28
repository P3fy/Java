package Ilnaz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    public void maxArea()
    {
        Solution solution = new Solution();
        int result = solution.maxArea(new int[]{4, 3, 2, 1, 4});

        Assertions.assertEquals(16, result);
    }
}