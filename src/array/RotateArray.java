package array;

public class RotateArray {
    public static void main(String[] args) {

        int[] nums={1,2,3,4,5,6,7}; int k = 3;
        int n = nums.length;
        reverseArray(nums,0,n-1);
        reverseArray(nums,0,k);
        reverseArray(nums,k,n-1);

          for(int i=0;i<n;i++){
              System.out.print(nums[i]);
          }

    }


    public static void reverseArray(int[] nums,int start,int end){

        while(start<end){
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
        }

    }

    }
