package TowPointers;

public class MergeSort {
   public static void main(String[] args) {
      int[] arr = new int[]{2,4,1,6,9,10,3,5};
      int[] tmp = new int[arr.length];
      mergeSort(arr, 0, arr.length - 1, tmp);
      for(int i = 0;i < arr.length;i++){
         System.out.print(arr[i]+",");
      }
   }
   public static void mergeSort(int[] arr,int start, int end, int[] tmp){
      if(arr == null || arr.length ==0){
         return;
      }
      else{
         if(start >= end){
            return;
         }
         int mid = (start + end)/2;
         mergeSort(arr, start, mid, tmp);
         mergeSort(arr, mid + 1, end, tmp);
         merge(arr, start, end, tmp);
      }
   }

   public static void merge(int[] arr, int start, int end, int[] tmp){
      int mid = (start + end)/2;
      int leftIndex = start;
      int rightIndex = mid + 1;
      int index = leftIndex;
      while(leftIndex <= mid && rightIndex <= end){
         if(arr[leftIndex] < arr[rightIndex]){
            tmp[index++] = arr[leftIndex++];
         }
         else{
            tmp[index++] = arr[rightIndex++];
         }
      }
      while(leftIndex <= mid){ //判断左半部分是不是还有没有排序的数
         tmp[index++] = arr[leftIndex++];
      }
      while(rightIndex <= end){ //判断右半部分是不是还有没有排序的数
         tmp[index++] = arr[rightIndex++];
      }
      for(int i = start;i <= end;i++){ //记得将tmp中的数据复制到arr中
         arr[i] = tmp[i];
      }
   }
}
