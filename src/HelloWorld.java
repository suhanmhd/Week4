class HelloWorld<T,K> {
    T value;
    public void setValue(T val) {
        this.value = val;
    }


    public T getValue(){
        return this.value;
    }
    public static void main(String[] args) {
//        System.out.println("Try programiz.pro");
//        HelloWorld<Integer,String> hello = new HelloWorld<>();
//        hello.setValue(10);
//        System.out.println(hello.getValue());

        try {
            // Code that might throw an exception
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
            try {
                // Code that might throw another exception
                String str = null;
                System.out.println(str.length());
            } catch (NullPointerException ne) {
                System.out.println("Caught a NullPointerException: " + ne.getMessage());
            }
        }
    }
}