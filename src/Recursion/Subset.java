package Recursion;

import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {
        String up="abc";
        //  System.out.println("aaaa");

        System.out.println(subset(" ",up));
    }

    public static  ArrayList<String> subset(String p,String up){

        if(up.isEmpty()){

            ArrayList<String>list = new ArrayList<>();
             list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subset(p+ch,up.substring(1));

        ArrayList<String> right =  subset(p,up.substring(1));

        left.addAll(right);
        return left;



        // public static String subset(String p,String up){

        //     if(up.isEmpty()){
        //         return "";
        //     }

        //     char ch = up.charAt(0);
        //     if(ch=='a'){
        //         return subset(p,up.substring(1));
        //     }
        //   return p+subset(p,up.substring(1));


    }
}
