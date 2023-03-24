package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={1,12,3,61,7,8,2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }

   static   void bubble(int[] arr){

        for(int i=0;i<arr.length;i++){
            boolean swapped=false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp =arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    swapped=true;
                }
            }

            if(swapped==false){
                break;
            }
        }


    }
}
