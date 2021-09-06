package TowPointers;

public class QuickSort {
   public static void main(String[] args) {
      int[] arr = new int[]{3,6,10,4,8,9,1};
      if(arr.length == 0 || arr == null){
         return;
      }
      quickSort(arr, 0, arr.length-1);
      for(int i = 0; i < arr.length; i++){
         System.out.print(arr[i]+",");
      }
   }

   public static void quickSort(int[] arr, int start, int end){
      int left = start;
      int right = end;
      int pivot = arr[(start+end)/2]; //选取中间元素为pivot

      if(start >= end){  //递归终止条件
         return;
      }
      while(left <= right) { //这里写等于是为了防止stack overflow
         while (left <= right && arr[left] < pivot) {  //查找下一个left不小于pivot的数
            left++;
         }
         while (left <= right && arr[right] > pivot) {  //查找下一个right不大于pivot的数，之后进行交换
            right--;
         }
         if (left <= right) {
            arr = swap(arr, left, right);
            left++;
            right--;
         }
      }
      //检查左右两边还有没有未排序的数
      quickSort(arr, start, right); //注意这里right已经比left小了
      quickSort(arr, left, end);
      return;
   }

   public static int[] swap(int[] arr, int left, int right){
      int tmp = arr[left];
      arr[left] = arr[right];
      arr[right] = tmp;
      return arr;
   }
}
