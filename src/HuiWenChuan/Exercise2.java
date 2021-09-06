package HuiWenChuan;
//如果可以删除一个字符，判断是否为回文串
public class Exercise2 {
   class Pair{
      int left, right;
      public Pair(int left, int right){
         this.left = left;
         this.right = right;
      }
   }

   public boolean validPalindrome(String input, int start, int end){
      if(input.length() == 0 || input == null){
         return false;
      }
      Pair pair = findDifference(input, start, end);
      if(pair.left >= pair.right){
         return true;
      }
      else{
         return isPalindrome(input, pair.left, pair.right-1 ) ||
               isPalindrome(input, pair.left + 1, pair.right);
      }
   }
   public Pair findDifference(String input, int start, int end){
      while(start < end && input.charAt(start) == input.charAt(end)){
            start++;
            end--;
         }
      return new Pair(start, end);
   }
   public boolean isPalindrome(String input, int start, int end){
      Pair pair =findDifference(input, start, end);
      if(pair.left >= pair.right){
         return true;
      }
      return false;
   }
   public static void main(String[] args) {
      String input = "";
      Exercise2 sample = new Exercise2();
      System.out.println(sample.validPalindrome(input, 0, input.length()-1));
   }
}
