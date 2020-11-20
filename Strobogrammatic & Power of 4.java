public class Solution {
  public boolean isStrobogrammatic(String num) {
      HashMap<Character, Character> map = new HashMap<Character, Character>();
      map.put('1','1');
      map.put('0','0');
      map.put('8','8');
      map.put('6','9');
      map.put('9','6');
      int left = 0, right = num.length() - 1;
      while (left <= right) {
          if (!map.containsKey(num.charAt(left)) || !map.get(num.charAt(left)).equals(num.charAt(right))) {
              return false;
          }
          left ++;
          right --;
      }
      return true;
  }
}

class Solution{
public static boolean isPowerOfFour(int num) {
    while(num > 0){
        if(num == 1){
            return true;
        }
        if(num % 4 != 0){
            return false;
        }else{
            num = num / 4;
        }
    }

    return false;
}