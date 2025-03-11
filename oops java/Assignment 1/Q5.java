public class Q5 {
    public static void main(String[] args) {
        int a = 1, b = 2;
        
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping with temp: a = " + a + ", b = " + b);
        
        int c = 10;int d = 20;
        c = c + d;
        d = c - d;
        c= c - d;
        System.out.println("After swapping without temp: a = " + a + ", b = " + b);
    }

}
