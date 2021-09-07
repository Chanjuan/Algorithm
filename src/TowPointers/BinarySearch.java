package TowPointers;

import java.util.Arrays;

//Find any position of a target number in a sorted array. Return -1 when target number doesn't exist.
public class BinarySearch {
   public static void main(String[] args) {
      int[] arr = new int[]{2,5,9,4,1,0};
      Arrays.sort(arr);
      int target = 4;
      int index = binarySearch(arr, 0, arr.length-1, target);
      System.out.println(index);
   }

   public static int binarySearch(int[] arr, int start, int end, int target){
      int mid = start + (end - start)/2;
      if(arr == null || arr.length == 0){
         return -1;
      }
      if(start > end){
         return -1;
      }
      if(arr[mid] == target){
         return mid;
      }
      if(arr[mid] > target){
         return binarySearch(arr, start, mid,target);
      }
      else{
         return binarySearch(arr, mid + 1, end, target);
      }
   }
}
