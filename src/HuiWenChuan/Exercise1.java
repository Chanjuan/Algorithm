package HuiWenChuan;

public class Exercise1 {
   public static void main(String[] args) {
      String input="abb a";  //判断是否为回文串
      System.out.println(isPalindrome(input,0, input.length()-1));

   }
   public static boolean isPalindrome(String input, int start, int end){
      if(input.length()==0|| input == null){
         return false;
      }
      else{
         while(start < end){
            while(start < end && !isValid(input.charAt(start))){
               start++;
            }
            while(start < end && !isValid(input.charAt(end))){
               end--;
            }
            if(!isEqual(input.charAt(start), input.charAt(end))){
               return false;
            }
            start++;
            end--;
         }
         return true;
      }
   }

   public static boolean isValid(char a){
      return Character.isDigit(a) || Character.isLetter(a);
   }

   public static boolean isEqual(char a, char b){
      return Character.toLowerCase(a) == Character.toLowerCase(b);
   }
}
