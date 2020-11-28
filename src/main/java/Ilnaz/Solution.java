package Ilnaz;

class Solution {
        public int maxArea(int[] height) {
            int maximum = Integer.MIN_VALUE, i = 0, j = height.length-1;
            while(i < j)
            {
                int min = Math.min(height[i], height[j]);
                maximum = Math.max(maximum, min * (j - i));
                if(height[i] < height[j])
                {
                    i++;
                }
                else
                {
                    j--;
                }
            }
            return maximum;
        }
    }
