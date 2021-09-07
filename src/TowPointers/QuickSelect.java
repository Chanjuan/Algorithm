package TowPointers;
//给一个乱序数列，找到从大到小的顺序中第k大的数
public class QuickSelect {
   public static void main(String[] args) {
      int[] arr = new int[]{2,5,9,20,4,8,11};
      int target = 8;

      int k = quickSelect(arr, 0, arr.length - 1, target);
      System.out.println(k);
   }
   public static int quickSelect(int[] arr, int start, int end, int target){
      int left = start, right = end;
      int mid = (left + right)/2;
      int pivot = arr[mid];

      if(start == end){
         return arr[start];
      }
      while(left <= right){
         while(left <= right && arr[left] > pivot){
            left++;
         }
         while(left <=right && arr[right] <pivot){
            right--;
         }
         if(left <= right){
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
         }

      }
      if(start + target -1 <= right){
         return quickSelect(arr, start, right, target);
      }
      if(start + target -1 >= left){
         return quickSelect(arr, left, end, target - (left - start));
      }
      else{
         return arr[right + 1];
      }

   }
}
