package Recursion;

public class Permutaion {


    public static void main(String[] args) {
        permutations("","abc");
    }


    static  void permutations(String p , String up) {
        if (up.isEmpty()) {
            System.out.println("____"+p+"____");
            return;
        }

        char ch = up.charAt(0);
        for (int i = 0; i <=p.length(); i++) {
            String f = p.substring(0,i);
            System.out.println(f);
            String s = p.substring(i,p.length());
            System.out.println(s);
            permutations(f+ch+s,up.substring(1));
        }

    }
}
