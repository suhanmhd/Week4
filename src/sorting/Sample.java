package sorting;

import java.util.Arrays;

public class Sample {

    public static void main(String[] args) {
        String[] arr = {"abc", "ajith", "bike","sandi","sreeHari"};
        Arrays.sort(arr);
        int[] newarr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            String str = arr[i];
            int a = 0;
            for (int j = 0; j < str.length(); j++) {
                a += str.charAt(j);
            }
            newarr[i] = a;
        }

//        Arrays.sort(newarr);

        String temp = "sreeHari";
        int v = 0;
        for (int j = 0; j < temp.length(); j++) {
            v += temp.charAt(j);
        }
        System.out.println(v + "sssssssssss");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(newarr[i] + " " + arr[i]);
            System.out.println();
        }

        binarySearch(newarr, v, arr);
    }

    public static void binarySearch(int[] arr, int val, String[] a) {
        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (arr[mid] == val) {
                System.out.println("Found value: " + arr[mid] + " " + a[mid]);
                return;
            }
            if (arr[mid] < val) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        System.out.println("Not found");
    }
}
