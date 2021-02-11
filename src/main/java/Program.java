public class Program {
    public static void main(String[] args) {
        Prefix prefix = new Prefix();
        MaxSubArray subArray = new MaxSubArray();
        String a = prefix.longestCommonPrefix(new String[] {"flower", "flow", "flight"});
        int r = subArray.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        System.out.println(a);
        System.out.println(r);
    }
}
