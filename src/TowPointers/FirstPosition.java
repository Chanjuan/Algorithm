package TowPointers;
// For a giben sorted array and a target number, find the first index of
// this number in O(log n) time complexity.
// If the target number does not exist in the array, return -1
public class FirstPosition {
   public static void main(String[] args) {
      int[] arr = new int[]{1,2,3,3,3,3,3,5,7};
      int target = 3;
      int index = firstPosition(arr, target);
      System.out.println(index);
   }

   public static int firstPosition(int[] arr, int target){
      if(arr.length == 0 || arr == null){
         return -1;
      }

      int start = 0, end = arr.length -1;

      while(start + 1 < end){  //这里+1是为了防止死循环的出现，例如[2,2]查找2的情况
         int mid = (start + end)/2;
         int pivot = arr[mid];
         if(target == pivot){
            end = mid;  //根据题目不同的条件此处可能有变动
         }
         else if(pivot > target){   //前面没有返回值的话，后面的if一定要加上else，否则会出错
            end = mid;
         }
         else{
            start = mid;
         }
      }

      if(arr[start] == target){ ////如果arr中有多个连续重复的target元素，优先看start索引对应的元素
         return  start;
      }

      if(arr[end] == target){  //如果arr中只有一个target元素，则其索引应该等于start处
         return end;
      }
      return -1;
   }
}
