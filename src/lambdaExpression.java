
interface Cab {
    public int bookCab(int a, int b);
}
public class lambdaExpression {

    public static void main(String[] args) {
        Cab cab = (a,b) ->{
            System.out.println(a+b);
            return a*b;
         };
        int ans =cab .bookCab(10,11);
        System.out.println(ans);
    }
}
