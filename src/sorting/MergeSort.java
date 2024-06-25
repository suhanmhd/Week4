package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};

        System.out.println(Arrays.toString(mergeSort(arr)));

    }


    static int[] mergeSort(int[]arr){

        if(arr.length<=1){
            return  arr;
        }

        int mid = arr.length/2;

        int[] left= mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));





       return merge(left,right);


    }

    static int[] merge(int[] left,int[] right){
        int[]newArr = new int[left.length+right.length];

        int i=0;
        int j=0;
        int k=0;

        while(i<left.length&&j<right.length){
             if(left[i]<right[j]){
                 newArr[k++]=left[i++];
             }
             else{
                 newArr[k++]=right[j++];
             }


        }

        while(i<left.length){
            newArr[k++]=left[i++];
        }
        while (j<right.length){
            newArr[k++]=right[i++];
        }

        return newArr;

    }



}
